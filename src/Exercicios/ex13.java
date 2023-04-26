package Exercicios;

import javax.swing.JOptionPane;

public class ex13 {
    public static void main(String[] args){
        double kg, dias;

        kg = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do alimento em quilos: "));

        dias = (kg * 1000) / 50;

        JOptionPane.showMessageDialog(null, "Esse alimento irá durar " + dias + "dias");
    }
}
