package atividade_b2_7;

import java.util.Calendar;

public class E4_Funcionario extends E4_Pessoa {

	int sala;
	double salario;
	Calendar dataContratacao;
	
	public int getSala() {return sala;}
	public double getSalario() {return salario;}
	public Calendar getDataContratacao() {return dataContratacao;}
	
	public void setSala(int sala) {this.sala = sala;}
	public void setSalario(double salario) {this.salario = salario;}
	public void setDataContratacao(Calendar dataContratacao) {this.dataContratacao = dataContratacao;}
}
