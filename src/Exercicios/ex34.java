package Exercicios;

import javax.swing.JOptionPane;

public class ex34 {
    public static void main(String[] args){
        int num, i, resultado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número q vc deseja ver a tabuada:"));

        for(i = 1; i <= 10; i++){
            resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}
