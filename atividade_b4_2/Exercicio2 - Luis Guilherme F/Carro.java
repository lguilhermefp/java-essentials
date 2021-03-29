package atividade_b4_2;

public class Carro {
    protected String marca;
    protected String modelo;
    protected String anoFabricao;
    protected String chassi;

    public Carro(String marca, String modelo, String anoFabricao, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricao = anoFabricao;
        this.chassi = chassi;
    }
    
    boolean equals(Carro a) {
    	if (a.chassi == chassi){
    		return true;
    	}
    	return false;
    }
}
