package atividade_b2_2;

public class Exerc�cio_2_Estudante {

	String nome = "A";
	int idade = 0;
	double[] notas = {5, 4, 4};
	double m�dia = 0;
	
	void aprova��o() {
		
		for(int i=0; i<notas.length; i++) {
			m�dia = m�dia + (notas[i]/notas.length);
		}
		
		System.out.printf("M�dia: %.2f\n", m�dia);
		
		if(m�dia > 6) {System.out.println("Aprovado");}
		else {System.out.println("Reprovado");}
	}
	
	Exerc�cio_2_Estudante(){
		aprova��o();
	}
	
	public static void main(String[] args) {
		new Exerc�cio_2_Estudante();
	}
}
