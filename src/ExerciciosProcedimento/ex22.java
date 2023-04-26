package ExerciciosProcedimento;

import javax.swing.*;

public class ex22 {
    static int n1, n2;

    static void crescente() {
        if (n1 > n2){
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é " + n2 + " e " + n1);
        }else{
            JOptionPane.showMessageDialog(null, "A ordem crescente dos números é " + n1 + " e " + n2);
        }
    }
    public static void main(String[] args){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        crescente();
    }
}
