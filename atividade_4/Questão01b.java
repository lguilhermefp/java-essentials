package atividade_4;

public class Questão01b {
	
	//Construtor
	Questão01b(){
		
		//estiloImpressão01();
		estiloImpressão02();
	}
	
	//Método 1
	double estiloImpressão01(){
		
		double impressoes = 0; 
		
		while(impressoes<1000000000) {
			impressoes +=60;
			for(int i=0; i<60; i++) {
			System.out.println("Anúncio estilo 1 \n");
			}
			System.out.println("impressões no estilo 1: "+impressoes);
			try { Thread.sleep (10000); } catch (InterruptedException ex) {}
		}
		return impressoes;
	}
	
	//Estilo 2
	int estiloImpressão02(){
		
		int impressoes = 0; 
		int bateria = 100;
		
		while(bateria>0) {
			impressoes += 1;
			bateria -= 0.1;
			System.out.println("Anúncio estilo 2 \n");
		System.out.println("impressões no estilo 2: "+impressoes);
			try { Thread.sleep (60000); } catch (InterruptedException ex) {}
		}
		return impressoes;	
	}
	
	//Método main
	public static void main(String args[]) {
		new Questão01b();
	}
}
