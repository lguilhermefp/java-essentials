package atividade_8;

public class Exerc�cio_8 {

	double pre�oViagem;
	
	Exerc�cio_8(){
		Viagem(100, 12, 4.09);
	}
	
	void Viagem(double dist�ncia, double kmLitro, double pre�oLitro){
		pre�oViagem = (dist�ncia/kmLitro)*pre�oLitro;
		System.out.printf("O pre�o da viagem de %.2fkm em um carro que faz %.0fkm/litro � R$%.2f",dist�ncia,kmLitro,pre�oViagem);
	}
	
	public static void main(String[] args) {
		
		new Exerc�cio_8();
	}
}
