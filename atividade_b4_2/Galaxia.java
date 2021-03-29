package atividade_b4_2;

public class Galaxia {
    protected String nome;
    protected String tamanho;
    protected String distanciaDaTerra;
    protected double idade;
    protected double rightAscension;
    protected double declination;

    public Galaxia(String nome, String tamanho, String distanciaDaTerra, double idade, double rightAscension, double declination) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.distanciaDaTerra = distanciaDaTerra;
        this.idade = idade;
        this.rightAscension = rightAscension;
        this.declination = declination;
    }
    boolean equals(Galaxia a) {
    	if (a.rightAscension == rightAscension
    			&&
    			a.declination == declination){
    		return true;
    	}
    	return false;
    }
}
