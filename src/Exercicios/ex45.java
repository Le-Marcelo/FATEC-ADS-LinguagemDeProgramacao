package Exercicios;

import javax.swing.JOptionPane;

public class ex45 {
    public static void main(String[] args){
        double num, resultado = 0;

        for(num = 1; num <= 15; num++){
            resultado += num / (num * num);
        }

        JOptionPane.showMessageDialog(null, String.format("O resultado da série é igual a %.2f", resultado));
    }
}
