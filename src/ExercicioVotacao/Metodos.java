package ExercicioVotacao;

import javax.swing.*;
import java.util.Random;
import java.io.*;

public class Metodos{
    Votacao[] votacao = new Votacao[200];
    Candidato[] candidatoC = new Candidato[301];
    Random gerador = new Random();
    

    void CadastrarVotacao(){
        for(int i = 0; i < 200; i++){
            //Construindo as Classes
            votacao[i] = new Votacao();

            //Preenchendo as Classes
            votacao[i].numSecao = gerador.nextInt(11);
            votacao[i].numCandidato = gerador.nextInt(301);
        }

        JOptionPane.showMessageDialog(null, "Votos cadastrados!");
    }

    void ClassificarPorSecao(){
        //Ordenando via Bubble Sort
        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 199; j++){
                if(votacao[j].numSecao > votacao[j + 1].numSecao){
                    int auxSecao = votacao[j].numSecao;
                    int auxCandidato = votacao[j].numCandidato;
                    votacao[j].numSecao = votacao[j + 1].numSecao;
                    votacao[j].numCandidato = votacao[j + 1].numCandidato;
                    votacao[j + 1].numSecao = auxSecao;
                    votacao[j + 1].numCandidato = auxCandidato;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Dados Classificados!");
    }

    void GravarVotacao() throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter("DadosVotacao.txt"));

        gravar.write("Número de Seção           | Número do Candidato");
        gravar.newLine();

        for(int i = 0; i < 200; i++){
            gravar.write(Integer.toString(votacao[i].numSecao) + "                         | " + Integer.toString(votacao[i].numCandidato));
            gravar.newLine();
        }

        gravar.close();

        JOptionPane.showMessageDialog(null, "Arquivo gerado!");
    }

    void MenuIndicadores(){
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Mostrar Indicadores\n" +
                                                                "Estatísticas de Votação em 2021\n" +
                                                                "1 – Quantidade Eleitores por Seção\n" +
                                                                "2 – Seção com Maior e Menor número de Eleitores\n" +
                                                                "3 – Quantidade de votos por candidato\n" +
                                                                "4 – 10 primeiros colocados\n" +
                                                                "9 – Voltar"));

            switch (opcao){
                case 1:
                    QuantidadeEleitoresSecao();
                    break;

                case 2:
                    MaiorMenorEleitores();
                    break;

                case 3:
                    QuantidadeVotosCandidato();
                    break;

                case 4:
                    CandidatosMaisVotados();
                    break;

                case 9:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Tente novamente!");
            }
        }while(opcao != 9);
    }

    void QuantidadeEleitoresSecao(){
        int secao[] = new int[11];
        String resposta = "";

        //Definir quantos eleitores existem por seção
        for (int j = 0; j < 200; j++) {
            for (int i = 0; i < 11; i++) {
                if(votacao[j].numSecao == i){
                    secao[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < 11; i++){
            resposta += "Seção " + i + ": " + secao[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }

    void MaiorMenorEleitores(){
        int secao[] = new int[11], menor = 0, menorSecao = 0, maior = 0, maiorSecao = 0;

        //Definir quantos eleitores existem por seção
        for (int j = 0; j < 200; j++) {
            for (int i = 0; i < 11; i++) {
                if(votacao[j].numSecao == i){
                    secao[i]++;
                    break;
                }
            }
        }

        //Definir qual seção teve o maior e menor número de eleitores
        for (int i = 0; i < 11; i++){
            if(i == 0){
                maior = secao[i];
                maiorSecao = i;
                menor = secao[i];
                menorSecao = i;
            }else if (secao[i] > maior){
                maior = secao[i];
                maiorSecao = i;
            }else if (secao[i] < menor){
                menor = secao[i];
                menorSecao = i;
            }
        }

        JOptionPane.showMessageDialog(null, "Seção com maior número de eleitores: Seção " + maiorSecao + "\n" +
                                                                   "Seção com maior número de eleitores: Seção " + menorSecao);
    }

    void QuantidadeVotosCandidato(){
        int candidato[] = new int[301];
        String resposta = "";

        //Definir quantos votos cada candidato teve
        for (int j = 0; j < 200; j++) {
            for (int i = 0; i < 301; i++) {
                if(votacao[j].numCandidato == i){
                    candidato[i]++;
                    break;
                }
            }
        }

        for (int i = 0; i < 301; i++){
            resposta += "Candidato " + i + ": " + candidato[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }

    void CandidatosMaisVotados(){
        int candidato[] = new int[301];
        String resposta = "";

        //Definir quantos votos cada candidato teve
        for (int j = 0; j < 200; j++) {
            for (int i = 0; i < 301; i++) {
                if(votacao[j].numCandidato == i){
                    candidato[i]++;
                    break;
                }
            }
        }

        for(int i = 0; i < 301; i++){
            //Construindo as Classes
            candidatoC[i] = new Candidato();

            //Preenchendo as Classes
            candidatoC[i].numVotos = candidato[i];
            candidatoC[i].numCandidato = i;
        }

        //Ordenando via Bubble Sort
        for(int i = 0; i < 301; i++){
            for(int j = 0; j < 300; j++){
                if(candidatoC[j].numVotos > candidatoC[j + 1].numVotos){
                    int auxVotos = candidatoC[j].numVotos;
                    int auxCandidato = candidatoC[j].numCandidato;
                    candidatoC[j].numVotos = candidatoC[j + 1].numVotos;
                    candidatoC[j].numCandidato = candidatoC[j + 1].numCandidato;
                    candidatoC[j + 1].numVotos = auxVotos;
                    candidatoC[j + 1].numCandidato = auxCandidato;
                }
            }
        }

        for (int i = 0; i < 10; i++){
            resposta += (i + 1) + "ºLugar: Candidato " + (candidatoC[300 - i].numCandidato) + " | Qtd. de votos: " + (candidatoC[300 - i].numVotos) + "\n";
        }

        JOptionPane.showMessageDialog(null, resposta);
    }
}