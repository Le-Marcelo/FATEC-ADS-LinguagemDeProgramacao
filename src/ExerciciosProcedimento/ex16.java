package ExerciciosProcedimento;

import javax.swing.JOptionPane;

public class ex16 {
    static int horasTrabalhadas, numDesc;
    static double valorHora, desconto, salLiq;

    static void calculoSalario(){
        salLiq = (horasTrabalhadas * valorHora - horasTrabalhadas * valorHora * (desconto / 100)) + 100 * numDesc;
    }

    public static void main(String[] args){
        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor recebido por hora: "));
        desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto: "));
        numDesc = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de descendentes: "));
        calculoSalario();
        JOptionPane.showMessageDialog(null, "O valor do salário líquido é igual a " + salLiq);
    }
}
