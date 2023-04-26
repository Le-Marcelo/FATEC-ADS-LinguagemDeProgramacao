package ExerciciosFuncao;

import javax.swing.*;

public class ex36 {
    static int fatorial(int num){
        int resultado = 1;
        for(int i = 1; i <= num; i++){
            resultado *= i;
        }
        return resultado;
    }

    static double calculoSerie(int num){
        double resultado = 0;
        for(int i = 1; i <= num; i++){
            resultado += 1f / fatorial(i);
        }
        return resultado;
    }

    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        JOptionPane.showMessageDialog(null, String.format("O resultado da série é igual a %.2f", calculoSerie(num)));
    }
}
