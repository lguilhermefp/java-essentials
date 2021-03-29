package atividade_4;

public class Questao02 {

	Questao02(){
		
		//PARES
		for(int i=0; i<=100_000; i+=2) {
			System.out.println(i);
		}
		
		//IMPARES
		for(int i=1; i<=100_000; i+=2) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		new Questao02();
	}
}
