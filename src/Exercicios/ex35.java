package Exercicios;

import javax.swing.JOptionPane;

public class ex35 {
    public static void main(String[] args){
        int num1, num2, i, aux, resultado = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo número: "));

        if(num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for(i = num2 + 1; i < num1; i++){
            if(i % 2 != 0){
                resultado += i;
            }
        }

        JOptionPane.showMessageDialog(null, "O resultado da somatória dos números ímpares entre esses números é de " + resultado);
    }
}
