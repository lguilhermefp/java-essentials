package atividade_b2_2;

public class Exercício_4_ResultadosArrays {

	public static void main(String[] args) {
		
		int vetor1[] = new int[Exercício_4_CriaçãoArrays.tamanhoVetor];
		vetor1 = Exercício_4_CriaçãoArrays.CriaçãoArrays(100);
		
		Exercício_4_MultiplicaçãoArrays.Multiplicação(vetor1);
		Exercício_4_SomaArrays.Soma(vetor1);
	}
}
