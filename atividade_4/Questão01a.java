package atividade_4;

public class Quest�o01a {

	Quest�o01a() {
		
		int luxes = 0;
		boolean lampada = false;
		String estado = "";
		
		for(luxes=0; luxes<200; luxes+=200) {
			
			lampada = true;
			if(lampada == false) {estado = ". A l�mpada est� desligada.";}
			if(lampada == true) {estado = ". A l�mpada est� ligada.";}
			System.out.println("luxes: "+ luxes + estado);
			try { Thread.sleep (60000); } catch (InterruptedException ex) {}
		}
		lampada = false;
		if(lampada == false) {estado = ". A l�mpada est� desligada.";}
		if(lampada == true) {estado = ". A l�mpada est� ligada.";}
		System.out.println("luxes: "+ luxes + estado);
	}
	
	public static void main(String[] args) {
		new Quest�o01a();
	}
}
