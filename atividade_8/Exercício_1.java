package atividade_8;

public class Exercício_1 {

	Exercício_1(){
		
		//Variáveis
		double maiorNúmero = -100;
		double menorNúmero = 100;
		double somaNúmeros = 0;
		
		//Vetor
		int[] entrada = {-84,-9,57,38,74,-57,50,56,-78,96,
                -22,-38,-69,50,67,73,-29,-41,-6,42,-34,32,
                78,7,-31,71,-81,65,88,-16,93,-9,-73,96,66,
                -20,52,-47,-38,36,-19,-37,26,-93,-69,-44,
                95,88,45,-8,25,-50,96,75,66,59,49,-90,98,
                86,54,-25,-18,-39,-64,80,-27,59,-41,-69,
                -81,59,43,97,22,65,42,-1,26,82,-25,-27,
                53,38,94,-72,83,-87,56,-40,4,21,-88,-67,
                -6,70,0,-49,32,-53};
		
		//Laços de repetição
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] > maiorNúmero ) {maiorNúmero = entrada[i];}
		}
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] < menorNúmero ) {menorNúmero = entrada[i];}
		}
		for(int i=0; i<entrada.length; i++) {
			somaNúmeros = somaNúmeros + entrada[i];
		}
		
		double média = somaNúmeros/entrada.length;
		
		System.out.println("Número máximo: "+maiorNúmero+"\nNúmero mínimo: "+menorNúmero+"\nMédia: "+média);
	}
	
	public static void main(String[] args) {
		new Exercício_1();
	}
}
