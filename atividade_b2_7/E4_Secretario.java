package atividade_b2_7;

import java.util.Calendar;

public class E4_Secretario extends E4_Funcionario {

	E4_Secretario(String nome, String endereco, String numeroTelefone, String email, int sala, double salario,
			String coordenacao){
		setNome(nome);
		setEndereco(endereco);
		setNumeroTelefone(numeroTelefone);
		setEmail(email);
		setSala(sala);
		setSalario(salario);
		setCoordenacao(coordenacao);
		}
	
	private String coordenacao;
	
	public String getCoordenacao() {return coordenacao;}
	
	public void setCoordenacao(String coordenacao) {this.coordenacao = coordenacao;}
	
	public void resumo() {
		System.out.println("Nome: "+getNome()+"\nEndere�o: "+getEndereco()+"\nn�mero de telefone: "+getNumeroTelefone()
		+"\nEmail: "+getEmail()+"\nSala: "+getSala()+"\nSal�rio: "+getSalario()+"\nData de contrata��o: "
		+Calendar.getInstance().getTime()+"\nAloca��o: "+getCoordenacao());
	}
}
