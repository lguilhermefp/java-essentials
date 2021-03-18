package atividade_5;

public class Exercício_1 {

	double população = 10_000_000;
	
	//Construtor
	Exercício_1(){
		System.out.println(variaçãoDePopulação(20));
	}
	
	//Método
	int variaçãoDePopulação(int anos){
		for(int i=0; i<anos; i++) {
			população = população + 6*população/1000;
		}
		return (int)população;
	}
	
	//Método main
	public static void main(String[] args) {
		new Exercício_1();
	}
}
