package Exercicios;

import javax.swing.JOptionPane;

public class ex19 {
    public static void main(String[] args){
        Double n1, n2, maior;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        if(n1 > n2){
            maior = n1;
        }else{
            maior = n2;
        }

        JOptionPane.showMessageDialog(null, "O maior valor digitado é " + maior);
    }
}
