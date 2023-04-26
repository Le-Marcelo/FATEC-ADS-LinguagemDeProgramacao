package ExerciciosFuncao;

import javax.swing.*;

public class ex39 {
    static boolean xadrez(boolean sla){
        int  casa;
        double graos = 1;

        for(casa = 1; casa <= 64; casa++){
            graos *= 2;
        }

        JOptionPane.showMessageDialog(null, "A quantidade de graos no tabuleiro é de " + graos);
        return true;
    }
    public static void main(String[] args){
        xadrez(true);
    }
}
