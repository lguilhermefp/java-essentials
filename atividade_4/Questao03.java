package atividade_4;

public class Questao03 {

	Questao03(){
		
	long soma = 0;
		
		//PARES
		for(int i=0; i<=100_000; i+=2) {
			soma += i;
		}
			System.out.println(soma);
	}
	
	public static void main(String[] args) {
		new Questao03();
	}
}
