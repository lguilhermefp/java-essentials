package atividade_5;

public class Exercício_8 {

	double quilometrosCorridos = 14, minutos = 45, veloc_km_h, veloc_min_km;
	
	Exercício_8(){
		CáuculoVelocidade(quilometrosCorridos, minutos);
		System.out.printf("Velocidade média em km/h: %.2f \n", veloc_km_h);
		System.out.printf("Velocidade média em min/km: %.2f", veloc_min_km);
	}
	
	void CáuculoVelocidade(double km, double min) {
		veloc_km_h = quilometrosCorridos*60/minutos;
		veloc_min_km = minutos/quilometrosCorridos;
	}
	
	public static void main(String[] args) {
		new Exercício_8();
	}
}
