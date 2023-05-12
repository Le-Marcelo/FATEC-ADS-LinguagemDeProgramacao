package ExercicioEleicao;

import javax.swing.*;
import java.io.*;

public class Metodos {
    Votacao[] votacao1 = new Votacao[5];
    Votacao[] votacao2 = new Votacao[5];
    Votacao[] apuracao = new Votacao[10];
    Eleitor[] eleitor = new Eleitor[10];

    void CadastrarEleitor()throws IOException{
        BufferedWriter gravarEleitor = new BufferedWriter(new FileWriter("DadosEleitoresEleicao.txt"));

        for(int i = 0; i < 10; i++){
            //Construindo as Classes
            eleitor[i] = new Eleitor();

            //Preenchendo as Classes
            eleitor[i].numEleitor = ValidarNovoEleitor(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do " + (i + 1) + "º eleitor:")), i + 1);
            gravarEleitor.write(Integer.toString(eleitor[i].numEleitor));
            gravarEleitor.newLine();

            eleitor[i].nomeEleitor = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º eleitor:");
            gravarEleitor.write(eleitor[i].nomeEleitor);
            gravarEleitor.newLine();

            eleitor[i].numSecao = ValidarSecao(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + (i + 1) + "º eleitor:")), i + 1, 0);
            gravarEleitor.write(Integer.toString(eleitor[i].numSecao));
            gravarEleitor.newLine();
        }
        gravarEleitor.close();
        JOptionPane.showMessageDialog(null, "Eleitores cadastrados!");
    }

    void MenuVotacao() throws IOException{
        int opcao;
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de votação\n" +
                                                                "1 - Cadastrar Votação 1\n" +
                                                                "2 - Cadastrar Votação 2\n" +
                                                                "9 - Voltar"));
            
            switch(opcao){
                case 1:
                    CadastrarVotacao1();
                    break;
                
                case 2:
                    CadastrarVotacao2();
                    break;

                case 9:
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida, tente novamente!");
            }

        }while(opcao != 9);
    }

    void CadastrarVotacao1() throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter("DadosEleicaoVotacao1.txt"));

        for(int i = 0; i < 5; i++){
            boolean validador = false;
            //Construindo as Classes
            votacao1[i] = new Votacao();

            //Preenchendo as Classes (Garantindo que os dados batem)
            do{
                votacao1[i].numSecao = ValidarSecao(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + (i + 1) + "º eleitor:")), i + 1, 1);
                votacao1[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do " + (i + 1) + "º eleitor:"));
                votacao1[i].numCandidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato que deseja votar: "));

                for(int j = 0; j < 10; j++){
                    if(votacao1[i].numEleitor == eleitor[j].numEleitor && votacao1[i].numSecao == eleitor[j].numSecao && votacao1[i].numCandidato > 0 && votacao1[i].numCandidato < 5){
                        validador = true;
                    }
                }
                if(validador == false){
                    JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente!");
                }
            }while(validador == false);
        }

        //Ordenar por código de candidato
        //Ordenando via Bubble Sort
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(votacao1[j].numCandidato > votacao1[j + 1].numCandidato  ){
                    int auxSecao = votacao1[j].numSecao;
                    int auxCandidato = votacao1[j].numCandidato;
                    int auxEleitor = votacao1[j].numEleitor;
                    votacao1[j].numSecao = votacao1[j + 1].numSecao;
                    votacao1[j].numCandidato = votacao1[j + 1].numCandidato;
                    votacao1[j].numEleitor = votacao1[j + 1].numEleitor;
                    votacao1[j + 1].numSecao = auxSecao;
                    votacao1[j + 1].numCandidato = auxCandidato;
                    votacao1[j + 1].numEleitor = auxEleitor;
                }
            }
        }

        //Gravar os dados em .txt
        for(int i = 0; i < 5; i++){
            gravar.write(Integer.toString(votacao1[i].numSecao));
            gravar.newLine();
            gravar.write(Integer.toString(votacao1[i].numCandidato));
            gravar.newLine();
            gravar.write(Integer.toString(votacao1[i].numEleitor));
            gravar.newLine();
        }
        
        gravar.close();
    }

    void CadastrarVotacao2() throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter("DadosEleicaoVotacao2.txt"));

        for(int i = 0; i < 5; i++){
            boolean validador = false;
            //Construindo as Classes
            votacao2[i] = new Votacao();

            //Preenchendo as Classes (Garantindo que os dados batem)
            do{
                votacao2[i].numSecao = ValidarSecao(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + (i + 1) + "º eleitor:")), i + 1, 2);
                votacao2[i].numEleitor = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do " + (i + 1) + "º eleitor:"));
                votacao2[i].numCandidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato que deseja votar: "));

                for(int j = 0; j < 10; j++){
                    if(votacao2[i].numEleitor == eleitor[j].numEleitor && votacao2[i].numSecao == eleitor[j].numSecao && votacao2[i].numCandidato > 0 && votacao1[i].numCandidato < 5){
                        validador = true;
                    }
                }
                if(validador == false){
                    JOptionPane.showMessageDialog(null, "Dados inválidos, tente novamente!");
                }
            }while(validador == false);
        }

        //Ordenar por código de candidato
        //Ordenando via Bubble Sort
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                if(votacao2[j].numCandidato > votacao2[j + 1].numCandidato  ){
                    int auxSecao = votacao2[j].numSecao;
                    int auxCandidato = votacao2[j].numCandidato;
                    int auxEleitor = votacao2[j].numEleitor;
                    votacao2[j].numSecao = votacao2[j + 1].numSecao;
                    votacao2[j].numCandidato = votacao2[j + 1].numCandidato;
                    votacao2[j].numEleitor = votacao2[j + 1].numEleitor;
                    votacao2[j + 1].numSecao = auxSecao;
                    votacao2[j + 1].numCandidato = auxCandidato;
                    votacao2[j + 1].numEleitor = auxEleitor;
                }
            }
        }

        //Gravar os dados em .txt
        for(int i = 0; i < 5; i++){
            gravar.write(Integer.toString(votacao2[i].numSecao));
            gravar.newLine();
            gravar.write(Integer.toString(votacao2[i].numCandidato));
            gravar.newLine();
            gravar.write(Integer.toString(votacao2[i].numEleitor));
            gravar.newLine();
        }
        
        gravar.close();
    }

    void AgruparApuracao()throws IOException{
        BufferedReader lerVotacao1 = new BufferedReader(new FileReader("DadosEleicaoVotacao1.txt"));
        BufferedReader lerVotacao2 = new BufferedReader(new FileReader("DadosEleicaoVotacao2.txt"));
        BufferedWriter gravar = new BufferedWriter(new FileWriter("DadosEleicaoApuracao.txt"));

        for(int i = 0; i < 10; i++){
            apuracao[i] = new Votacao();

            if(i < 5){
                apuracao[i].numSecao = Integer.parseInt(lerVotacao1.readLine());
                apuracao[i].numEleitor = Integer.parseInt(lerVotacao1.readLine());
                apuracao[i].numCandidato = Integer.parseInt(lerVotacao1.readLine());
            }else{
                apuracao[i].numSecao = Integer.parseInt(lerVotacao2.readLine());
                apuracao[i].numEleitor = Integer.parseInt(lerVotacao2.readLine());
                apuracao[i].numCandidato = Integer.parseInt(lerVotacao2.readLine());
            }


        }

        lerVotacao1.close();
        lerVotacao2.close();

        //Ordenar por código de candidato
        //Ordenando via Bubble Sort
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 9; j++){
                if(apuracao[j].numCandidato > apuracao[j + 1].numCandidato  ){
                    int auxSecao = apuracao[j].numSecao;
                    int auxCandidato = apuracao[j].numCandidato;
                    int auxEleitor = apuracao[j].numEleitor;
                    apuracao[j].numSecao = apuracao[j + 1].numSecao;
                    apuracao[j].numCandidato = apuracao[j + 1].numCandidato;
                    apuracao[j].numEleitor = apuracao[j + 1].numEleitor;
                    apuracao[j + 1].numSecao = auxSecao;
                    apuracao[j + 1].numCandidato = auxCandidato;
                    apuracao[j + 1].numEleitor = auxEleitor;
                }
            }
        }

        //Gravar os dados em .txt
        for(int i = 0; i < 10; i++){
            gravar.write(Integer.toString(apuracao[i].numSecao));
            gravar.newLine();
            gravar.write(Integer.toString(apuracao[i].numCandidato));
            gravar.newLine();
            gravar.write(Integer.toString(apuracao[i].numEleitor));
            gravar.newLine();
        }
        
        gravar.close();
    }

    void MenuEstatisticas()throws IOException{
        int opcao, qntVotos[] = new int[4];
        String resultado[] = new String[2];

        for(int i = 0; i < 10; i++){    //Ler quantidades de votos
            switch (apuracao[i].numCandidato){
                case 1:
                    qntVotos[0]++;
                    break;

                case 2:
                    qntVotos[1]++;
                    break;

                case 3:
                    qntVotos[2]++;
                    break;

                case 4:
                    qntVotos[3]++;
                    break;
            }
        }

        if(qntVotos[0] > qntVotos[1]){  //Definir vencedor e segundo lugar
            resultado[0] = "José";
            resultado[1] = "Maria";
        }else{
            resultado[0] = "Maria";
            resultado[1] = "José";
        }

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu Estatistica\n" +
                                                    "1 - Vencedor\n" +
                                                    "2 - Segundo colocado\n" +
                                                    "3 - Quantidade de votos em branco\n" +
                                                    "4 - Quantidade de votos nulos\n" +
                                                    "5 - Mostra eleitores\n" +
                                                    "6 - Mostra apuração\n" +
                                                    "9 - Voltar"));

            switch (opcao){
                case 1:
                    JOptionPane.showMessageDialog(null, "O vencedor foi " + resultado[0]);
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "O segundo lugar foi " + resultado[1]);
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "A quantidade de votos em branco foi de " + qntVotos[2]);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null,"A quantidade de votos nulos foi de " + qntVotos[3]);
                    break;

                case 5:
                    MostrarEleitores();
                    break;

                case 6:
                    MostrarApuracao();
                    break;

                case 9:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
            }
        } while(opcao != 9);
    }

    void MostrarEleitores(){
        String mensagem = "Eleitores:\n";
        for(int i = 0; i < 10; i++){
            mensagem += "Nº: " + eleitor[i].numEleitor + " |Nome: " + eleitor[i].nomeEleitor + "    |Seção: " + eleitor[i].numSecao + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }

    void MostrarApuracao(){
        String mensagem = "Apuração:\n";
        for(int i = 0; i < 10; i++){
            mensagem += "Seção: " + apuracao[i].numSecao + " |Candidato: " + apuracao[i].numCandidato + "    |Nº eleitor: " + apuracao[i].numEleitor + "\n";
        }

        JOptionPane.showMessageDialog(null, mensagem);
    }

    int ValidarNovoEleitor(int num, int numEleitor){    //Validação de novos eleitores
        boolean validador;
        do{
            validador = true;
            for(int i = 0; i < numEleitor; i++){
                if(num == eleitor[i].numEleitor){
                    validador = false;
                }
            }
            if(validador == false){
                JOptionPane.showMessageDialog(null, "Número de eleitor ja cadastrado, tente novamente!");
                num = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de eleitor do " + numEleitor + "º eleitor:"));
            }
        }while(validador == false);

        return num;
    }

    int ValidarSecao(int numSecao, int numEleitor, int opcao){     //Validação de Seção
        int validaSecao[] = {1, 3, 4, 5, 9, 10};
        boolean validador = false;
        switch(opcao){
            case 0:     //Para o cadastro de eleitor
                do{ 
                    for(int i = 0; i < 6; i++){
                        if(numSecao == validaSecao[i]){
                            validador = true;
                        }
                    }
                    if(validador == false){
                        JOptionPane.showMessageDialog(null, "Número de seção inválido, tente novamente!");
                        numSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + numEleitor + "º eleitor:"));
                    }
                }while(validador == false);
                break;

            case 1:     //Para a votação 1
                do{ 
                    for(int i = 0; i < 3; i++){
                        if(numSecao == validaSecao[i]){
                            validador = true;
                        }
                    }
                    if(validador == false){
                        JOptionPane.showMessageDialog(null, "Número de seção inválido, tente novamente!");
                        numSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + numEleitor + "º eleitor:"));
                    }
                }while(validador == false);
                break;

            case 2:     //Para a votação 2
                do{ 
                    for(int i = 3; i < 6; i++){
                        if(numSecao == validaSecao[i]){
                            validador = true;
                        }
                    }
                    if(validador == false){
                        JOptionPane.showMessageDialog(null, "Número de seção inválido, tente novamente!");
                        numSecao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção do " + numEleitor + "º eleitor:"));
                    }
                }while(validador == false);
                break;
        }
        return numSecao;
    }

    void CarregarDados()throws IOException{
        BufferedReader lerApuracao = new BufferedReader(new FileReader("DadosEleicaoApuracao.txt"));
        BufferedReader lerEleitor = new BufferedReader(new FileReader("DadosEleitoresEleicao.txt"));

        for(int i = 0; i < 10; i++){
            apuracao[i] = new Votacao();
            eleitor[i] = new Eleitor();

            apuracao[i].numSecao = Integer.parseInt(lerApuracao.readLine());
            apuracao[i].numCandidato = Integer.parseInt(lerApuracao.readLine());
            apuracao[i].numEleitor = Integer.parseInt(lerApuracao.readLine());

            eleitor[i].numEleitor = Integer.parseInt(lerEleitor.readLine());
            eleitor[i].nomeEleitor = lerEleitor.readLine();
            eleitor[i].numSecao = Integer.parseInt(lerEleitor.readLine());
        }

        lerApuracao.close();
        lerEleitor.close();
    }
}
