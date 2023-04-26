package Exemplos;

//Importa as bibliotecas usadas na classe
import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args){
        int A,B,C;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        
        C = A + B;
        
        JOptionPane.showMessageDialog(null, "O valor de C é igual a: " + C);
    }
}
