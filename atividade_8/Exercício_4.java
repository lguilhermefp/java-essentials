package atividade_8;

public class Exercício_4 {

	Exercício_4(){
		
		int número = 0;
		int quantidadeCara = 0;
		int quantidadeCoroa = 0;
		
		for(int i=0;i<1000000;i++) {
			número = númeroAleatório(0, 1);
			if(número == 0) {quantidadeCara++;}
			if(número == 1) {quantidadeCoroa++;}
		}
		
		System.out.println("Cara: "+quantidadeCara+"\nCoroa: "+quantidadeCoroa);
	}
	
	int númeroAleatório(int a, int b) {
		return (int)(a+(Math.random()*(b-a+1)));
	}
	
	public static void main(String[] args) {
		
		new Exercício_4();
	}
}
