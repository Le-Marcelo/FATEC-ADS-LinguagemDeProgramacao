package Vetores;

import javax.swing.*;

public class ex01 {
    public static void main(String[] args){
        int num[] = new int[50], j = 0, somaImpar = 0;
        double media = 0;

        //Preenchendo o vetor
        for(int i = 0; i < 50; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º número: "));
        }

        //Checando condições
        for(int i = 0; i < num.length; i++){
            if(num[i] > 10 && num[i] < 200){
                media += num[i];
                j++;
            }
            if(num[i] % 2 != 0){
                somaImpar += num[i];
            }
        }

        media /= j;

        JOptionPane.showMessageDialog(null, "A média dos números entre 10 e 200 é igual a " + media + " e a soma dos números ímpares é " + somaImpar);
    }
}
