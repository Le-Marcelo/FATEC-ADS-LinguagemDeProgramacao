package ExerciciosProcedimento;

import javax.swing.*;

public class ex25 {
    static int horaInicial, horaFinal, horaTotal = 0, minInicial, minFinal, minTotal;

    static void tempoJogo(){
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
    public static void main(String[] args){
        horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo começou: "));
        minInicial = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo começou: "));
        horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora em que o jogo terminou: "));
        minFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos em que o jogo terminou: "));
        tempoJogo();
    }
}
