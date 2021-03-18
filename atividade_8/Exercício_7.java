package atividade_8;

public class Exercício_7 {

	Exercício_7(){
		
		int[] entrada = new int[]{121,344,333,874,959,234,523,424,111,232,546};
		
		for (int número : entrada){
			if(número == inverterNúmero(número)) {
				System.out.println(número+" é palíndromo");
			}
			else {
				System.out.println(número+" não é palíndromo");
			}
		}
	}
	
	int inverterNúmero(int número){
		
		int primeiroAlgarismo = número / 100;
		int segundoAlgarismo = número / 10 - (primeiroAlgarismo*10);
		int terceiroAlgarismo = número - (segundoAlgarismo*10) - (primeiroAlgarismo*100);
		
		return terceiroAlgarismo*100 + segundoAlgarismo*10 + primeiroAlgarismo;
	}
	
	public static void main(String[] args) {
		
		new Exercício_7();
	}
}
