package Vetores;

import javax.swing.JOptionPane;

public class ex06 {
    public static void main(String[] args) {
        int num[] = new int[20], aux;
        String resultado = "[ ";
        for(int i = 0; i < 20; i++){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " + (i + 1) + "º número"));
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num.length - i - 1; j++){
                if(num[j] > num[j + 1]){
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;
                }
            }
        }

        for(int i: num){
            resultado += i + " ";
        }
        resultado += "]";

        JOptionPane.showMessageDialog(null,"O vetor ordenado é \n" + resultado);
    }
}
