package ExercicioTransito;

import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class ClasseMetodos{
    Estatistica[] estatistica = new Estatistica[10];        //Instanciando 10 "estatisticas"
    Random gerador = new Random();

    void CadastrarEstatistica() throws IOException{
        BufferedWriter gravar = new BufferedWriter(new FileWriter("DadosTransito.txt"));
        for (int i = 0; i < 10; i++){
            //Construindo as classes
            estatistica[i] = new Estatistica();
            
            //Inserir Dados
            estatistica[i].codigoCidade = gerador.nextInt(101);
            gravar.write(Integer.toString(estatistica[i].codigoCidade));
            gravar.newLine();

            estatistica[i].nomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade da " + (i + 1) + "ª estatistica:");
            gravar.write(estatistica[i].nomeCidade);
            gravar.newLine();

            estatistica[i].qtdAcidentes = gerador.nextInt(1001);
            gravar.write(Integer.toString(estatistica[i].qtdAcidentes));
            gravar.newLine();
        }

        gravar.close();
    }

    void ConsultaQtdAcidentes() throws IOException{
        CarregarDados();

        String consulta = "Quantidade de acidentes superior a 100 e inferior a 500:\n";

        for(int i = 0; i < 10; i++){
            if(estatistica[i].qtdAcidentes > 100 && estatistica[i].qtdAcidentes < 500){
                consulta += "Código: " + estatistica[i].codigoCidade + " | Nome: " + estatistica[i].nomeCidade + " | Quantidade: " + estatistica[i].qtdAcidentes + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,consulta);
    }

    void ConsultaMaiorMenor() throws IOException{
        CarregarDados();

        String consultaMenor = "Cidades com menor número de acidentes:\n";
        String consultaMaior = "Cidades com maior número de acidentes:\n";
        int menor = 0, maior = 0;

        for(int i = 0; i < 10; i++){    //Definir qual é a menor e maior quantidade de acidentes
            if(i == 0){
                maior = estatistica[i].qtdAcidentes;
                menor = estatistica[i].qtdAcidentes;
            }else if(estatistica[i].qtdAcidentes > maior){
                maior = estatistica[i].qtdAcidentes;
            }else if(estatistica[i].qtdAcidentes < menor){
                menor = estatistica[i].qtdAcidentes;
            }
        }

        for(int i = 0; i < 10; i++){
            if(estatistica[i].qtdAcidentes == menor){
                consultaMenor += "Código: " + estatistica[i].codigoCidade + " | Nome: " + estatistica[i].nomeCidade + " | Quantidade: " + estatistica[i].qtdAcidentes + "\n";
            }else if(estatistica[i].qtdAcidentes == maior){
                consultaMaior += "Código: " + estatistica[i].codigoCidade + " | Nome: " + estatistica[i].nomeCidade + " | Quantidade: " + estatistica[i].qtdAcidentes + "\n";
            }
        }

        JOptionPane.showMessageDialog(null,consultaMenor);
        JOptionPane.showMessageDialog(null,consultaMaior);
    }

    void AcimaMedia() throws IOException{
        CarregarDados();
        
        String resultado = "Cidades com acidentes acima da média: \n";
        int media = 0;

        for(int i = 0; i < 10; i++){    //Definir a média de acidentes
            media += estatistica[i].qtdAcidentes;
        }
        media /= 10;

        for(int i = 0; i < 10; i++){
            if(estatistica[i].qtdAcidentes > media){
                resultado += "Código: " + estatistica[i].codigoCidade + " | Nome: " + estatistica[i].nomeCidade + " | Quantidade: " + estatistica[i].qtdAcidentes + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    void CarregarDados() throws IOException{
        BufferedReader ler = new BufferedReader(new FileReader("DadosTransito.txt"));

        for (int i = 0; i < 10; i++){
            //Construindo as classes
            estatistica[i] = new Estatistica();
            
            //Inserir Dados
            estatistica[i].codigoCidade = Integer.parseInt(ler.readLine());
            estatistica[i].nomeCidade = ler.readLine();
            estatistica[i].qtdAcidentes = Integer.parseInt(ler.readLine());
            
        }

        ler.close();
    }
}