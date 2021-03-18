package atividade_5;

public class Exercício_10 {

	double velocidadeInicial = 5.5, velocidadeFinal = 50.9, tempo = 4.5, velocidadeMédia;
	
	Exercício_10(){
		
		CáuculoVelocidadeMédia();
		
		System.out.printf("velocidade inicial: %.2f", velocidadeInicial);
		System.out.printf("velocidade final: %.2f", velocidadeFinal);
		System.out.printf("tempo: %.2f", tempo);
		System.out.printf("velocidade média: %.2f", velocidadeMédia);
	}
	
	void CáuculoVelocidadeMédia(){
		velocidadeMédia = (velocidadeFinal - velocidadeInicial)/tempo;
	}
	
	public static void main(String[] args) {
		new Exercício_10();
	}
}
