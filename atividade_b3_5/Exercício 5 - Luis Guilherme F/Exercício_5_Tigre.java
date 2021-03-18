package atividade_b3_5;

public class Exercício_5_Tigre extends Exercício_5_Animal {

	static double limitacaoNadar = 6;
	static double limitacaoCorrer = 6;
	static double distanciaPercorridaNadar;
	static double distanciaPercorridaCorrer;
	
	static double getDistanciaPercorridaNadar(){
		return distanciaPercorridaNadar;
	}
	
	static double getDistanciaPercorridaCorrer(){
		return distanciaPercorridaCorrer;
	}
	
	static void nadar(int distancia) {
		//6km
		if(distancia <= limitacaoNadar) {
			distanciaPercorridaNadar = distancia;
		}else {
			distanciaPercorridaNadar = 0;
		}
	}
	
	static
	void correr(int distancia) {
		//6km
		if(distancia <= limitacaoCorrer) {
			distanciaPercorridaCorrer = distancia;
		}else {
			distanciaPercorridaCorrer = 0;
		}
	}
}
