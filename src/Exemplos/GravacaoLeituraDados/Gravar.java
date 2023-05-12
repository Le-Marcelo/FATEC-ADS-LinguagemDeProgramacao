package Exemplos.GravacaoLeituraDados;

//Mesmo Sendo uma classe principal
//Considerar como um método a parte
//Para estudo

import java.io.*;
import javax.swing.*;

public class Gravar {
    public static void main (String[] args) throws IOException{
        Aluno[] aluno = new Aluno[3];
        String fileName = "ArquivoAluno.txt";	
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));	
    
        for (int i = 0 ; i < 3 ; i++){	
            aluno[i] = new Aluno();

            aluno[i].primeiroNome = JOptionPane.showInputDialog("Entre o nome do aluno:");	
            writer.write(aluno[i].primeiroNome);  	
            writer.newLine();	

            aluno[i].ultimoNome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");	
            writer.write( aluno[i].ultimoNome );  	
            writer.newLine();	

            aluno[i].pontos = Integer.parseInt(JOptionPane.showInputDialog("Pontos Graduação do aluno:"));	
            writer.write(Integer.toString(aluno[i].pontos));   	
            writer.newLine();	
        }	
            
        for (int i = 0 ; i < 3; i++) {	
            
            JOptionPane.showMessageDialog(null, aluno[i].primeiroNome + " " + aluno[i].ultimoNome + " pontos: " + aluno[i].pontos);;	
        }
        writer.close();
    }
   
}
