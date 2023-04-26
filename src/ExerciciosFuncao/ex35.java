package ExerciciosFuncao;

import javax.swing.*;

public class ex35 {
    static int somaImpar(int num1, int num2){
        int aux, resultado = 0;
        if(num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for(int i = num2 + 1; i < num1; i++){
            if(i % 2 != 0){
                resultado += i;
            }
        }

        return resultado;
    }

    public static void main(String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        JOptionPane.showMessageDialog(null, "O resultado da somatória dos números ímpares entre esses números é de " + somaImpar(num1, num2));
    }
}
