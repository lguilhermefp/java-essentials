package atividade_5;

public class Exerc�cio_10 {

	double velocidadeInicial = 5.5, velocidadeFinal = 50.9, tempo = 4.5, velocidadeM�dia;
	
	Exerc�cio_10(){
		
		C�uculoVelocidadeM�dia();
		
		System.out.printf("velocidade inicial: %.2f", velocidadeInicial);
		System.out.printf("velocidade final: %.2f", velocidadeFinal);
		System.out.printf("tempo: %.2f", tempo);
		System.out.printf("velocidade m�dia: %.2f", velocidadeM�dia);
	}
	
	void C�uculoVelocidadeM�dia(){
		velocidadeM�dia = (velocidadeFinal - velocidadeInicial)/tempo;
	}
	
	public static void main(String[] args) {
		new Exerc�cio_10();
	}
}
