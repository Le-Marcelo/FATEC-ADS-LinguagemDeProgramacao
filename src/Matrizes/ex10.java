package Matrizes;

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args) {
        long matriz[][] = new long[8][8], soma = 0, casa = 0;

        //Gerar a matriz
        for(int linha = 0; linha < 8; linha ++){
            for(int coluna = 0; coluna < 8; coluna ++){
                matriz[linha][coluna] = (long) Math.pow(2, casa);
                casa++;
            }
        }

        for(int linha = 0; linha < 8; linha++){
            for(int coluna = 0; coluna < 8; coluna ++){
                soma += matriz[linha][coluna];
            }
        }

        JOptionPane.showMessageDialog(null, "A soma das casas é igual a " + soma); //Estouro acaba retornando "-2"
    }
    
}
