package atividade_4;

public class Questao01b {
	
	//Construtor
	Questao01b(){
		
		//estiloImpressao01();
		estiloImpressao02();
	}
	
	//Metodo 1
	double estiloImpressao01(){
		
		double impressoes = 0; 
		
		while(impressoes<1000000000) {
			impressoes +=60;
			for(int i=0; i<60; i++) {
			System.out.println("Anuncio estilo 1 \n");
			}
			System.out.println("impressoes no estilo 1: "+impressoes);
			try { Thread.sleep (10000); } catch (InterruptedException ex) {}
		}
		return impressoes;
	}
	
	//Estilo 2
	int estiloImpressao02(){
		
		int impressoes = 0; 
		int bateria = 100;
		
		while(bateria>0) {
			impressoes += 1;
			bateria -= 0.1;
			System.out.println("Anuncio estilo 2 \n");
		System.out.println("impressoes no estilo 2: "+impressoes);
			try { Thread.sleep (60000); } catch (InterruptedException ex) {}
		}
		return impressoes;	
	}
	
	//Metodo main
	public static void main(String args[]) {
		new Questao01b();
	}
}
