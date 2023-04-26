package Recursividade;

import javax.swing.JOptionPane;

public class ex05 {
    static int fatorial(int num){
        if(num != 1){
            int resultado = num * fatorial(num - 1);
            return resultado;
        }else{
            return 1;
        }
    }
    static int calcSerie(int num){
        if(num != 1){
            int resultado = num + fatorial(calcSerie(num - 1));
            return resultado;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N: "));
        JOptionPane.showMessageDialog(null,"O resultado da série é igual a " + calcSerie(num));
    }
    
}
