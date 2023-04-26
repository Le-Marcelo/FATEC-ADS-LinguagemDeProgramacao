package Exercicios;

import javax.swing.JOptionPane;

public class ex21 {
    public static void main(String[] args){
        double n1, n2, n3, n4, media;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 1ª nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 2ª nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 3ª nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da 4ª nota: "));

        media = (n1 + n2 + n3 + n4) / 4;

        if(media < 3){
            JOptionPane.showMessageDialog(null, "RETIDO");
        }else if(media < 6){
            JOptionPane.showMessageDialog(null, "EXAME");
        }else{
            JOptionPane.showMessageDialog(null, "APROVADO");
        }

    }
}
