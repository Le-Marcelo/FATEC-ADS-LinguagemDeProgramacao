package Exercicios;

import javax.swing.JOptionPane;

public class ex24 {
    public static void main(String[] args){
        int n1;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));

        if(n1 % 2 == 0 && n1 % 3 == 0){
            JOptionPane.showMessageDialog(null,"Esse número é divisivel por 2 e 3!");
        }else{
            JOptionPane.showMessageDialog(null,"Esse número NÃO é divisivel por 2 e 3.");
        }
    }
}
