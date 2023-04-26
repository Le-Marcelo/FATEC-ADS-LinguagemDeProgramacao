package Exemplos;

import javax.swing.*;

public class recursividade {
    static int fatorial(int num){
        //Teste lógico para saber se chegou ao limite da recursão (1).
        if(num != 1){
            //Caso não seja o limite continua a função com um parametro levemente diferente (n - 1)
            //e após a recursão ser concluída retorna o resultado.
            int resultado = num * fatorial(num - 1);
            return resultado;
        }else{
            //Caso seja o limite retorna o valor limite (1).
            return 1;
        }
    }

    public static void main(String[] args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do número que deseja ver o fatorial: "));
        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é igual a " + fatorial(num));
    }
}
