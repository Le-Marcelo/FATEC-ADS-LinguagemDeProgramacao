package Vetores;

import javax.swing.*;

public class ex03 {
    public static void main(String[] args){
        int vt1[] = new int[3], vt2[] = new int[3], vt3[] = new int[6];

        //Preenchendo os 2 primeiros vetores
        for(int i = 0; i < 3; i++){
            vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º número"));
        }
        for(int i = 0; i < 3; i++){
            vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 4) + "º número"));
        }

        for(int i = 0; i < 6; i++){
            if(i < 3){
                vt3[i] = vt1[i];
            }else{
                vt3[i] = vt2[i - 3];
            }
        }

        for(int i: vt3){
            System.out.println(i);
        }
    }
}
