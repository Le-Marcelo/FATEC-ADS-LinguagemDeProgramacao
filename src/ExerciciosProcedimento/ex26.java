package ExerciciosProcedimento;

import javax.swing.*;

public class ex26 {
    static int n1, n2, aux;

    static void testeMultiplicacao(){
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
    public static void main(String[] args){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
        testeMultiplicacao();
    }
}
