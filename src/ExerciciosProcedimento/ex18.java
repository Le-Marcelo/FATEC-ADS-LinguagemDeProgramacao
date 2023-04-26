package ExerciciosProcedimento;

import javax.swing.JOptionPane;

public class ex18 {
    static int n1, n2, dif;

    static void calculoDiferenca(){
        if(n1 > n2){
            dif = n1 - n2;
        }else{
            dif = n2 - n1;
        }
    }
    public static void main(String[] args){
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        calculoDiferenca();
        JOptionPane.showMessageDialog(null, "A diferença entre o maior e o menor número é de " + dif);
    }
}
