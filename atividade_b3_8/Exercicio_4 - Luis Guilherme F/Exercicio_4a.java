package atividade_b3_8;

import java.io.FileReader;

public class Exercicio_4a {

	    public static void main(String[] args) {
	    	try {
	    		FileReader leitor = new FileReader("arquivo.txt");
	        }catch(Exception FileNotFoundException){
	        	System.out.println("arquivo nao encontrado.");
	        }
	}
}
