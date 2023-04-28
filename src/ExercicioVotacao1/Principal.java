package ExercicioVotacao1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        int opcao;
        Metodos metodos = new Metodos();

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO\n" +
                                                                "1 – Carregar Seção/Número Eleitor\n" +
                                                                "2 – Classificar por Seção\n" +
                                                                "3 – Gravar Registros (Não funcional)\n" +
                                                                "4 – Mostrar Indicadores\n" +
                                                                "9 – Finalizar\n"));

            switch(opcao){
                case 1:
                    metodos.CadastrarVotacao();
                    break;

                case 2:
                    metodos.ClassificarPorSecao();
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "A ser implantado(Proxima Aula).");
                    break;

                case 4:
                    metodos.MenuIndicadores();
                    break;

                case 9:
                    System.exit(0);

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente!");
            }
        }while(opcao != 9);
    }
}