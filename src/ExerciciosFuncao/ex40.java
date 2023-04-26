package ExerciciosFuncao;

import javax.swing.*;

public class ex40 {
    static boolean primosEntre(int num1, int num2){
        int aux;

        if(num1 < num2){
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        for(int i = num2 + 1; i < num1; i++){
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i ==2 || i == 3 || i == 5 || i == 7){
                System.out.println(i);
            }
        }
        return true;
    }
    public static void main(String[] args){
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número: "));

        primosEntre(num1, num2);
    }
}
