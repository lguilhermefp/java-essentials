package atividade_4;

public class Questão05 {
	
	Questão05(){
		inversão(-1234567);
	}
	
	void inversão(int numeroAInverter){
		
		int numeroInvertido = 0;
		boolean sinalNegativo = false;
		
		if(numeroAInverter<0) {
			numeroAInverter *= -1;
			sinalNegativo = true;
		}
		
		int algarismos = 0;
		
		if(numeroAInverter < 10) {
			algarismos = 1;
		}
		else if(numeroAInverter/10 < 10) {
			algarismos = 2;
		}
		else if(numeroAInverter/100 < 10) {
			algarismos = 3;
		}
		else if(numeroAInverter/1_000 < 10) {
			algarismos = 4;
		}
		else if(numeroAInverter/10_000 < 10) {
			algarismos = 5;
		}
		else if(numeroAInverter/100_000 < 10) {
			algarismos = 6;
		}
		else if(numeroAInverter/1_000_000 < 10) {
			algarismos = 7;
		}
		else if(numeroAInverter/10_000_000 < 10) {
			algarismos = 8;
		}
		else if(numeroAInverter/100_000_000 < 10) {
			algarismos = 9;
		}
		else {
			System.out.println("Erro");
		}
		
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		int a7 = 0;
		int a8 = 0;
		int a9 = 0;
		
		if(algarismos == 9) {
			a9 = numeroAInverter/100000000;
			a8 = numeroAInverter/10000000 - a9*10;
			a7 = numeroAInverter/1000000 - a9*100 - a8 * 10;
			a6 = numeroAInverter/100000 - a9*1000 - a8 * 100 - a7*10;
			a5 = numeroAInverter/10000 - a9*10000 - a8 * 1000 - a7*100 - a6*10;
			a4 = numeroAInverter/1000 - a9*100000 - a8 * 10000 - a7*1000 - a6*100 - a5*10;
			a3 = numeroAInverter/100 - a9*1000000 - a8 * 100000 - a7*10000 - a6*1000 - a5*100 - a4*10;
			a2 = numeroAInverter/10 - a9*10000000 - a8 * 1000000 - a7*100000 - a6*10000 - a5*1000 - a4*100 - a3*10;
			a1 = numeroAInverter - a9*100000000   - a8 * 10000000 - a7*1000000 - a6*100000 - a5*10000 - a4*1000 - a3*100 - a2*10;
			
			numeroInvertido = a1*100000000+a2*10000000+a3*1000000+a4*100000+a5*10000+a6*1000+a7*100+a8*10+a9;
		}
		

		if(algarismos == 8) {
			a8 = numeroAInverter/10000000;
			a7 = numeroAInverter/1000000 - a8*10;
			a6 = numeroAInverter/100000 - a8*100 - a7 * 10;
			a5 = numeroAInverter/10000 - a8*1000 - a7 * 100 - a6*10;
			a4 = numeroAInverter/1000 - a8*10000 - a7 * 1000 - a6*100 - a5*10;
			a3 = numeroAInverter/100 - a8*100000 - a7 * 10000 - a6*1000 - a5*100 - a4*10;
			a2 = numeroAInverter/10 - a8*1000000 - a7 * 100000 - a6*10000 - a5*1000 - a4*100 - a3*10;
			a1 = numeroAInverter/1 - a8*10000000 - a7 * 1000000 - a6*100000 - a5*10000 - a4*1000 - a3*100 - a2*10;
			
			numeroInvertido = a1*10000000+a2*1000000+a3*100000+a4*10000+a5*1000+a6*100+a7*10+a8;
		}
		
		if(algarismos == 7) {
			a7 = numeroAInverter/1000000;
			a6 = numeroAInverter/100000 - a7*10;
			a5 = numeroAInverter/10000 - a7*100 - a6 * 10;
			a4 = numeroAInverter/1000 - a7*1000 - a6 * 100 - a5*10;
			a3 = numeroAInverter/100 - a7*10000 - a6 * 1000 - a5*100 - a4*10;
			a2 = numeroAInverter/10 - a7*100000 - a6 * 10000 - a5*1000 - a4*100 - a3*10;
			a1 = numeroAInverter/1 - a7*1000000 - a6 * 100000 - a5*10000 - a4*1000 - a3*100 - a2*10;
			
			numeroInvertido = a1*1000000+a2*100000+a3*10000+a4*1000+a5*100+a6*10+a7;
		}
		
		if(algarismos == 6) {
			a6 = numeroAInverter/100000;
			a5 = numeroAInverter/10000 - a6*10;
			a4 = numeroAInverter/1000 - a6*100 - a5 * 10;
			a3 = numeroAInverter/100 - a6*1000 - a5 * 100 - a4*10;
			a2 = numeroAInverter/10 - a6*10000 - a5 * 1000 - a4*100 - a3*10;
			a1 = numeroAInverter/1 - a6*100000 - a5 * 10000 - a4*1000 - a3*100 - a2*10;
			
			numeroInvertido = a1*100000+a2*10000+a3*1000+a4*100+a5*10+a6;
		}
		
		if(algarismos == 5) {
			a5 = numeroAInverter/10000;
			a4 = numeroAInverter/1000 - a5*10;
			a3 = numeroAInverter/100 - a5*100 - a4 * 10;
			a2 = numeroAInverter/10 - a5*1000 - a4 * 100 - a3*10;
			a1 = numeroAInverter/1 - a5*10000 - a4 * 1000 - a3*100 - a2*10;
			
			numeroInvertido = a1*10000+a2*1000+a3*100+a4*10+a5;
		}
		
		if(algarismos == 4) {
			a4 = numeroAInverter/1000;
			a3 = numeroAInverter/100 - a4*10;
			a2 = numeroAInverter/10 - a4*100 - a3 * 10;
			a1 = numeroAInverter/1 - a4*1000 - a3 * 100 - a2*10;
			
			numeroInvertido = a1*1000+a2*100+a3*10+a4;
		}
		if(algarismos == 3) {
			a3 = numeroAInverter/100;
			a2 = numeroAInverter/10 - a3*10;
			a1 = numeroAInverter/1 - a3*100 - a2 * 10;
			
			numeroInvertido = a1*100+a2*10+a3;
		}
		if(algarismos == 2) {
			a2 = numeroAInverter/10;
			a1 = numeroAInverter/1 - a2*10;
			
			numeroInvertido = a1*10+a2;
		}
		if(algarismos == 1) {
			a1 = numeroAInverter;
			
			numeroInvertido = a1;
		}
		
		if(sinalNegativo == false) {
		System.out.println("número invertido: "+numeroInvertido);
		}else {
			System.out.println("número invertido: "+-numeroInvertido);
		}
	}
	
	public static void main(String[] args) {
		new Questão05();
	}
}
