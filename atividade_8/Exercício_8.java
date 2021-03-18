package atividade_8;

public class Exercício_8 {

	double preçoViagem;
	
	Exercício_8(){
		Viagem(100, 12, 4.09);
	}
	
	void Viagem(double distância, double kmLitro, double preçoLitro){
		preçoViagem = (distância/kmLitro)*preçoLitro;
		System.out.printf("O preço da viagem de %.2fkm em um carro que faz %.0fkm/litro é R$%.2f",distância,kmLitro,preçoViagem);
	}
	
	public static void main(String[] args) {
		
		new Exercício_8();
	}
}
