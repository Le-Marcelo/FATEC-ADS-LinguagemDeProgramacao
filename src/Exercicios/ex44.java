package Exercicios;

import javax.swing.JOptionPane;

public class ex44 {
    public static void main(String[] args){
        int base, expoente;
        double resultado = 0;

        base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base:"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do expoente:"));

        //resultado = Math.pow(base, expoente);

        if (expoente != 1){
            resultado = base;
            while(expoente > 1){
                resultado *= base;
                expoente -= 1;
            }
        }

        JOptionPane.showMessageDialog(null, "O resultado dessa potência é igual a " + resultado);
    }
}
