package atividade_2;

import java.io.PrintStream;

public class Atividade_2 {

	long x = (long)Math.pow(2, 33);
	
	
	public static void main(String[] args) {
		
		String nome = "Gui";
		String endereco = "Rua 3";
		String telefone = "+0 (00)98888-8888";
		
		PrintStream out = System.out;
		out.println("O "+nome+" no endereco "+endereco+" e telefone "+telefone+" nao possui nenhum tipo de pendencia.");	
	}

}