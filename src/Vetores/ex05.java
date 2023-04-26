package Vetores;

import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args) {
        int num[] = new int[20], resultado = 0;

        for(int i = 0; i < 20; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º número"));
        }
        
        for(int i = 0; i < 10; i++){
            resultado += num[i] - num[19 - i];
        }

        JOptionPane.showMessageDialog(null,"O resultado da somatória é igual a " + resultado);
    }
    
}
