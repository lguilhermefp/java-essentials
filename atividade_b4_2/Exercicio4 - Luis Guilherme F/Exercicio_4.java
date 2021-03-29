package atividade_b4_2;

import java.util.*;

public class Exercicio_4 {

	public static void main(String[] args) {
		double[] array = new double[10];
		
		for(int i=0; i<20; i++) {
			//usar try catch com excecao ArrayIndexOutOfBoundsException
			try{
				array[i] = i;
				System.out.println(array[i]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("limite estourado");
			}
		}
		
		ArrayList<Double> a = new ArrayList<Double>(10);
		System.out.println("Tamanho: "+a.size());
		for(int i=0; i<20; i++) {
			a.add(i, (double)i);
			System.out.println(a.get(i) +"; "+ a.size());
		}
		System.out.println("Nao e possivel estabelecer um tamanho predefinido de ArrayList");
	}
}
