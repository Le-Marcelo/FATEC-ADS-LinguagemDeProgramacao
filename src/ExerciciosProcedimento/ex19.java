package ExerciciosProcedimento;

import javax.swing.*;

public class ex19 {
    static Double n1, n2, maior;

    static void maior(){
        if(n1 > n2){
            maior = n1;
        }else{
            maior = n2;
        }
    }
    public static void main(String[] args){
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do primeiro número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do segundo número: "));
        maior();
        JOptionPane.showMessageDialog(null, "O maior valor digitado é " + maior);
    }
}
