package Exercicios;

import javax.swing.JOptionPane;

public class ex06 {
    public static void main(String[] args){
        double X, Y, aux;
        
        X = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X: "));
        Y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y: "));
        
        aux = X;
        X = Y;
        Y = aux;
        
        JOptionPane.showMessageDialog(null, "Após a troca o valor de X é " + X + " e o valor de Y é " + Y);
    }
}
