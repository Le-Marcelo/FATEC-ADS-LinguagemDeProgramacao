package Exercicios;

import javax.swing.JOptionPane;

public class ex14 {
    public static void main(String[] args){
        double ang1, ang2, ang3;

        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 1º angulo: "));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do 2º angulo: "));

        ang3 = 180 - (ang1 + ang2);

        JOptionPane.showMessageDialog(null, "O valor do terceiro angulo é igual a " + ang3);
    }
}
