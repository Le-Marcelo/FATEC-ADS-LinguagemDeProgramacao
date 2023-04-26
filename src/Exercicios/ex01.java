package Exercicios;

import javax.swing.JOptionPane;

public class ex01 {
    public static void main(String[] args){
        int lado, area;
    
        lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        area = lado * lado;
        
        JOptionPane.showMessageDialog(null, "O valor da área desse quadrado é igual a: " + area);
        
        
    }
    
}
