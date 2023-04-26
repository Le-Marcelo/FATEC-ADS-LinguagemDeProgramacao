package Exercicios;

import javax.swing.JOptionPane;

public class ex23 {
    public static void main(String[] args){
        int n1, n2 , n3, n4;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 3º número: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 4º número: "));

        if(n4 < n1){
            JOptionPane.showMessageDialog(null, n4 + ", " + n1 + ", " + n2 + ", " + n3);
        }else if(n4 < n2){
            JOptionPane.showMessageDialog(null, n1 + ", " + n4 + ", " + n2 + ", " + n3);
        }else if(n4 < n3){
            JOptionPane.showMessageDialog(null, n1 + ", " + n2 + ", " + n4 + ", " + n3);
        }else{
            JOptionPane.showMessageDialog(null, n1 + ", " + n2 + ", " + n3 + ", " + n4);
        }
    }
}
