package atividade_b2_2;

public class Exercício_2_Estudante {

	String nome = "A";
	int idade = 0;
	double[] notas = {5, 4, 4};
	double média = 0;
	
	void aprovação() {
		
		for(int i=0; i<notas.length; i++) {
			média = média + (notas[i]/notas.length);
		}
		
		System.out.printf("Média: %.2f\n", média);
		
		if(média > 6) {System.out.println("Aprovado");}
		else {System.out.println("Reprovado");}
	}
	
	Exercício_2_Estudante(){
		aprovação();
	}
	
	public static void main(String[] args) {
		new Exercício_2_Estudante();
	}
}
