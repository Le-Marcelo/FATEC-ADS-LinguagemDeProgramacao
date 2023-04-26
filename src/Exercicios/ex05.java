package Exercicios;

import javax.swing.JOptionPane;

public class ex05 {
    public static void main(String[] args){
        double A, B, C, delta, R1, R2;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de C: "));
        
        delta = (B * B) - (4 * A * C);
        R1 = (- B + Math.sqrt(delta)) / (2 * A);
        R2 = (- B - Math.sqrt(delta)) / (2 * A);
        
        JOptionPane.showMessageDialog(null, "O valor das raízes reais são: " + R1 + " e " + R2);
    }
}
