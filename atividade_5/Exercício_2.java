package atividade_5;

public class Exerc�cio_2 {
	
double popula��o = 10_000_000, taxaDeNatalidade=14, taxaDeMortalidade=8;
	
	//Construtor
	Exerc�cio_2(){
		System.out.println(varia��oDePopula��o(10));
	}
	
	//M�todo
	int varia��oDePopula��o(int anos){
		for(int i=0; i<anos; i++) {
			if(taxaDeNatalidade >= 8) { taxaDeNatalidade --; }
			
			if(taxaDeMortalidade >= 7) { taxaDeMortalidade --; }
			popula��o = popula��o + (taxaDeNatalidade - taxaDeMortalidade)*popula��o/1000;

		}
		return (int)popula��o;
	}
	
	//M�todo main
	public static void main(String[] args) {
		new Exerc�cio_2();
	}
}
