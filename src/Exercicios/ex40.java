package Exercicios;

import javax.swing.JOptionPane;

public class ex40 {
    public static void main(String[] args){
        int num1, num2, aux, i;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número: "));

        if(num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for(i = num2 + 1; i < num1; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i ==2 || i == 3 || i == 5 || i == 7){
                System.out.println(i);
            }
        }
    }
}
