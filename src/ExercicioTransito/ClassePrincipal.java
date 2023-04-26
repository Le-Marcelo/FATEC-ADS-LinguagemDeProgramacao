package ExercicioTransito;

import javax.swing.JOptionPane;

public class ClassePrincipal {
    
    public static void main(String[] args) {
        ClasseMetodos metodo = new ClasseMetodos();
        int opcao;
        do{           
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Estatistica\n" +
                                                                "Estatisticas de acidentes em 2023\n" +
                                                                "1 - Cadastro Estatística\n" +
                                                                "2 - Consulta por quantidade de acidentes\n" +
                                                                "3 - Consulta por estatísticas de acidentes\n" +
                                                                "4 - Acidentes acima da média das 10 cidades\n" +
                                                                "9 - Finalizar"));         

            switch(opcao){
                case 1: 
                    metodo.CadastrarEstatistica();
                    break;
                case 2:
                    metodo.ConsultaQtdAcidentes();
                    break;
                case 3:
                    metodo.ConsultaMaiorMenor();
                    break;
                case 4:
                    metodo.AcimaMedia();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente!");
                    break;
            }
        }while(opcao != 9);
    }
}