package atividade_4;

public class Questao01a {

	Questao01a() {
		
		int luxes = 0;
		boolean lampada = false;
		String estado = "";
		
		for(luxes=0; luxes<200; luxes+=200) {
			
			lampada = true;
			if(lampada == false) {estado = ". A lampada esta desligada.";}
			if(lampada == true) {estado = ". A lampada esta ligada.";}
			System.out.println("luxes: "+ luxes + estado);
			try { Thread.sleep (60000); } catch (InterruptedException ex) {}
		}
		lampada = false;
		if(lampada == false) {estado = ". A lampada esta desligada.";}
		if(lampada == true) {estado = ". A lampada esta ligada.";}
		System.out.println("luxes: "+ luxes + estado);
	}
	
	public static void main(String[] args) {
		new Questao01a();
	}
}
