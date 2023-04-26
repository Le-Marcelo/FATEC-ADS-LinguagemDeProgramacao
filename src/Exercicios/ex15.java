package Exercicios;

import javax.swing.JOptionPane;

public class ex15 {
    public static void main(String[] args){
        double cat1, cat2, hip;

        cat1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º cateto: "));
        cat2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º cateto: "));

        hip = Math.sqrt(cat1 * cat1 + cat2 * cat2);

        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é igual a " + hip);
    }
}
