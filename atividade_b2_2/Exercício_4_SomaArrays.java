package atividade_b2_2;

import java.util.Random;

	public class Exerc�cio_4_SomaArrays {
	
		static void Soma(int[] vetorA) {
	    
		int Soma[] = new int[Exerc�cio_4_Cria��oArrays.tamanhoVetor];
	    System.out.println("\n\nSoma dos Vetores:");
	    
	    for(int i=0; i<Exerc�cio_4_Cria��oArrays.tamanhoVetor/2; i++) {
	    	Soma[i] = vetorA[i] + vetorA[i+Exerc�cio_4_Cria��oArrays.tamanhoVetor/2];
	    	System.out.printf("%d, ",Soma[i]);
	    }
	    
	    System.out.println("\n___________\nFIM DA SOMA\n___________\n");
	}
}
