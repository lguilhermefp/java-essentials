package atividade_b2_5;

public class E5_Teste {

	public static void main(String[] args) {
		
		E5_MeuInteiro valor = new E5_MeuInteiro(1);
		E5_MeuInteiro valor2 = new E5_MeuInteiro(1);
		
		//É par
		System.out.println("\npar()");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.par());
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.par());
		valor.setMeuInteiro(7);
		System.out.println("7. "+valor.par());
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.par());
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.par());
		
		//É ímpar
		System.out.println("\nimpar()");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.impar());
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.impar());
		valor.setMeuInteiro(7);
		System.out.println("7. "+valor.impar());
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.impar());
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.impar());
		
		//É primo
		System.out.println("\nprimo()");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.primo());
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.primo());
		valor.setMeuInteiro(7);		
		System.out.println("7. "+valor.primo());		
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.primo());
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.primo());
		
		//É par (int)
		System.out.println("\npar(int)");
		System.out.println("5. "+valor.par(5));
		System.out.println("6. "+valor.par(6));
		System.out.println("7. "+valor.par(7));
		System.out.println("8. "+valor.par(8));
		System.out.println("9. "+valor.par(9));
		
		//É ímpar (int)
		System.out.println("\nímpar(int)");
		System.out.println("5. "+valor.impar(5));
		System.out.println("6. "+valor.impar(6));
		System.out.println("7. "+valor.impar(7));
		System.out.println("8. "+valor.impar(8));
		System.out.println("9. "+valor.impar(9));
		
		//É par (MeuInteiro)
		System.out.println("\npar(MeuInteiro)");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.par(valor));
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.par(valor));
		valor.setMeuInteiro(7);
		System.out.println("7. "+valor.par(valor));
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.par(valor));
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.par(valor));
		
		//É ímpar (MeuInteiro)
		System.out.println("\nímpar(MeuInteiro)");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.impar(valor));
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.impar(valor));
		valor.setMeuInteiro(7);
		System.out.println("7. "+valor.impar(valor));
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.impar(valor));
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.impar(valor));
		
		//É primo (MeuInteiro)
		System.out.println("\nprimo(MeuInteiro)");
		valor.setMeuInteiro(5);
		System.out.println("5. "+valor.primo(valor));
		valor.setMeuInteiro(6);
		System.out.println("6. "+valor.primo(valor));
		valor.setMeuInteiro(7);
		System.out.println("7. "+valor.primo(valor));
		valor.setMeuInteiro(8);
		System.out.println("8. "+valor.primo(valor));
		valor.setMeuInteiro(9);
		System.out.println("9. "+valor.primo(valor));
		
		//É igual (int)
		System.out.println("\nigual(int)");
		valor.setMeuInteiro(9);
		System.out.println("5. "+valor.igual(5));
		System.out.println("7. "+valor.igual(7));
		System.out.println("9. "+valor.igual(9));
		
		//É igual (MeuInteiro)
		System.out.println("\nigual(MeuInteiro)");
		valor.setMeuInteiro(9);
		valor2.setMeuInteiro(5);
		System.out.println("5. "+valor.igual(valor2.valor));
		valor2.setMeuInteiro(7);
		System.out.println("7. "+valor.igual(valor2.valor));
		valor2.setMeuInteiro(9);
		System.out.println("9. "+valor.igual(valor2.valor));
	}
}
