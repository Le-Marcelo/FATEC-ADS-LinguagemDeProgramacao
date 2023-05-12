package ExercicioEleicao;

import javax.swing.JOptionPane;
import java.io.*;

public class Principal {
    public static void main(String[] args) throws IOException{
        Metodos metodo = new Metodos();
        int opcao;

        metodo.CarregarDados();

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n" +
                                                                    "1 - Cadastrar Eleitor\n" +
                                                                    "2 - Cadastrar Votações\n" +
                                                                    "3 - Agrupar Apuração\n" +
                                                                    "4 - Menu Estatísticas\n" +
                                                                    "9 - Sair"));

            switch(opcao){
                case 1:
                    metodo.CadastrarEleitor();
                    break;
                
                case 2:
                    metodo.MenuVotacao();
                    break;

                case 3:
                    metodo.AgruparApuracao();
                    break;

                case 4:
                    metodo.MenuEstatisticas();

                    break;

                case 9:
                    System.exit(0);
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente!");
            }
        }while(opcao != 9);
    }
}
