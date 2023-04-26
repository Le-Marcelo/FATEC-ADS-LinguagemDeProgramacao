package ExerciciosFuncao;

import javax.swing.*;

public class ex45 {
    static boolean calcSerie(boolean sla){
        double num, resultado = 0;

        for(num = 1; num <= 15; num++){
            resultado += num / (num * num);
        }

        JOptionPane.showMessageDialog(null, String.format("O resultado da série é igual a %.2f", resultado));

        return true;
    }
    public static void main(String[] args){
        calcSerie(true);
    }
}
