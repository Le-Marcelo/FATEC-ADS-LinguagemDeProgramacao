package Exercicios;

import javax.swing.JOptionPane;

public class ex37 {
    public static void main(String[] args){
        int num, num1 = 1, num2 = 1, num3, i, resultado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o N'nésimo termo da sequência de fibonacci:"));

        for(i = 1; i <= num; i++){
            if(i == 1 || i == 2){
                System.out.println("1");
            }else{
                resultado = num1 + num2;
                System.out.println(resultado);
                num3 = num1;
                num1 = num2;
                num2 = num3 + num2;
            }
        }
    }
}
