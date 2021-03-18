package atividade_b2_5;

public class E3_Ventilador {

	E3_Ventilador(){}
	
	//Variáveis
	final int DEVAGAR = 1, MEDIA = 2, RAPIDA = 3;
	private int velocidade = DEVAGAR;
	private boolean ligado = false;
	private double raio = 5;
	String cor = "azul";
	
	//Setters
	public void setVelocidade(int v) {
		velocidade = v;
	}
	public void setLigado(boolean l) {
		ligado = l;
	}
	public void setRaio(double r) {
		raio = r;
	}
	public void setCor(String c) {
		cor = c;
	}
	
	//Getters
	public int getVelocidade() {
		return velocidade;
	}
	public boolean getLigado() {
		return ligado;
	}
	public double getRaio() {
		return raio;
	}
	public String getCor() {
		return cor;
	}
	
	//Método de resumo de informações sobre o ventilador
	public void Informações(){
		int velocidade = getVelocidade();
		String velocidadeString = "";
		if(velocidade == 3) {velocidadeString = "RÁPIDA";}
		if(velocidade == 2) {velocidadeString = "MÉDIA";}
		if(velocidade == 1) {velocidadeString = "LENTA";}
		
		if(ligado == true) {
			System.out.println("está ligado; velocidade: "+velocidadeString+";  possui raio: "+raio+"; cor: "+cor);
		}else {
			System.out.println("está desligado; possui raio: "+raio+"; cor: "+cor);
		}
	}
	
	public static void main(String[] args) {
		
		//Ventilador 1
		E3_Ventilador ventilador = new E3_Ventilador();
		ventilador.setRaio(10);
		ventilador.setCor("amalelo");
		ventilador.setLigado(true);
		
		ventilador.Informações();
		
		//Ventilador 2
		E3_Ventilador ventilador2 = new E3_Ventilador();
		ventilador2.setVelocidade(2);
		ventilador2.setRaio(5);
		ventilador2.setCor("azul");
		ventilador2.setLigado(false);
		
		ventilador2.Informações();
	}
}
