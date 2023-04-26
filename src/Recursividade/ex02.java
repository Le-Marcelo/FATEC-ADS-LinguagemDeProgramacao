package Recursividade;

import javax.swing.*;

public class ex02 {
    static int calcSerie(int num){
        if(num != 1){
            int resultado = num + calcSerie(num - 1);
            return resultado;
        }else{
            return 1;
        }
    }

    public static void main(String[] args){
        //Nesse exercicio está implicito que n TEM que ser maior ou igual a 1
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        JOptionPane.showMessageDialog(null, "O resultado da série é igual a " + calcSerie(num));
    }
}
