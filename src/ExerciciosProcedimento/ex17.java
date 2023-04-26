package ExerciciosProcedimento;

import javax.swing.JOptionPane;

public class ex17 {
    static double tempo, vel, litros;

    static void calculoLitros(){
        litros = (tempo * vel) / 12;
    }

    public static void main(String[] args){
        tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite quanto tempo durou o percurso em horas: "));
        vel = Double.parseDouble(JOptionPane.showInputDialog("Digite qual foi a velocidade média: "));
        calculoLitros();
        JOptionPane.showMessageDialog(null, "A quantidade de litros que será gasta é " + litros);
    }
}
