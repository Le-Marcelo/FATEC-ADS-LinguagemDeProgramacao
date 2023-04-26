package ExercicioTransito;

public class Estatistica {
    //Atributos da Classe
    int codigoCidade;
    String nomeCidade;
    int qtdAcidentes;

    //Construtor
    Estatistica(){
        this(0,"", 0);
    }

    //Inserir dados
    Estatistica(int codigoCidadeEstatistica, String nomeCidadeEstatistica, int qtdAcidentesEstatistica){
        codigoCidade = codigoCidadeEstatistica;
        nomeCidade = nomeCidadeEstatistica;
        qtdAcidentes = qtdAcidentesEstatistica;
    }
}