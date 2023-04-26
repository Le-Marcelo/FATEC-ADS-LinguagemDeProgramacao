package Exercicios;

import javax.swing.JOptionPane;

public class ex32 {
    public static void main(String[] args){
        int num, fatorial = 1, i;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um número: "));

        for(i = num; i >= 1; i--){
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O valor do fatorial desse número é de " + fatorial);
    }
}
