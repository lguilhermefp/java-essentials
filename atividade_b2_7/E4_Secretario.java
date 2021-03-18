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
		System.out.println("Nome: "+getNome()+"\nEndereço: "+getEndereco()+"\nnúmero de telefone: "+getNumeroTelefone()
		+"\nEmail: "+getEmail()+"\nSala: "+getSala()+"\nSalário: "+getSalario()+"\nData de contratação: "
		+Calendar.getInstance().getTime()+"\nAlocação: "+getCoordenacao());
	}
}
