package atividade_b2_2;

import java.util.Random;

	public class Exercício_4_MultiplicaçãoArrays {
		static void Multiplicação(int[] vetorA) {
		    
		int Multiplicação[] = new int[Exercício_4_CriaçãoArrays.tamanhoVetor];
	    System.out.println("\n\nMultiplicação dos Vetores:");
	    
	    for(int i=0; i<Exercício_4_CriaçãoArrays.tamanhoVetor/2; i++) {
	    	Multiplicação[i] = vetorA[i] * vetorA[i+Exercício_4_CriaçãoArrays.tamanhoVetor/2];
	    	System.out.printf("%d, ",Multiplicação[i]);
	    }
	    
	    System.out.println("\n___________\nFIM DA MULTIPLICAÇÃO\n___________\n");
	}
}
