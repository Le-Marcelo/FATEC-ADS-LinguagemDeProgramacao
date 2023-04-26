package Exercicios;

import javax.swing.JOptionPane;

public class ex27 {
    public static void main(String[] args){
        double numVoltas, metros, minutos, velMedia;

        numVoltas = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de voltas dadas: "));
        metros = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos metros possui o percurso: "));
        minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite em quantos minutos o percurso foi concluido: "));

        velMedia = ((metros / 1000) * numVoltas) / (minutos / 60);

        JOptionPane.showMessageDialog(null, "A velocidade média atingida foi de " + velMedia + "Km/h");

    }
}
