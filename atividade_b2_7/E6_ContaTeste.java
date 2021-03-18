package atividade_b2_7;

public class E6_ContaTeste {

	public static void main(String[] args) {
		// teste conta corrente
		E6_ContaCorrente contaCorrente = new E6_ContaCorrente(1122, 20000);
		contaCorrente.sacar(2500);
		contaCorrente.depositar(3000);
		contaCorrente.pagar(500);
		contaCorrente.resumoConta();

		// teste conta credito
 		E6_ContaCredito contaCredito = new E6_ContaCredito(1133,1000);
		contaCredito.pagar(500);
		contaCredito.pagar(150);
		System.out.println("Fatura atual = "+contaCredito.consultarFatura());
		contaCredito.pagar(700);
		System.out.println("Fatura atual = "+contaCredito.consultarFatura());
		contaCredito.resumoConta();
		
		// teste conta poupança
		E6_ContaPoupanca contaPoupanca = new E6_ContaPoupanca(1144,100_000);
		contaPoupanca.depositar(50_000);
		contaPoupanca.resumoConta();
	}
}
