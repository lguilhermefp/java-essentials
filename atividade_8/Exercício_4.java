package atividade_8;

public class Exerc�cio_4 {

	Exerc�cio_4(){
		
		int n�mero = 0;
		int quantidadeCara = 0;
		int quantidadeCoroa = 0;
		
		for(int i=0;i<1000000;i++) {
			n�mero = n�meroAleat�rio(0, 1);
			if(n�mero == 0) {quantidadeCara++;}
			if(n�mero == 1) {quantidadeCoroa++;}
		}
		
		System.out.println("Cara: "+quantidadeCara+"\nCoroa: "+quantidadeCoroa);
	}
	
	int n�meroAleat�rio(int a, int b) {
		return (int)(a+(Math.random()*(b-a+1)));
	}
	
	public static void main(String[] args) {
		
		new Exerc�cio_4();
	}
}
