package ExerciciosFuncao;

import javax.swing.*;

public class ex33 {
    static double calculoSerie(double num){
        double resultado = 0;
        for(int i = 1; i <= num; i++){
            resultado += 1f / i;
            System.out.println(resultado);
        }
        return resultado;
    }
    public static void main(String[] args){
        double num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        JOptionPane.showMessageDialog(null, String.format("O valor do resultado da série é %.2f" , calculoSerie(num)));
    }
}
