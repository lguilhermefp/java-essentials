package atividade_5;

public class N�merosPrimos {

	//Construtor
	N�merosPrimos(){
		for(int i=2; i<=1000; i++) {
			primos(i);
		}
	}
	
	//M�todo
	void primos(int n�mero){
		
		boolean primo = true;
		
			for(int i=2; i<n�mero; i++) {
				primo = true;
				if(n�mero%i==0) {/*System.out.println(n�mero+" n�o � primo, ");*/ primo = false; break;}
			}
		if(primo == true) {
			System.out.printf("%d, ",n�mero);
		}
	}
	
	public static void main(String[] args) {
		new N�merosPrimos();
	}
}
