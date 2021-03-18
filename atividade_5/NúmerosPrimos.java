package atividade_5;

public class NúmerosPrimos {

	//Construtor
	NúmerosPrimos(){
		for(int i=2; i<=1000; i++) {
			primos(i);
		}
	}
	
	//Método
	void primos(int número){
		
		boolean primo = true;
		
			for(int i=2; i<número; i++) {
				primo = true;
				if(número%i==0) {/*System.out.println(número+" não é primo, ");*/ primo = false; break;}
			}
		if(primo == true) {
			System.out.printf("%d, ",número);
		}
	}
	
	public static void main(String[] args) {
		new NúmerosPrimos();
	}
}
