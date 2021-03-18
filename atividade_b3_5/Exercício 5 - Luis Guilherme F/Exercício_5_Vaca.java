package atividade_b3_5;

public class Exercício_5_Vaca extends Exercício_5_Animal {

	static double limitacaoNadar = 0.5;
	static double limitacaoCorrer = 1;
	static double distanciaPercorridaNadar;
	static double distanciaPercorridaCorrer;
	
	static double getDistanciaPercorridaNadar(){
		return distanciaPercorridaNadar;
	}
	
	static double getDistanciaPercorridaCorrer(){
		return distanciaPercorridaCorrer;
	}
	
	static void nadar(int distancia) {
		//0.5km
		if(distancia <= limitacaoNadar) {
			distanciaPercorridaNadar = distancia;
		}else {
			distanciaPercorridaNadar = 0;
		}
	}
	
	static void correr(int distancia) {
		//1km
		if(distancia <= limitacaoCorrer) {
			distanciaPercorridaCorrer = distancia;
		}else {
			distanciaPercorridaCorrer = 0;
		}
	}
}
