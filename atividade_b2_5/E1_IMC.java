package atividade_b2_5;

public class E1_IMC {
    private String nome;
    private int idade;
    private double peso;
    private double alturaMetros;

    // implemetar construtor
    E1_IMC(String nome, int idade, double peso, double alturaMetros) {
    	this.nome = nome;
    	this.idade = idade;
    	this.peso = peso;
    	this.alturaMetros = alturaMetros;
    }
    
    // completar
    public double getIMC() {
        return (getPeso()) / Math.pow(getAlturaMetros(),2);
    }

    public String getStatus() {
        double imc = getIMC();

        if (imc < 16)
            return "Magreza grave";
        else if (16 < imc && imc <= 17)
            return "Magreza moderada";
        else if (17 < imc && imc <= 18.5)
            return "Magreza leve";
        else if (18.5 < imc && imc <= 25)
            return "Saudavel";
        else if (25 < imc && imc <= 30)
            return "Sobrepeso";
        else if (30 < imc && imc <= 35)
            return "Obesidade Grau I";
        else if (35 < imc && imc <= 40)
            return "Obesidade Grau II";
        else
            return "Obeseidade Grau III";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAlturaMetros() {
        return alturaMetros;
    }
    
    public static void main (String[] args) {
    	E1_IMC IMC1 = new E1_IMC("Pedro", 18, 69, 1.7);
		System.out.println("O IMC de " + IMC1.getNome() + " é "
			+ IMC1.getIMC() + " - " + IMC1.getStatus());

		E1_IMC IMC2 = new E1_IMC("João", 25, 120, 1.60);
		System.out.println("O IMC de " + IMC2.getNome() + " é "
			+ IMC2.getIMC() + " - " + IMC2.getStatus());

		E1_IMC IMC3 = new E1_IMC("Henrique", 50, 45, 1.75);
		System.out.println("O IMC de " + IMC3.getNome() + " é "
				+ IMC3.getIMC() + " - " + IMC3.getStatus());
    }
}
