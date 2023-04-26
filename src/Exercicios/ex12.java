package Exercicios;

import javax.swing.JOptionPane;

public class ex12 {
    public static void main(String[] args){
        int anoNasc, anoAtual, idadeFuturo, idade;

        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));

        idade = anoAtual - anoNasc;
        idadeFuturo = idade + 17;

        JOptionPane.showMessageDialog(null, "Você atualmente tem " + idade + " anos e daqui 17 anos terá " + idadeFuturo);
    }
}
