package atividade_8;

public class Exercício_10 {

	Exercício_10(){
		System.out.println("A mínima distância da pista para esse navio decolar deve ser "+DistânciaEscape(120, 6)+"m");
	}
	
	double DistânciaEscape(double velocidade, double aceleração) {
		return (velocidade*velocidade)/(2*aceleração);
	}
	
	public static void main(String[] args) {
		
		new Exercício_10();
	}
}
