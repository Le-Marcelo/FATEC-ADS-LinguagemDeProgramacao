package Exercicios;

import javax.swing.JOptionPane;

public class ex11 {
    public static void main(String[] args){
        double raio,comprimento;

        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio do círculo: "));

        comprimento = 2 * 3.14 * raio;

        JOptionPane.showMessageDialog(null, "O comprimento do círculo é igual a " + comprimento);
    }
}
