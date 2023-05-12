package ExercicioVotacao;

public class Votacao {
    //Atributos da Classe
    int numSecao;
    int numCandidato;

    //Construtor
    Votacao(){
        this(0,0);
    }

    Votacao(int numSecaoVotacao, int numCandidatoVotacao){
        numSecao = numSecaoVotacao;
        numCandidato = numCandidatoVotacao;
    }
}