package ExerciciosFuncao;

import javax.swing.*;

public class ex42 {
    static boolean calcSerie(boolean sla){
        double num1, num2 = 1, resultado = 0;

        for(num1 = 1; num1 <= 50; num1++){
            resultado += num1 / num2;
            num2 += 2;
        }

        JOptionPane.showMessageDialog(null, String.format("O resultado da série é igual a %.2f", resultado));
        return true;
    }
    public static void main(String[] args){
        calcSerie(true);
    }
}
