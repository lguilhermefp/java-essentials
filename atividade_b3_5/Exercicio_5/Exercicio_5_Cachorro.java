package atividade_b3_5.Exercicio_5;

public class Exercicio_5_Cachorro extends Exercicio_5_Animal {

	static double limitacaoNadar = 5;
	static double limitacaoCorrer = 10;
	static double distanciaPercorridaNadar;
	static double distanciaPercorridaCorrer;
	
	static double getDistanciaPercorridaNadar(){
		return distanciaPercorridaNadar;
	}
	
	static double getDistanciaPercorridaCorrer(){
		return distanciaPercorridaCorrer;
	}
	
	static void nadar(int distancia) {
		//5km
		if(distancia <= limitacaoNadar) {
			distanciaPercorridaNadar = distancia;
		}else {
			distanciaPercorridaNadar = 0;
		}
	}
	
	static void correr(int distancia) {
		//10km
		if(distancia <= limitacaoCorrer) {
			distanciaPercorridaCorrer = distancia;
		}else {
			distanciaPercorridaCorrer = 0;
		}
	}
}
