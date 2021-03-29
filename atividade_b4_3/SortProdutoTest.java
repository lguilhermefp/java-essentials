package atividade_b4_3;

import java.util.*;

class ProdutoNomeComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto o1, Produto o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
	
}

public class SortProdutoTest {

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("1", "D", 4000.0);
		Produto produto2 = new Produto("2", "B", 3000.0);
		Produto produto3 = new Produto("4", "C", 2000.0);
		Produto produto4 = new Produto("3", "A", 1000.0);
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		Collections.sort(produtos, new ProdutoNomeComparator());
		
		for(Produto produto : produtos) {
			System.out.println(produto);
		}
	}
}
