package Matrizes;

import javax.swing.JOptionPane;

public class ex08 {
    public static void main(String[] args) {
        int vendas[][] = new int[4][3], quantSemana[] = new int[4], prodMensal[] = new int[3], total = 0;

        //Preencher a matriz(Partindo das colunas)
        for(int coluna = 0; coluna < 3; coluna ++){
            for(int linha = 0; linha < 4; linha ++){
                vendas[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Digite o nº de vendas que o " + (coluna + 1) + "º produto teve na " + (linha + 1) + "ª semana:"));
            }
        }

        for(int linha = 0; linha < 4; linha++){
            for(int coluna = 0; coluna < 3; coluna ++){
                prodMensal[coluna] += vendas[linha][coluna];    //A quantidade de cada produto vendido no mês
                quantSemana[linha] += vendas[linha][coluna];    //A quantidade de produtos vendidos por semana
                total += vendas[linha][coluna];                 //O total de produtos vendidos no mês
            }
        }

        JOptionPane.showMessageDialog(null, "Os produtos A, B e C venderam nesse mês respectivamente: " + prodMensal[0] + ", " + prodMensal[1] + " e " + prodMensal[2]);
        JOptionPane.showMessageDialog(null, "A quantidade de produtos vendidos por semana foi: " + quantSemana[0] + ", " + quantSemana[1] + ", " + quantSemana[2] + " e " + quantSemana[3]);
        JOptionPane.showMessageDialog(null, "O total de produtos vendidos no mês foi " + total);
    }
}
