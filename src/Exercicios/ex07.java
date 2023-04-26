package Exercicios;

import javax.swing.JOptionPane;

public class ex07 {
    public static void main(String[] args){
        double comprimento, largura, altura, volume;

        comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepípedo: "));
        largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da largura do paralelepípedo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do paralelepípedo: "));

        volume = comprimento * largura * altura;

        JOptionPane.showMessageDialog(null, "O volume do paralelepípedo é igual a " + volume);
    }
}
