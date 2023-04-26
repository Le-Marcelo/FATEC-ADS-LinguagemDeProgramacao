package Exercicios;

import javax.swing.JOptionPane;

public class ex08 {
    public static void main(String[] args){
        double deposito, valorFinal;

        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito: "));

        valorFinal = deposito + (deposito / 100 * 1.3);

        JOptionPane.showMessageDialog(null,"O valor após um mês será de R$" + valorFinal);
    }    
}
