package atividade_5;

public class Exerc�cio_1 {

	double popula��o = 10_000_000;
	
	//Construtor
	Exerc�cio_1(){
		System.out.println(varia��oDePopula��o(20));
	}
	
	//M�todo
	int varia��oDePopula��o(int anos){
		for(int i=0; i<anos; i++) {
			popula��o = popula��o + 6*popula��o/1000;
		}
		return (int)popula��o;
	}
	
	//M�todo main
	public static void main(String[] args) {
		new Exerc�cio_1();
	}
}
