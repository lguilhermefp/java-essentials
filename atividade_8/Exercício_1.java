package atividade_8;

public class Exerc�cio_1 {

	Exerc�cio_1(){
		
		//Vari�veis
		double maiorN�mero = -100;
		double menorN�mero = 100;
		double somaN�meros = 0;
		
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
		
		//La�os de repeti��o
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] > maiorN�mero ) {maiorN�mero = entrada[i];}
		}
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] < menorN�mero ) {menorN�mero = entrada[i];}
		}
		for(int i=0; i<entrada.length; i++) {
			somaN�meros = somaN�meros + entrada[i];
		}
		
		double m�dia = somaN�meros/entrada.length;
		
		System.out.println("N�mero m�ximo: "+maiorN�mero+"\nN�mero m�nimo: "+menorN�mero+"\nM�dia: "+m�dia);
	}
	
	public static void main(String[] args) {
		new Exerc�cio_1();
	}
}
