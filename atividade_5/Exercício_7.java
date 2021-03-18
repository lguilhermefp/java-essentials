package atividade_5;

public class Exercício_7 {

	Exercício_7(){
		double raio=5.5;
		double perímetro = 2*raio*Math.PI;
		double área = raio*raio*Math.PI;
		System.out.println("Círculo de raio "+raio+" possui perímetro "+perímetro+" e área "+área);
	}
	
	public static void main(String[] args) {
		new Exercício_7();
	}
}
