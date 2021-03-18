package atividade_b2_7;

import java.util.Calendar;

public class E6_Conta {

	private int id;
	private Calendar dataCriacao;
	private double saldo, taxaRendimentoAno;
	
	public int getId() {return id;}
	public Calendar getDataCriacao() {return dataCriacao;}
	public double getSaldo() {return saldo;}
	public double getTaxaRendimentoAno() {return taxaRendimentoAno;}
	
	public void setId(int novoId) {id = novoId;}
	public void setDataCriacao(Calendar novaDataCriacao) {dataCriacao = novaDataCriacao;}
	public void setSaldo(double novoSaldo) {saldo = novoSaldo;}
	public void setTaxaRendimentoAno(double novaTaxaRendimentoAno) {taxaRendimentoAno = novaTaxaRendimentoAno;}
	
	//Construtores
	E6_Conta(){id = 0; saldo = 0; taxaRendimentoAno = 4.5; dataCriacao = Calendar.getInstance();}
	
	E6_Conta(int novoId, double novoSaldo){
		id = novoId; saldo = novoSaldo; taxaRendimentoAno = 4.5; dataCriacao = Calendar.getInstance();
	}
	
	E6_Conta(int novoId){id = novoId; saldo = 0; taxaRendimentoAno = 4.5; dataCriacao = Calendar.getInstance();}
	
	//Método
	void pagar(double valor) {saldo -= valor;}
}
