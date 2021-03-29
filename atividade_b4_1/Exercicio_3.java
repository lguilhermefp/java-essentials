package atividade_b4_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio_3 {
	Exercicio_3() {
    	
    	System.out.println(new File(".").getAbsoluteFile());
    	File file = new File("C:\\Users\\Usuário\\Desktop\\arquivo.java");
    	
        try (FileReader leitor = new FileReader("C:\\Users\\Usuário\\Desktop\\arquivo.java")){
        	
        	//palavras
            var valor = leitor.read();
            Scanner x = new Scanner(leitor);
            int contadorPalavras=0;
            for(int i=0; i<10000; i++) {
            	if(x.hasNext()==true) {
            		contadorPalavras++;
            		x.next();
            	}
            }
            System.out.println(contadorPalavras+" palavras");
        }
        catch (FileNotFoundException e) {
            System.out.println("Foi capturada a FileNotFoundException (mais espeficica)");
        }
        catch (IOException e) {
            System.out.println("Foi capturada a IOException (generica)");
        }
    }
}