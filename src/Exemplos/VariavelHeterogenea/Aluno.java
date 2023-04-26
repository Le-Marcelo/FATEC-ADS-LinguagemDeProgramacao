package Exemplos.VariavelHeterogenea;

public class Aluno {
    //Atributos da Classe
    String primeiroNome;
    String ultimoNome;
    int    nota;

    //Construtor
    Aluno () {
        this("" ,"" ,0);
    }

    //Inserir dados
    Aluno ( String primeiroNomeAluno, String ultimoNomeAluno, int notaAluno )
    {
        primeiroNome   = primeiroNomeAluno;
        ultimoNome  = ultimoNomeAluno;
        nota  = notaAluno;
    }

}
