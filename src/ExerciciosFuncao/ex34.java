package ExerciciosFuncao;

import javax.swing.*;

public class ex34 {
    static int multiplicacao(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número q vc deseja ver a tabuada:"));

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + multiplicacao(num, i));
        }
    }
}
