package ExercicioVotacao1;

public class Candidato {
    //Atributos da Classe
    int numVotos;
    int numCandidato;

    //Construtor
    Candidato(){
        this(0,0);
    }

    Candidato(int numVotosCandidato, int numCandidatoCandidato){
        numVotos = numVotosCandidato;
        numCandidato = numCandidatoCandidato;
    }
}