package Recursividade;

import javax.swing.*;

public class ex01 {
    static int calcSerie(int num){
        if(num != 100){
            int resultado = num + calcSerie(num + 1);
            return resultado;
        }else{
            return 100;
        }

    }
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null, "O resultado da série é " + calcSerie(1));
    }
}
