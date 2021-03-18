package atividade_b2_7;

public class E6_ContaCorrente extends E6_Conta{

	E6_ContaCorrente(int novoId, int novoSaldo){
		super(novoId, novoSaldo);
	}
	
	void sacar(double valor){setSaldo(getSaldo() - valor);}
	void depositar(double valor){setSaldo(getSaldo() + valor);}
	
	void resumoConta(){
		System.out.println("	Resumo da Conta Corrente");
		System.out.println("----------------------------------------------");
		System.out.println("ID da conta: "+getId());
		System.out.println("Data de criação: "+getDataCriacao().getTime());
		System.out.println("Saldo: "+getSaldo());
		System.out.printf("Rendimento por mês: R$%.2f\n",((getTaxaRendimentoAno()/1200)*getSaldo()));
		System.out.println("----------------------------------------------\n");
	}
}
