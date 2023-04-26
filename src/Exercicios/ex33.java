package Exercicios;

import javax.swing.JOptionPane;

public class ex33 {
    public static void main(String[] args){
        double i, num, resultado = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));

        for(i = 1; i <= num; i++){
            resultado += 1 / i;
        }

        JOptionPane.showMessageDialog(null, String.format("O valor do resultado da série é %.2f" , resultado));
    }
}
