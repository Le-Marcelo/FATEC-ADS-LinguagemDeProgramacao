package ExerciciosFuncao;

import javax.swing.*;

public class ex44 {
    static int potencia(int base, int expoente){
        int resultado = 0;
        //resultado = Math.pow(base, expoente);

        if (expoente != 1){
            resultado = base;
            while(expoente > 1){
                resultado *= base;
                expoente -= 1;
            }
        }
        return resultado;
    }
    public static void main(String[] args){
        int base, expoente;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));

        JOptionPane.showMessageDialog(null, "O resultado dessa potência é igual a " + potencia(base, expoente));
    }
}
