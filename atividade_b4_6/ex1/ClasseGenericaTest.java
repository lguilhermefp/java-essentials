package atividade_b4_6.ex1;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        
        Carro carroAlugado = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugavel.devolverCarro(carroAlugado);
    }
}

class ObjetosAlugaveis<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();
    public ObjetosAlugaveis(List<T> objetosDisponiveis) {
    	this.objetosDisponiveis = objetosDisponiveis;
    }

    public T getObjetoDisponivel(){
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando carro: "+t);
        System.out.println("Carros disponiveis: "+objetosDisponiveis);
        return t;
    }

    public void devolverCarro(T c){
        System.out.println("Devolvendo carro: "+c);
        objetosDisponiveis.add(c);
        System.out.println("Carros disponiveis: "+objetosDisponiveis);
    }
}
