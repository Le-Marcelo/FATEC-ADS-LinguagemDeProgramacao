package Exercicios;

import javax.swing.JOptionPane;

public class ex38 {
    public static void main(String[] args){
        int num, maior = -1, menor = -1, i;

        for(i = 1; i <= 100; i++){
            do{
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número (Inteiro e positivo): "));
                if(num < 0){
                    JOptionPane.showMessageDialog(null, "Digite um número positivo!");
                }else if(maior == -1 && menor == -1){
                    maior = num;
                    menor = num;
                }
            }while(num < 0);

            if(num > maior){
                maior = num;
            }else if(num < menor){
                menor = num;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número digitado foi " + maior + " e o menor número foi " + menor);
    }
}
