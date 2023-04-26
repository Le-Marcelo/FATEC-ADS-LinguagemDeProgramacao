package Recursividade;

import javax.swing.*;

public class ex03 {
    static double calcSerie(double num){
        if(num != 1){
            double resultado = (1 / num) + calcSerie(num - 1);
            return resultado;
        }else{
            return 1;
        }
    }
    public static void main(String[] args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N: "));
        JOptionPane.showMessageDialog(null, "O resultado da série é igual a " + calcSerie(num));    }
}
