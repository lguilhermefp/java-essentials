package atividade_b2_2;

public class Exercício_3 {
	
	    public static double somar(double a, double b){
	        return a+b;
	    }

	    public static double subtrair(double a, double b){
	        return a-b;
	    }

	    public static double multiplicar(double a, double b){
	        return a*b;
	    }

	    public static double somarArray(double array[]){
	        double soma = 0;
	        for (int i = 0; i < array.length; i++) {
	            soma += array[i];
	        }
	        return soma;
	    }

	    public static void main(String[] args) {
	        double operando1 = 30.5;
	        double operando2 = 45.5;
	        double[] array = {10,20,30,40,50};

	        System.out.println(somar(operando1, operando2));
	        System.out.println(subtrair(operando1, operando2));
	        System.out.println(somarArray(array));
	        System.out.println(multiplicar(operando1, operando2));

	    }
	}
