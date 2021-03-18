package atividade_b3_5;

public class Exercicio_7_Parede {

	double altura;
	Exercicio_7_Parede(){
		Exercicio_7_Pessoa.pular(50);
		Exercicio_7_Pessoa.pular(80);
		Exercicio_7_Pessoa.pular(120);
		Exercicio_7_Gato.pular(50);
		Exercicio_7_Gato.pular(80);
		Exercicio_7_Gato.pular(120);
		Exercicio_7_Robo.pular(50);
		Exercicio_7_Robo.pular(80);
		Exercicio_7_Robo.pular(120);
	}
	
	public static void main(String[] args) {
		new Exercicio_7_Esteira();
		new Exercicio_7_Parede();
	}
}
