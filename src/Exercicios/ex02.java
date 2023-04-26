package Exercicios;

import javax.swing.JOptionPane;

public class ex02 {
    public static void main(String[] args){
        double salario;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário atual: "));
        salario = salario + (salario / 100 * 15);
        
        JOptionPane.showMessageDialog(null, "O valor do salário pós reajuste será de: R$" + salario);
    }
}
