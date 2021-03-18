package atividade_b2_2;

import java.util.Random;

	public class Exercício_4_SomaArrays {
	
		static void Soma(int[] vetorA) {
	    
		int Soma[] = new int[Exercício_4_CriaçãoArrays.tamanhoVetor];
	    System.out.println("\n\nSoma dos Vetores:");
	    
	    for(int i=0; i<Exercício_4_CriaçãoArrays.tamanhoVetor/2; i++) {
	    	Soma[i] = vetorA[i] + vetorA[i+Exercício_4_CriaçãoArrays.tamanhoVetor/2];
	    	System.out.printf("%d, ",Soma[i]);
	    }
	    
	    System.out.println("\n___________\nFIM DA SOMA\n___________\n");
	}
}
