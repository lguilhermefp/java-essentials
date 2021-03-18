package atividade_5;

public class Exercício_6 {
	
	double denominador = 3;
	double variávelDeSoma=0;	int sinal = -1;
	
	
	Exercício_6(){
		
		//a
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11)
		/*
		for(int i=0; i<5; i++) {

			variávelDeSoma = variávelDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		*/
		
		//b
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11+1/13)
		/*
		for(int i=0; i<6; i++) {

			variávelDeSoma = variávelDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		*/
		
		//c
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11+1/13+...)
		for(int i=0; i<100_000_000; i++) {

			variávelDeSoma = variávelDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		
		System.out.println("pi = "+ 4*(1+variávelDeSoma));
	}
	
	public static void main(String[] args) {
		new Exercício_6();
	}

}
