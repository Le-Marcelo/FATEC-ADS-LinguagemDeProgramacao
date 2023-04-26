package Vetores;

import javax.swing.JOptionPane;

public class ex07 {
    public static void main(String[] args) {
        int num[] = new int[20], aux;
        boolean estaNoVetor = false;
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

        int numProcurado = Integer.parseInt(JOptionPane.showInputDialog("Procure um número:"));

        int menor = num[0];
        int maior = num[19];
        while(menor != maior){
            int meio = (menor + maior) / 2;
            if(numProcurado == meio){
                estaNoVetor = true;
                break;
            } else if(numProcurado > meio){
                menor = meio + 1;
            } else{
                maior = meio - 1;
            }
        }

        if(estaNoVetor){
            JOptionPane.showMessageDialog(null,"O número está no vetor!");
        }else{
            JOptionPane.showMessageDialog(null,"O número NÂO está no vetor");
        }
    }
}
