package Exercicios;

import javax.swing.JOptionPane;

public class ex10 {
    public static void main(String[] args){
        double A, B, resultado;

        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primero número: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        
        resultado = A - B;

        JOptionPane.showMessageDialog(null, "A diferença entre " + A + " e " + B + " é " + resultado);
    }
}
