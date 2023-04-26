package ExerciciosProcedimento;

import javax.swing.*;

public class ex29 {
    static int tipo;
    static double valorInicial, valorFinal;

    static void calculoInvestimento(){
        switch(tipo){
            case 1:
                valorFinal = valorInicial + (valorInicial * 0.03);
                JOptionPane.showMessageDialog(null, "Após 1 mês você terá um total de R$" + valorFinal);
                break;

            case 2:
                valorFinal = valorInicial + (valorInicial * 0.05);
                JOptionPane.showMessageDialog(null, "Após 1 mês você terá um total de R$" + valorFinal);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Tipo de depósito inválido");
                break;
        }
    }
    public static void main(String[] args){
        tipo = Integer.parseInt(JOptionPane.showInputDialog("Digite qual depósito quer realizar (1 = poupança ou 2 = renda fixa): "));
        valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que deseja depositar: "));
        calculoInvestimento();
    }
}
