package atividade_8;

public class Exerc�cio_3 {

	Exerc�cio_3(){
		
		double somaN�merosNegativos = 0;
		double quantidadeFatoresNegativos = 0;
		double somaN�merosPositivos = 0;
		double quantidadeFatoresPositivos = 0;
		
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
		
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] < 0) {
				somaN�merosNegativos = somaN�merosNegativos + entrada[i];
				quantidadeFatoresNegativos++;
			}
		}
		
		for(int i=0; i<entrada.length; i++) {
			if(entrada[i] > 0) {
				somaN�merosPositivos = somaN�merosPositivos + entrada[i];
				quantidadeFatoresPositivos++;
			}
		}
		
		double m�diaNegativos  = somaN�merosNegativos/quantidadeFatoresNegativos;
		double m�diaPositivos  = somaN�merosPositivos/quantidadeFatoresPositivos;

		if(somaN�merosPositivos > somaN�merosNegativos) {
			System.out.println("O array fornecido possui mais n�meros positivos que negativos("+(int)quantidadeFatoresPositivos+" vs "+
					(int)quantidadeFatoresNegativos+")"+"\nA m�dia dos n�meros positivos � "+(int)m�diaPositivos+"\nA m�dia dos n�meros negativos � "+
					(int)m�diaNegativos);
		}
		else if(somaN�merosNegativos > somaN�merosPositivos) {
			System.out.println("O array fornecido possui mais n�meros negativos que positivos("+(int)quantidadeFatoresNegativos+" vs "+
					(int)quantidadeFatoresPositivos+")"+"\nA m�dia dos n�meros positivos � "+(int)m�diaPositivos+"\nA m�dia dos n�meros negativos � "+
					m�diaNegativos);
		}
		else {
			System.out.println("O array fornecido possui a mesma quantidade de n�meros negativos que de positivos("+
					(int)quantidadeFatoresNegativos+" vs "+(int)quantidadeFatoresPositivos+")"+"\nA m�dia dos n�meros positivos � "+(int)m�diaPositivos+
					"\nA m�dia dos n�meros negativos � "+(int)m�diaNegativos);
		}
	}
	
	public static void main(String[] args) {
		
		new Exerc�cio_3();
	}
}
