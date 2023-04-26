package Exercicios;

import javax.swing.JOptionPane;

public class ex36 {
    public static void main(String[] args){
        double num, i, j, fatorial, resultado = 0;

        num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N:"));

        for(i = 1; i <= num; i++){
            fatorial = 1;

            for(j = 1; j <= i; j++){
                fatorial *= j;
            }

            resultado += 1 / fatorial;
        }

        JOptionPane.showMessageDialog(null, String.format("O resultado da série é igual a %.2f", resultado));
    }
}
