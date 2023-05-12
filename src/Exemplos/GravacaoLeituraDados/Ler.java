package Exemplos.GravacaoLeituraDados;

//Mesmo Sendo uma classe principal
//Considerar como um método a parte
//Para estudo

import java.io.*;	
import javax.swing.*;	

public class Ler{	
    public static void main ( String[] args ) throws IOException{	
        Aluno[] aluno = new Aluno[3];	
        String fileName = "ArquivoAluno.txt";	
            
        BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
   
        for (int i = 0 ; i < 3 ; i++)
        {	
            aluno[i] = new Aluno();
            aluno[i].primeiroNome = ler.readLine();  	
            aluno[i].ultimoNome = ler.readLine();	
            aluno[i].pontos = Integer.parseInt(ler.readLine());	
        }	
            
        for (int i = 0 ; i < 3; i++) {	
        JOptionPane.showMessageDialog(null, aluno[i].primeiroNome + " " + aluno[i].ultimoNome + " pontos: " + aluno[i].pontos);	
        }
        ler.close();
    }	
}
