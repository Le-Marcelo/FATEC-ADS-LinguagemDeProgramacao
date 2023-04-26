package Exercicios;

import javax.swing.JOptionPane;

public class ex26 {
    public static void main(String[] args){
        int n1, n2, aux;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));

        if(n2 > n1){
            aux = n1;
            n1 = n2;
            n2 = aux;
        }

        if(n1 % n2 == 0){
            JOptionPane.showMessageDialog(null, "O maior é múltiplo do menor");
        }else{
            JOptionPane.showMessageDialog(null, "O maior NÃO é múltiplo do menor");
        }
    }
}
