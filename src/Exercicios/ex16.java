package Exercicios;

import javax.swing.JOptionPane;

public class ex16 {
    public static void main(String[] args){
        int horasTrabalhadas, numDesc;
        double valorHora, desconto, salLiq;

        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recebido por hora: "));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        numDesc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));

        salLiq = (horasTrabalhadas * valorHora - horasTrabalhadas * valorHora * (desconto / 100)) + 100 * numDesc;

        JOptionPane.showMessageDialog(null, "O valor do salário líquido é igual a " + salLiq);
    }
}
