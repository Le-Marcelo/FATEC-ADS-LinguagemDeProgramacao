package ExerciciosFuncao;

import javax.swing.*;

public class ex38 {
    static boolean maiorMenor(int quantidade){
        int num, maior = -1, menor = -1;

        for(int i = 1; i <= quantidade; i++){
            do{
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + i + "º número (Inteiro e positivo): "));
                if(num < 0){
                    JOptionPane.showMessageDialog(null, "Digite um número positivo!");
                }else if(maior == -1 && menor == -1){
                    maior = num;
                    menor = num;
                }
            }while(num < 0);

            if(num > maior){
                maior = num;
            }else if(num < menor){
                menor = num;
            }
        }

        JOptionPane.showMessageDialog(null, "O maior número digitado foi " + maior + " e o menor número foi " + menor);
        return true;
    }
    public static void main(String[] args){
        maiorMenor(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a ser digitados: ")));
    }
}
