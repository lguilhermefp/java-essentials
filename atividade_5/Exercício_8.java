package atividade_5;

public class Exerc�cio_8 {

	double quilometrosCorridos = 14, minutos = 45, veloc_km_h, veloc_min_km;
	
	Exerc�cio_8(){
		C�uculoVelocidade(quilometrosCorridos, minutos);
		System.out.printf("Velocidade m�dia em km/h: %.2f \n", veloc_km_h);
		System.out.printf("Velocidade m�dia em min/km: %.2f", veloc_min_km);
	}
	
	void C�uculoVelocidade(double km, double min) {
		veloc_km_h = quilometrosCorridos*60/minutos;
		veloc_min_km = minutos/quilometrosCorridos;
	}
	
	public static void main(String[] args) {
		new Exerc�cio_8();
	}
}
