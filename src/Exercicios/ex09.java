package Exercicios;

import javax.swing.JOptionPane;

public class ex09 {
    public static void main(String[] args){
        int A, B, resultado;

        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        resultado = (A * A) + (B * B);

        JOptionPane.showMessageDialog(null, "O resultado da soma dos quadrados dos valores é igual a " + resultado);
    }
}
