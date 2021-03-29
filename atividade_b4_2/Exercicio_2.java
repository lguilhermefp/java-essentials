package atividade_b4_2;

public class Exercicio_2 {

	public static void main(String[] args) {
		Carro carro_1 = new Carro("Chevrolet", "Camaro", "2011", "ABCDEF");
		Carro carro_2 = new Carro("Chevrolet", "Camaro", "2011", "ABCDEG");
		System.out.println(carro_1.equals(carro_2));
		
		Celular celular_1 = new Celular("Samsumg", "s5", "ABCDEF");
		Celular celular_2 = new Celular("Samsumg", "s4", "ABCDEG");
		System.out.println(celular_1.equals(celular_2));
		
		Galaxia galaxia_1 = new Galaxia("Via Lactea", "1_000_000_000", "0", 1_000_000_000, 100, 100);
		Galaxia galaxia_2 = new Galaxia("Desconhecida", "2_000_000_000", "0", 2_000_000_000, 10, 100);
		System.out.println(galaxia_1.equals(galaxia_2));
		
		Livro livro_1 = new Livro("Harry Potter e A Personalidade Perdida", 500, "JK ROWLING", 2010, "ABCD");
		Livro livro_2 = new Livro("Harry Potter e A Falta Dela", 450, "JK ROWLING", 2009, "ABCE");
		System.out.println(livro_1.equals(livro_2));
	}
}
