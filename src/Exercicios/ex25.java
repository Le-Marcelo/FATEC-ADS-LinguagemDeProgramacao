package Exercicios;

import javax.swing.JOptionPane;

public class ex25 {
    public static void main(String[] args){
        int horaInicial, horaFinal, horaTotal, minInicial, minFinal, minTotal;

        horaTotal = 0;

        horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo começou: "));
        minInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo começou: "));
        horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo terminou: "));
        minFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo terminou: "));

        if(minInicial + minFinal > 59){
            minTotal = (minInicial + minFinal) - 60;
            horaTotal = 1;
        }else{
            minTotal = minInicial + minFinal;
        }

        if(horaInicial > horaFinal){
            horaTotal = (24 - horaInicial) + horaFinal + horaTotal;
        }else{
            horaTotal = (horaFinal - horaInicial) + horaTotal;
        }

        JOptionPane.showMessageDialog(null, "O jogo teve " + horaTotal + " horas e " + minTotal + " minutos");
    }
}
