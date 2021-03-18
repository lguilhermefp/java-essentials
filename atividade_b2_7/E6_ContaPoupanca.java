package atividade_b2_7;

public class E6_ContaPoupanca extends E6_Conta{

	E6_ContaPoupanca(int novoId, int novoSaldo){
		super(novoId, novoSaldo);
		setTaxaRendimentoAno(4.5*2);
	}
	
	void depositar(double valor){setSaldo(getSaldo() + valor);}

	void resumoConta(){
		System.out.println("	Resumo da Conta Poupança");
		System.out.println("----------------------------------------------");
		System.out.println("ID da conta: "+getId());
		System.out.println("Data de criação: "+getDataCriacao().getTime());
		System.out.println("Saldo: "+getSaldo());
		System.out.printf("Rendimento por mês: R$%.2f\n",((getTaxaRendimentoAno()/1200)*getSaldo()));
		System.out.println("----------------------------------------------\n");
	}
}
