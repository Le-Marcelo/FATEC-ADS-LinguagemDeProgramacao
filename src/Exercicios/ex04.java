package Exercicios;

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args){
        int C, F;
        
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em Celsius: "));
        F = (9 * C + 160) / 5;
        
        JOptionPane.showMessageDialog(null, "A temperatura digitada equivale a " + F + "º Fahrenheit");
    }
}
