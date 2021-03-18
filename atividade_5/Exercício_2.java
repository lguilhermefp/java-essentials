package atividade_5;

public class Exercício_2 {
	
double população = 10_000_000, taxaDeNatalidade=14, taxaDeMortalidade=8;
	
	//Construtor
	Exercício_2(){
		System.out.println(variaçãoDePopulação(10));
	}
	
	//Método
	int variaçãoDePopulação(int anos){
		for(int i=0; i<anos; i++) {
			if(taxaDeNatalidade >= 8) { taxaDeNatalidade --; }
			
			if(taxaDeMortalidade >= 7) { taxaDeMortalidade --; }
			população = população + (taxaDeNatalidade - taxaDeMortalidade)*população/1000;

		}
		return (int)população;
	}
	
	//Método main
	public static void main(String[] args) {
		new Exercício_2();
	}
}
