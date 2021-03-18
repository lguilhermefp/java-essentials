package atividade_b2_2;

	import java.text.NumberFormat;
	import java.util.Locale;

	public class Exercício_5 {

	    final static byte MESES_EM_ANO = 12;
	    final static int PORCENTAGEM = 100;
	    static int numeroImprestimo = 1;

	    public static void main(String[] args) {
	    	
	    	Calcular(180_000, 4, 10);
	    	Calcular(90_000, 4, 5);
	    	Calcular(45_000, 4, 2);
	    }
	    
	    //método para calcular quanto falta
	    static void Calcular(int emprestimo, double jurosAno, int periodoAnos){
	    	
	    	Locale meuLocal = new Locale( "pt", "BR" );
	        NumberFormat currency = NumberFormat.getCurrencyInstance(meuLocal);
	        
	    	double jurosMes = (jurosAno/PORCENTAGEM)/MESES_EM_ANO;
	    	int periodoMeses = periodoAnos * MESES_EM_ANO;
	    	
	    	System.out.printf("\n(%d) Emprestimo = %d\n", numeroImprestimo, emprestimo);
		    System.out.printf("(%d) Juros ao ano: %.2f\n", numeroImprestimo, jurosAno);
		    System.out.printf("(%d) Periodo (anos): %d\n", numeroImprestimo, periodoAnos);
		    System.out.printf("(%d) Valor restante\n", numeroImprestimo);
		    System.out.println("______________");
		    numeroImprestimo++;
	    	
	    	for (int mes = 1; mes <= periodoAnos * MESES_EM_ANO; mes++) {
	    		double balance = emprestimo*( (Math.pow(1 + jurosMes, periodoMeses) - Math.pow(1 + jurosMes, mes)) / (Math.pow(1+jurosMes, periodoMeses) - 1) );
	    		System.out.println(currency.format(balance));
	    	}
	    }//Fim do método para calcular quanto falta
	}
