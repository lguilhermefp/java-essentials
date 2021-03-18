package atividade_8;

public class Exercício_6 {

	Exercício_6(){
		Bhaskara(1, 12, -13);
	}
	
	void Bhaskara(int a, int b, int c) {
		
		double delta = b*b-(4*a*c);
		double raizes = 0; 
		double x1;
		double x2;
		
		if(delta>0) {raizes = 2;}
		else if(delta==0) {raizes = 1;}
		else {raizes = 0;}
		
		System.out.println("Delta: "+delta);
		
		if(raizes == 0) {
			System.out.println("Não há raízes reais");
			return;
		}
		if(raizes == 2){
			x1 = (-b + Math.sqrt(delta))/2*a;
			x2 = (-b - Math.sqrt(delta))/2*a;
			System.out.println("Raízes:\n"+x1+"\n"+x2);
		}
		if(raizes == 1) {
			x1 = (-b + Math.pow(delta, 1/2))/2;
			System.out.println("Raíz: "+x1);
		}
	}
	
	public static void main(String[] args) {
		
		new Exercício_6();
	}
}
