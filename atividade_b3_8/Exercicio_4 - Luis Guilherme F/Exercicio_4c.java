package atividade_b3_8;

public class Exercicio_4c {
    public static void main(String args[])
    {
        String a = null;
        try {
        	System.out.println(a.charAt(0));
       }catch(Exception NullPointerException) {
    	   System.out.println("caractere inexistente.");
       }
    }
}
