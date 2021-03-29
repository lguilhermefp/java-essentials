package atividade_b4_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("e");
		nomes.add("a");
		nomes.add("b");
		nomes.add("d");
		nomes.add("c");
		nomes.add(0, "z");
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}
}
