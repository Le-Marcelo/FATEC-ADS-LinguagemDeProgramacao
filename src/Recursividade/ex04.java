package Recursividade;

import javax.swing.JOptionPane;

public class ex04 {
    static double calcSerie(double num1, double num2){
        if(num1 != 1){
            double resultado = (num1 / num2) + calcSerie(num1 - 1, num2 + 1);
            return resultado;
        }else{
            double resultado = 1 / num1;
            return resultado;
        }
    }
    public static void main(String[] args){
        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N: "));
        JOptionPane.showMessageDialog(null, "O resultado da série é igual a " + calcSerie(num, 1));
    }
}
