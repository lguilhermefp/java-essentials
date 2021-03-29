package atividade_b4_3;

public class Produto implements Comparable<Produto>{

	Produto(String serialNumber, String nome, double preco){
		this.serialNumber=serialNumber;
		this.nome=nome;
		this.preco=preco;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + "]";
	}

	private String serialNumber;
	private String nome;
	private double preco;
	
	public String getNome() {
		return nome;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareTo(o.getNome());
	}
}
