package atividade_8;

public class Exercício_5 {

	Exercício_5(){
		System.out.println("Quilogramas	Libras  |	Libras		Quilogramas");
		for(int i=1; i<10; i++) {
			System.out.printf(("%d		%.1f	|	%d		 %.2f%n"),i, QuilogramasLibras(i),i,LibrasQuilogramas(i));
		}
	}
	
	double QuilogramasLibras(int quilogramas){
		return quilogramas * 2.20462;
	}
	double LibrasQuilogramas(int libras){
		return libras / 2.20462;
	}
	
	public static void main(String[] args) {
		
		new Exercício_5();
	}
}
