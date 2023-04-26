package Exemplos.VariavelHeterogenea;

import javax.swing.JOptionPane;

public class PrincipalRegistroAluno {
    public static void main ( String[] args )
    {
        Aluno[] aluno = new Aluno[3];   //Instanciando a classe com 3 "alunos"
        for (int i = 0 ; i < 3 ; i++)   //Construindo as classes
            aluno[i] = new Aluno();

        for (int i = 0 ; i < 3 ; i++)   //Inserir dados
        {
            aluno[i].primeiroNome = JOptionPane.showInputDialog("Entre o nome do aluno:");
            aluno[i].ultimoNome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
            aluno[i].nota = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));
        }

        for (int i = 0 ; i < 3; i++) {  //Exibir dados
            System.out.println(aluno[i].primeiroNome + " " + aluno[i].ultimoNome + " pontos: " + aluno[i].nota);
        }

        System.exit(0); //Força o fim do programa
    }

}
