package atividade_b2_2;

import java.util.Random;

public class Exercício_4_CriaçãoArrays {

	static int tamanhoVetor = 50;
	static int A[] = new int[tamanhoVetor];
	
	static int[] CriaçãoArrays(int intervalo) {
		Random rand = new Random();
	    int sinal = 0;
	    
	    System.out.println("Vetor:");
	    
	    for(int i=0; i<tamanhoVetor; i++) {
	    	//Sinal
	    	int x = rand.nextInt(intervalo);
	    	if(x>(intervalo/2)) {
	    		sinal = -1;
	    	}else{
	    		sinal = 1;
	    	}
	    	
	    	A[i] = rand.nextInt(intervalo) * sinal;
	    	System.out.printf("%d, ",A[i]);
	    	
	    	if(i == tamanhoVetor/2 - 1) {System.out.println("\nVetor: ");}
	    }
	    return A;
	}
}
