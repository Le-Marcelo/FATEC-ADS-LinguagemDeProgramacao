package Exercicios;

import javax.swing.JOptionPane;

public class ex18 {
    public static void main(String[] args){
        int n1, n2, dif;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        if(n1 > n2){
            dif = n1 - n2;
        }else{
            dif = n2 - n1;
        }

        JOptionPane.showMessageDialog(null, "A diferença entre o maior e o menor número é de " + dif);
    }
}
