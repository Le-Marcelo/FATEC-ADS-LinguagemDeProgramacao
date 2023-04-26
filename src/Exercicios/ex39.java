package Exercicios;

import javax.swing.JOptionPane;

public class ex39 {
    public static void main(String[] args){
        int  casa;
        double graos = 1;

        for(casa = 1; casa <= 64; casa++){
            graos *= 2;
        }

        JOptionPane.showMessageDialog(null, "A quantidade de graos no tabuleiro é de " + graos);
    }
}
