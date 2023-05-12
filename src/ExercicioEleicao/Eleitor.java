package ExercicioEleicao;

public class Eleitor {
    //Atributos da Classe
    int numEleitor;
    String nomeEleitor;
    int numSecao;

    //Construtor
    Eleitor(){
        this(0,"",0);
    }

    Eleitor(int numEleitorEleitor, String nomeEleitorEleitor, int numSecaoEleitor){
        numEleitor = numEleitorEleitor;
        nomeEleitor = nomeEleitorEleitor;
        numSecao = numSecaoEleitor;
    }
    
}
