package atividade_b2_7;

public class E6_ContaCredito extends E6_Conta {

	E6_ContaCredito(int novoId, double novoLimite){
		super(novoId, novoLimite);
		setLimite(novoLimite);
	}
	
	private double limite;
	private double fatura = 0;
	
	double getFatura() {return fatura;}
	double getLimite() {return limite;}
	void setFatura(double valor) {fatura = valor;}
	void setLimite(double valor) {limite = valor;}
	
	double consultarFatura(){return getFatura();}
	void quitarFatura(){setFatura(0);}
	@Override
	void pagar(double valor) {if(fatura>0) {fatura -= valor;}}
	
	void resumoConta(){
		System.out.println("	Resumo da Conta Crédito");
		System.out.println("----------------------------------------------");
		System.out.println("ID da conta: "+getId());
		System.out.println("Data de criação: "+getDataCriacao().getTime());
		System.out.println("Limite: "+getLimite());
		System.out.printf("Fatura atual: %f\n", getFatura());
		System.out.println("----------------------------------------------\n");
	}
}
