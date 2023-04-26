package ExerciciosFuncao;

import javax.swing.*;

public class ex32 {
    static int fatorial(int num){
        int resultado = 1;
        for(int i = num; i >= 1; i--){
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um número: "));
        JOptionPane.showMessageDialog(null, "O valor do fatorial desse número é de " + fatorial(num));
    }
}
