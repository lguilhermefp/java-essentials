package atividade_b3_8;

public class Exercicio_2_Teste {

	public static void sumAndPrint(int x, int y) throws Exception{
        if(x<0 || y<0){
            throw new Exception("Numeros negativos nao permitidos");
        }
        System.out.println("soma -> " + (x+y));
    }
	
	public static void main(String[] args) throws Exception {
		sumAndPrint(0,0);
	}
}
