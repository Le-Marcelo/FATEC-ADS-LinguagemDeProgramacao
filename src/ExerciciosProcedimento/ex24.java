package ExerciciosProcedimento;

import javax.swing.*;

public class ex24 {
    static int n1;

    static void testeDivisao(){
        if(n1 % 2 == 0 && n1 % 3 == 0){
            JOptionPane.showMessageDialog(null,"Esse número é divisivel por 2 e 3!");
        }else{
            JOptionPane.showMessageDialog(null,"Esse número NÃO é divisivel por 2 e 3.");
        }
    }
    public static void main(String[] args){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        testeDivisao();
    }
}
