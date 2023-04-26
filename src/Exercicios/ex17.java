package Exercicios;

import javax.swing.JOptionPane;

public class ex17 {
    public static void main(String[] args){
        double tempo, vel, litros;

        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto tempo durou o percurso em horas: "));
        vel = Double.parseDouble(JOptionPane.showInputDialog("Digite qual foi a velocidade média: "));

        litros = (tempo * vel) / 12;

        JOptionPane.showMessageDialog(null, "A quantidade de litros que será gasta é " + litros);
    }
}
