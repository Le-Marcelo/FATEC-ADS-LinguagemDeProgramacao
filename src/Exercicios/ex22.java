package Exercicios;

import javax.swing.JOptionPane;

public class ex22 {
    public static void main(String[] args){
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é " + n2 + " e " + n1);
        }else{
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é " + n1 + " e " + n2);
        }

    }
}
