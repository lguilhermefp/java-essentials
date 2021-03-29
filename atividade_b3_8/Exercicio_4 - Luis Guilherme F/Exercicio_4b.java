package atividade_b3_8;

public class Exercicio_4b {

	    public static void main(String args[])
	    {
	        int a = 30, b = 0;
	        try {
	        	int c = a/b;
		        System.out.println ("Resultado = " + c);
	        }catch(Exception ArithmeticException) {
	        	System.out.println("valor indefinido.");
	        }
	    }
}
