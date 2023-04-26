package Exercicios;

import javax.swing.JOptionPane;

public class ex43 {
    public static void main(String[] args){
        int ana, maria = 150, ano = 0;

        for(ana = 110; ana <= maria; ana += 3){
            maria += 2;
            ano += 1;
        }

        JOptionPane.showMessageDialog(null, "Ana levará " + ano + " anos para ser maior que maria");
    }
}
