package Exemplos.GravacaoLeituraDados;

public class Aluno {
    //Atributos
    String primeiroNome;	 
    String ultimoNome;	 
    int pontos;	 
        
    //Construtor	 
    Aluno () {	 
        this("" ,"" ,0);	 
    }	 
    
    Aluno ( String primeiroNomeAluno, String ultimoNomeAluno, int pontosAluno ){	 
        primeiroNome = primeiroNomeAluno;	 
        ultimoNome = ultimoNomeAluno;	 
        pontos = pontosAluno;
    }
}
