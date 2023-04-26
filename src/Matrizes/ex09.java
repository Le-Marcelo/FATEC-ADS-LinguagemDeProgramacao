package Matrizes;

import javax.swing.JOptionPane;
import java.util.Random;

public class ex09 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[4][4];
        String resposta = "";
        
        //Gerar a matriz
        for(int linha = 0; linha < 4; linha ++){
            for(int coluna = 0; coluna < 4; coluna ++){
                if(linha == coluna){
                    matriz[linha][coluna] = (int) Math.pow(4, linha);
                }else{
                    matriz[linha][coluna] = gerador.nextInt(11);
                }
            }
        }

        //Formatar a resposta
        for(int linha = 0; linha < 4; linha ++){
            resposta += "[ ";
            for(int coluna = 0; coluna < 4; coluna ++){
                resposta += matriz[linha][coluna] + ", ";
            }
            resposta += "]\n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }
}
