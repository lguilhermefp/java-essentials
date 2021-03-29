package atividade_b3_8;

public class Exercicio_3_ContaExecutiva extends Exercicio_3 {
	    private double saldo;
	    private boolean historico;

	    public Exercicio_3_ContaExecutiva(){
	        this.saldo = 0;
	        this.historico = false;
	    }

	    public Exercicio_3_ContaExecutiva(double saldo) {
	    	super(saldo);
	        this.historico = false;
	    }


	    // particular
	    public String consultarFatura(){
	        return "Nivel 2 do detalhamento";
	    }
}
