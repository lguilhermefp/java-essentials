package atividade_b4_2;

public class Celular {
    protected String fabricante;
    protected String modelo;
    protected String IMEI;

    public Celular(String fabricante, String modelo, String IMEI) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.IMEI = IMEI;
    }
    boolean equals(Celular a) {
    	if (a.IMEI == IMEI){
    		return true;
    	}
    	return false;
    }
}
