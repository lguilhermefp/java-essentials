package atividade_b2_2;

import java.util.Random;

	public class Exerc�cio_4_Multiplica��oArrays {
		static void Multiplica��o(int[] vetorA) {
		    
		int Multiplica��o[] = new int[Exerc�cio_4_Cria��oArrays.tamanhoVetor];
	    System.out.println("\n\nMultiplica��o dos Vetores:");
	    
	    for(int i=0; i<Exerc�cio_4_Cria��oArrays.tamanhoVetor/2; i++) {
	    	Multiplica��o[i] = vetorA[i] * vetorA[i+Exerc�cio_4_Cria��oArrays.tamanhoVetor/2];
	    	System.out.printf("%d, ",Multiplica��o[i]);
	    }
	    
	    System.out.println("\n___________\nFIM DA MULTIPLICA��O\n___________\n");
	}
}
