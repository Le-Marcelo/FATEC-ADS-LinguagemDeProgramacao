package ExercicioEleicao;

public class Votacao {
    //Atributos da Classe
    int numSecao;
    int numCandidato;
    int numEleitor;

    //Construtor
    Votacao(){
        this(0,0,0);
    }

    Votacao(int numSecaoVotacao, int numCandidatoVotacao, int numEleitorVotacao){
        numSecao = numSecaoVotacao;
        numCandidato = numCandidatoVotacao;
        numEleitor = numEleitorVotacao;
    }
}