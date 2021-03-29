package atividade_b3_8;

public class Exercicio_3_ContaPadrao extends Exercicio_3 {
	    private double saldo;
	    private boolean historico;

	    public Exercicio_3_ContaPadrao(){
	        this.saldo = 0;
	        this.historico = false;
	    }

	    public Exercicio_3_ContaPadrao(double saldo) {
	    	super(saldo);
	        this.historico = false;
	    }

	    // particular
	    public String consultarFatura(){
	        return "Nivel 3 do detalhamento";
	    }

	    // geral
	    public boolean pedirEmprestimo(double valorEmprestimo){
	        if (historico && saldo >= valorEmprestimo/2){
	            return true;
	        }
	        return false;
	    }

}
