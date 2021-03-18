package atividade_b2_5;

import java.util.Date;

public class E4_Classe {
	
	private int id = 0;
	private double saldo = 0;
	private static double taxasJurosAno;
	
	E4_Classe(){}
	E4_Classe(int id, int saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	//Getters
	int getId() {
		return id;
	}
	double getSaldo() {
		return saldo;
	}
	double getTaxasJurosMes(){
		return taxasJurosAno/12;
	}
	double getJurosMes() {
		return getTaxasJurosMes()*getSaldo();
	}
	
	//Setters
	public static void setTaxaJurosAno(double t) {
		taxasJurosAno = t;
	}
	
	//Métodos
	void Depositar(double v) {
		saldo += v;
	}
	void Sacar(double v) {
		saldo -= v;
	}
	
	public static void main(String[] args) {
		
		Date dataCriacao = new Date();
		
		E4_Classe conta = new E4_Classe(1122, 20_000);
		E4_Classe.setTaxaJurosAno(4.5/100);
		conta.Sacar(2500);
		conta.Depositar(3000);
		
		System.out.println("	   Resumo da Conta\n---------------------------------------------");
		System.out.println("ID da conta: "+conta.getId());
		System.out.println("Data de criação: "+dataCriacao.toString());
		System.out.printf("Saldo: %.2f \n", conta.getSaldo());
		System.out.printf("Juros por mes: %.2f \n\n", conta.getJurosMes());
		
	}
}
