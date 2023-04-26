package Vetores;

import javax.swing.*;

public class ex02 {
    public static void main(String[] args){
        int num[] = new int[10], maior = 0, menor = 0, media = 0;
        boolean primeiro = true;

        //Preencher o vetor
        for(int i = 0; i < 10; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º número"));
        }

        for(int i: num){
            //Teste para saber o maior e menor
            if(primeiro){
                maior = i;
                menor = i;
                primeiro = false;
            }else if(i > maior){
                maior = i;
            }else if(i < menor){
                menor = i;
            }

            media += i;
        }

        media /= 10;

        JOptionPane.showMessageDialog(null, "O maior e menor número são respectivamente " + maior + " e " + menor + ". A média dos números digitados é igual a " + media);
    }
}
