package atividade_b3_5;

public class Exercicio_7_Gato {

	static double limitacaoCorrer = 2;
	static double limitacaoPular = 200;
	static int pararCorrer = 0;
	static int pararPular = 0;
	
	static void correr(int obstaculo){
		
		if(pararCorrer==0) {
			if(limitacaoCorrer < obstaculo) {
				System.out.println("Gato n�o conseguiu correr "+obstaculo+"km. M�ximo � de 2km"); pararCorrer = 1;
			}else {
				System.out.println("Gato conseguiu correr "+obstaculo+"km");
			}
		}
	}
	
	static void pular(int obstaculo){
		if(pararPular == 0) {
			if(limitacaoPular < obstaculo) {
					System.out.println("Gato n�o conseguiu pular "+obstaculo+"cm. M�ximo � de 200cm");  pararPular = 1;
			}else {
					System.out.println("Gato conseguiu correr "+obstaculo+"km"); 
			}
		}
	}
}
