package atividade_5;

public class Exercício_9 {

	double x, y;
	
	Exercício_9(){
		Cramer(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
		System.out.println("Valor de x: "+x+", valor de y: "+y);
	}
	
	void Cramer(double a, double b, double c, double d, double e, double f) {
		x = ((e*d) - (b*f)) / ((a*d) - (b*c));
		y = ((a*f) - (e*c)) / ((a*d) - (b*c));
	}
	
	public static void main(String[] args) {
		new Exercício_9();
	}
}
