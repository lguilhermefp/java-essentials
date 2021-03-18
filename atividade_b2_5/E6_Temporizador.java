package atividade_b2_5;

public class E6_Temporizador {
	private long tempoInicio;
	private long tempoFinal;

	// contrutor da classe
	public E6_Temporizador(){
		this.tempoInicio = System.currentTimeMillis();
	}

	// metodo que marca o momento do inicio de contagem
	public void start(){
		this.tempoInicio = System.currentTimeMillis();
	}

	// metodo que marca o momento do final de contagem
	public void stop(){
		this.tempoFinal = System.currentTimeMillis();
	}

	// metodo que retorna a delta entre tempoFinal e tempoInicio (tempo decorrido)
	public long tempoDecorrido(){
		return tempoFinal - tempoInicio;
	}


}
