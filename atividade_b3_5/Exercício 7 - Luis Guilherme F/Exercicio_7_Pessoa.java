package atividade_b3_5;

public class Exercicio_7_Pessoa {

	static double limitacaoCorrer = 5;
	static double limitacaoPular = 180;
	static int pararCorrer = 0;
	static int pararPular = 0;
	
	static void correr(int obstaculo){
		
		if(limitacaoCorrer < obstaculo) {
			System.out.println("Pessoa n�o conseguiu correr "+obstaculo+"km. M�ximo � de 5km"); pararCorrer = 1;
		}else {
			System.out.println("Pessoa conseguiu correr "+obstaculo+"km");
		}
	}
	
	static void pular(int obstaculo){
		if(pararPular == 0) {
			if(limitacaoPular < obstaculo) {
					System.out.println("Pessoa n�o conseguiu pular "+obstaculo+"cm. M�ximo � de 180cm");  pararPular = 1;
			}else {
					System.out.println("Pessoa conseguiu correr "+obstaculo+"km"); 
			}
		}
	}
}
