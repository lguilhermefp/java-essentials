package atividade_b3_5;

public class Exercicio_7_Robo {
	
	static double limitacaoCorrer = 10;
	static double limitacaoPular = 50;
	static int pararCorrer = 0;
	static int pararPular = 0;
	
	static void correr(int obstaculo){
		
	if(pararCorrer==0) {
		if(limitacaoCorrer < obstaculo) {
				System.out.println("Robo n�o conseguiu correr "+obstaculo+"km. M�ximo � de 10km");  pararCorrer = 1;
			}else {
				System.out.println("Robo conseguiu correr "+obstaculo+"km"); 
			}
		}
	}
	
	static void pular(int obstaculo){
		if(pararPular == 0) {
			if(limitacaoPular < obstaculo) {
					System.out.println("Robo n�o conseguiu pular "+obstaculo+"cm. M�ximo � de 50cm");  pararPular = 1;
			}else {
					System.out.println("Robo conseguiu correr "+obstaculo+"km"); 
			}
		}
	}

	Exercicio_7_Robo(){
		
	}
}
