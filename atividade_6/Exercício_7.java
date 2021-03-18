package atividade_6;

public class Exercício_7 {

	Exercício_7(){
		int quantidadeDeFuncionarios = 3;
		String[] stringFuncionários = new String[quantidadeDeFuncionarios];
		int intFuncionários[] = new int[quantidadeDeFuncionarios];
		
			stringFuncionários[0] = "João";
			stringFuncionários[1] = "Maria";
			stringFuncionários[2] = "Pedro";
			
			intFuncionários[0] = 26;
			intFuncionários[1] = 21;
			intFuncionários[2] = 28;
			
			for(int i=0; i<quantidadeDeFuncionarios; i++) {
				System.out.println("Nome do funcionário é "+stringFuncionários[i]+" e sua idade é "+intFuncionários[i]);
			}
	}
	
	public static void main(String[] args) {
		new Exercício_7();
	}
}
