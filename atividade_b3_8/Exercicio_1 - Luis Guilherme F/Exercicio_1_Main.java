package atividade_b3_8;

public class Exercicio_1_Main {

	public static void main(String[] args) {

		Exercicio_1_Main veiculos[] = new Exercicio_1_Main[3];
		
		Exercicio_1_BarcoMotorizado barco = new Exercicio_1_BarcoMotorizado(50, 30);
		Exercicio_1_Carro carro = new Exercicio_1_Carro(50, 30);
		Exercicio_1_Moto moto = new Exercicio_1_Moto(50, 30);
		System.out.println(barco.toString()+"\n"+carro.toString()+"\n"+moto.toString());

	}
}
