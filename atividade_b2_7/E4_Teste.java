//Fiz sem usar os construtores com excessão da classe Secretário, pois vi que era pra usar depois
package atividade_b2_7;

import java.util.Calendar;

public class E4_Teste extends E4_Pessoa {

	public static void main(String[] args) {
		
		E4_Pessoa pessoa = new E4_Pessoa();
		pessoa.setNome("Ana");
		pessoa.setEndereco("Rua dos Flamingos, 88");
		pessoa.setNumeroTelefone("1117777000");
		pessoa.setEmail("aninha_crazylouca10@gotica.com");
		System.out.println("Nome: "+pessoa.getNome());
		System.out.println("Endereço: "+pessoa.getEndereco());
		System.out.println("Número de Telefone: "+pessoa.getNumeroTelefone());
		System.out.println("Email: "+pessoa.getEmail()+"\n");
		
		E4_Funcionario funcionario = new E4_Funcionario();
		funcionario.setNome("Bruno");
		funcionario.setEndereco("Rua Lua Jalina Luz, 13000");
		funcionario.setNumeroTelefone("1313138000");
		funcionario.setEmail("bruninho_o_matador13@hash.com");
		funcionario.setSala(13);
		funcionario.setSalario(1000000);
		funcionario.setDataContratacao(Calendar.getInstance());
		
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Endereço: "+funcionario.getEndereco());
		System.out.println("Número de Telefone: "+funcionario.getNumeroTelefone());
		System.out.println("Email: "+funcionario.getEmail());
		System.out.println("Sala: "+funcionario.getSala());
		System.out.println("Salário: "+funcionario.getSalario());
		System.out.println("Data de Contratação: "+funcionario.getDataContratacao().getTime()+"\n");
		
		E4_Estudante estudante = new E4_Estudante();
		estudante.setNome("Luisinho da ZS");
		estudante.setEndereco("Rua da Gralha Magra, 773");
		estudante.setNumeroTelefone("1233215550");
		estudante.setEmail("luisinhomlkzikakk31@glok.com.br");
		estudante.setAno(2011);
		
		System.out.println("Nome: "+estudante.getNome());
		System.out.println("Endereço: "+estudante.getEndereco());
		System.out.println("Número de Telefone: "+estudante.getNumeroTelefone());
		System.out.println("Email: "+estudante.getEmail());
		System.out.println("Ano: "+estudante.getAno()+"\n");
		
		E4_Docente docente = new E4_Docente();
		docente.setNome("Augusto Diodino");
		docente.setEndereco("Jacinto Luz, 1413");
		docente.setNumeroTelefone("98123218391232490");
		docente.setEmail("augusto.diodino@uol.com");
		docente.setSala(41);
		docente.setSalario(20000);
		docente.setDataContratacao(Calendar.getInstance());
		docente.setHorarioTrabalho("9h às 18h");
		docente.setTitulação("Fiscal de Serviços Gerais");
		
		System.out.println("Nome: "+docente.getNome());
		System.out.println("Endereço: "+docente.getEndereco());
		System.out.println("Número de Telefone: "+docente.getNumeroTelefone());
		System.out.println("Email: "+docente.getEmail());
		System.out.println("Sala: "+docente.getSala());
		System.out.println("Salário: "+docente.getSalario());
		System.out.println("Data de Contratação: "+docente.getDataContratacao().getTime());
		System.out.println("Horário de trabalho: "+docente.getHorarioTrabalho());
		System.out.println("Titulação: "+docente.getTitulação()+"\n");
		
		E4_Secretario secretario = new E4_Secretario("Tomas", "Rua Antonio Martins, 22", "2030000000",
				"tomas@uol.com", 12, 65000d, "Secretario da Coordenação de Engenharia");

		secretario.resumo();
	}
}
