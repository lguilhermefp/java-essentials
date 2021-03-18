package atividade_6;

import java.util.Random;

public class Exercício_6 {

	//Construtor
	Exercício_6(){
		
		Random rand = new Random();
		int intervalo = 1000; // de -1000 ao 1000
	    int tamanhoDoVetor = 20;
	    int sinal = 0;
	    
	    int A[] = new int[tamanhoDoVetor];
	    int B[] = new int[tamanhoDoVetor];
	    int Soma[] = new int[tamanhoDoVetor];
	    
	    System.out.println("Primeiro Vetor:");
	    
	    for(int i=0; i<tamanhoDoVetor; i++) {
	    	//Sinal
	    	int x = rand.nextInt(intervalo);
	    	if(x>(intervalo/2)) {
	    		sinal = -1;
	    	}else{
	    		sinal = 1;
	    	}
	    	
	    	A[i] = rand.nextInt(intervalo) * sinal;
	    	System.out.printf("%d, ",A[i]);
	    }

	    System.out.println("\n\nSegundo Vetor:");
	    
	    for(int i=0; i<tamanhoDoVetor; i++) {
	    	//Sinal
	    	int x = rand.nextInt(intervalo);
	    	if(x>(intervalo/2)) {
	    		sinal = -1;
	    	}else{
	    		sinal = 1;
	    	}
	    	
	    	B[i] = rand.nextInt(intervalo) * sinal;
	    	System.out.printf("%d, ",B[i]);
	    }
	    
	    System.out.println("\n\nSoma dos Vetores:");
	    
	    for(int i=0; i<tamanhoDoVetor; i++) {
	    	Soma[i] = A[i] + B[i];
	    	System.out.printf("%d, ",Soma[i]);
	    }
	}
	
	//Método main
	public static void main(String[] args) {
		new Exercício_6();
	}
}
