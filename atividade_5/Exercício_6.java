package atividade_5;

public class Exerc�cio_6 {
	
	double denominador = 3;
	double vari�velDeSoma=0;	int sinal = -1;
	
	
	Exerc�cio_6(){
		
		//a
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11)
		/*
		for(int i=0; i<5; i++) {

			vari�velDeSoma = vari�velDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		*/
		
		//b
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11+1/13)
		/*
		for(int i=0; i<6; i++) {

			vari�velDeSoma = vari�velDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		*/
		
		//c
		//pi = 4*(1-1/3+1/5-1/7+1/9-1/11+1/13+...)
		for(int i=0; i<100_000_000; i++) {

			vari�velDeSoma = vari�velDeSoma + sinal/denominador;
			if(sinal<0) {sinal = 1;} else{sinal = -1;}
			denominador += 2;
		}
		
		System.out.println("pi = "+ 4*(1+vari�velDeSoma));
	}
	
	public static void main(String[] args) {
		new Exerc�cio_6();
	}

}
