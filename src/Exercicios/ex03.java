package Exercicios;

import javax.swing.JOptionPane;

public class ex03 {
    public static void main(String[] args){
        double base, altura, area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo: "));
        area = (base * altura) / 2;
        
        JOptionPane.showMessageDialog(null, "A área do triâgulo é igual a: " + area);
    }
}
