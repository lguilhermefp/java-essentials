package atividade_4;

public class Questao04 {

	Questao04() {
		
		long elemento1 = 1;
		long elemento2 = 1;
		long elementoAtual = 0;
		
		System.out.println(elemento1);
		System.out.println(elemento2);
		
		for(int i=0; i<8; i++) {
			elementoAtual = elemento1 + elemento2;
			elemento1 = elemento2;
			elemento2 = elementoAtual;
			
			System.out.println(elementoAtual);
		}
		
		//Limite int: 46 elementos
		/*for(int i=0; i<44; i++) {
			elementoAtual = elemento1 + elemento2;
			elemento1 = elemento2;
			elemento2 = elementoAtual;
			
			System.out.println(elementoAtual);
		}*/
		
		//Limite long: 92 elementos
		/*for(int i=0; i<90; i++) {
			elementoAtual = elemento1 + elemento2;
			elemento1 = elemento2;
			elemento2 = elementoAtual;
			
			System.out.println(elementoAtual);
		}*/
	}
	
	public static void main(String[] args) {
		new Questao04();
	}
}
