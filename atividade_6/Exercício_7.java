package atividade_6;

public class Exerc�cio_7 {

	Exerc�cio_7(){
		int quantidadeDeFuncionarios = 3;
		String[] stringFuncion�rios = new String[quantidadeDeFuncionarios];
		int intFuncion�rios[] = new int[quantidadeDeFuncionarios];
		
			stringFuncion�rios[0] = "Jo�o";
			stringFuncion�rios[1] = "Maria";
			stringFuncion�rios[2] = "Pedro";
			
			intFuncion�rios[0] = 26;
			intFuncion�rios[1] = 21;
			intFuncion�rios[2] = 28;
			
			for(int i=0; i<quantidadeDeFuncionarios; i++) {
				System.out.println("Nome do funcion�rio � "+stringFuncion�rios[i]+" e sua idade � "+intFuncion�rios[i]);
			}
	}
	
	public static void main(String[] args) {
		new Exerc�cio_7();
	}
}
