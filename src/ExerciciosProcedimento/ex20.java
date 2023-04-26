package ExerciciosProcedimento;

import javax.swing.*;

public class ex20 {
    static int a, b, c, delta;
    static double r1, r2;

    static void bhaskara(){
        delta = b * b - 4 * a * c;

        if(delta >= 0){
            r1 = (-b + Math.sqrt(delta)) / (2 * a);
            r2 = (-b - Math.sqrt(delta)) / (2 * a);

            if(r1 == r2){
                JOptionPane.showMessageDialog(null, "A única raiz real dessa equação é " + r1);
            }else{
                JOptionPane.showMessageDialog(null, "As raízes reais dessa equação são " + r1 + " e " + r2);
            }

        }else {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais nessa equação");
        }
    }
    public static void main(String[] args){
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B: "));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C: "));
        bhaskara();
    }
}
