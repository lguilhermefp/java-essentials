package atividade_4;

public class Quest�o01b {
	
	//Construtor
	Quest�o01b(){
		
		//estiloImpress�o01();
		estiloImpress�o02();
	}
	
	//M�todo 1
	double estiloImpress�o01(){
		
		double impressoes = 0; 
		
		while(impressoes<1000000000) {
			impressoes +=60;
			for(int i=0; i<60; i++) {
			System.out.println("An�ncio estilo 1 \n");
			}
			System.out.println("impress�es no estilo 1: "+impressoes);
			try { Thread.sleep (10000); } catch (InterruptedException ex) {}
		}
		return impressoes;
	}
	
	//Estilo 2
	int estiloImpress�o02(){
		
		int impressoes = 0; 
		int bateria = 100;
		
		while(bateria>0) {
			impressoes += 1;
			bateria -= 0.1;
			System.out.println("An�ncio estilo 2 \n");
		System.out.println("impress�es no estilo 2: "+impressoes);
			try { Thread.sleep (60000); } catch (InterruptedException ex) {}
		}
		return impressoes;	
	}
	
	//M�todo main
	public static void main(String args[]) {
		new Quest�o01b();
	}
}
