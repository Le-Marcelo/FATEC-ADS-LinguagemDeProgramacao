package Vetores;

import javax.swing.JOptionPane;

public class ex04 {
    public static void main(String[] args) {
        int num[] = new int[30], media = 0, acimaDaMedia = 0, j = 0;
        String abaixoDaMedia = "[ ";
        
        //Preencher o vetor
        for(int i = 0; i < 30; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da " + (i + 1) + "ª nota: "));
        }

        for(int i: num){
            media += i;
        }
        media /= 30;

        for(int i: num){
            if(i > media){
                acimaDaMedia++;
            }else if(i < media){
                abaixoDaMedia += j + " ";
                j++;
            }
        }
        abaixoDaMedia += " ]";

        JOptionPane.showMessageDialog(null,"A média do grupo foi de " + media + ", o número de pessoas que estão acima da média é " + acimaDaMedia + " e as posições de quem está abaixo da média é: " + abaixoDaMedia);
    }
}
