package atividade_8;

public class Exerc�cio_7 {

	Exerc�cio_7(){
		
		int[] entrada = new int[]{121,344,333,874,959,234,523,424,111,232,546};
		
		for (int n�mero : entrada){
			if(n�mero == inverterN�mero(n�mero)) {
				System.out.println(n�mero+" � pal�ndromo");
			}
			else {
				System.out.println(n�mero+" n�o � pal�ndromo");
			}
		}
	}
	
	int inverterN�mero(int n�mero){
		
		int primeiroAlgarismo = n�mero / 100;
		int segundoAlgarismo = n�mero / 10 - (primeiroAlgarismo*10);
		int terceiroAlgarismo = n�mero - (segundoAlgarismo*10) - (primeiroAlgarismo*100);
		
		return terceiroAlgarismo*100 + segundoAlgarismo*10 + primeiroAlgarismo;
	}
	
	public static void main(String[] args) {
		
		new Exerc�cio_7();
	}
}
