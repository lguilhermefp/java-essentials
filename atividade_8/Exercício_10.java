package atividade_8;

public class Exerc�cio_10 {

	Exerc�cio_10(){
		System.out.println("A m�nima dist�ncia da pista para esse navio decolar deve ser "+Dist�nciaEscape(120, 6)+"m");
	}
	
	double Dist�nciaEscape(double velocidade, double acelera��o) {
		return (velocidade*velocidade)/(2*acelera��o);
	}
	
	public static void main(String[] args) {
		
		new Exerc�cio_10();
	}
}
