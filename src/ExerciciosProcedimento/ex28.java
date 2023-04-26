package ExerciciosProcedimento;

import javax.swing.*;

public class ex28 {
    static double precoInicial, media, precoFinal;

    static void calculoPreco(){
        if(media < 500 && precoInicial < 30){
            precoFinal = precoInicial + (precoInicial * 0.10);
        }else if(media < 1000 && precoInicial < 80){
            precoFinal = precoInicial + (precoInicial * 0.15);
        }else if(media >= 1000 && precoInicial >= 80){
            precoFinal = precoInicial - (precoInicial * 0.05);
        }else{
            precoFinal = precoInicial;
        }
        JOptionPane.showMessageDialog(null, "O valor do produto pós alterações ficou em R$" + precoFinal);
    }
    public static void main(String[] args){
        precoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
        media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal de vendas desse produto: "));
        calculoPreco();
    }
}
