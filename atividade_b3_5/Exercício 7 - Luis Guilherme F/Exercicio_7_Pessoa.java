package atividade_b3_5;

public class Exercicio_7_Pessoa {

	static double limitacaoCorrer = 5;
	static double limitacaoPular = 180;
	static int pararCorrer = 0;
	static int pararPular = 0;
	
	static void correr(int obstaculo){
		
		if(limitacaoCorrer < obstaculo) {
			System.out.println("Pessoa não conseguiu correr "+obstaculo+"km. Máximo é de 5km"); pararCorrer = 1;
		}else {
			System.out.println("Pessoa conseguiu correr "+obstaculo+"km");
		}
	}
	
	static void pular(int obstaculo){
		if(pararPular == 0) {
			if(limitacaoPular < obstaculo) {
					System.out.println("Pessoa não conseguiu pular "+obstaculo+"cm. Máximo é de 180cm");  pararPular = 1;
			}else {
					System.out.println("Pessoa conseguiu correr "+obstaculo+"km"); 
			}
		}
	}
}
