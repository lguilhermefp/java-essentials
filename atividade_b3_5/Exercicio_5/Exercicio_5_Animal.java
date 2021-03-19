package atividade_b3_5.Exercicio_5;

public abstract class Exercicio_5_Animal {

	static void nadar(int distancia) {}
	static void correr(int distancia) {}
	
	public static void main(String[] args) {
		
		Exercicio_5_Animal vaca = new Exercicio_5_Vaca();
		Exercicio_5_Animal cachorro = new Exercicio_5_Cachorro();
		Exercicio_5_Animal gato = new Exercicio_5_Gato();
		Exercicio_5_Animal tigre1 = new Exercicio_5_Tigre();
		Exercicio_5_Animal tigre2 = new Exercicio_5_Tigre();
		
		Exercicio_5_Animal array[] = new Exercicio_5_Animal[5];
		array[0] = vaca;
		array[1] = cachorro;
		array[2] = gato;
		array[3] = tigre1;
		array[4] = tigre2;
		
		int contadorVaca = 0;	int contadorCachorro = 0;	int contadoGato = 0;	int contadorTigre = 0;	int contadorAnimais = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i].getClass()==Exercicio_5_Vaca.class) {contadorVaca++; contadorAnimais++;}
			if(array[i].getClass()==Exercicio_5_Cachorro.class) {contadorCachorro++; contadorAnimais++;}
			if(array[i].getClass()==Exercicio_5_Gato.class) {contadoGato++; contadorAnimais++;}
			if(array[i].getClass()==Exercicio_5_Tigre.class) {contadorTigre++; contadorAnimais++;}
		}
		
		System.out.println("Numero de vacas: "+contadorVaca);
		System.out.println("Numero de cachorros: "+contadorCachorro);
		System.out.println("Numero de gatos: "+contadoGato);
		System.out.println("Numero de tigres: "+contadorTigre);
		System.out.println("Numero de animais: "+contadorAnimais);
		
		Exercicio_5_Vaca.nadar(3);
		Exercicio_5_Cachorro.nadar(3);
		Exercicio_5_Gato.nadar(3);
		Exercicio_5_Tigre.nadar(3);
		
		Exercicio_5_Vaca.correr(5);
		Exercicio_5_Cachorro.correr(5);
		Exercicio_5_Gato.correr(5);
		Exercicio_5_Tigre.correr(5);
		
		System.out.println("Distancia percorrida ao nadar por vaca(s): "+Exercicio_5_Vaca.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por cachorro(s): "+Exercicio_5_Cachorro.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por gato(s): "+Exercicio_5_Gato.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por tigre(s): "+Exercicio_5_Tigre.getDistanciaPercorridaNadar());
		
		System.out.println("Distancia percorrida ao correr por vaca(s): "+Exercicio_5_Vaca.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por cachorro(s): "+Exercicio_5_Cachorro.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por gato(s): "+Exercicio_5_Gato.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por tigre(s): "+Exercicio_5_Tigre.getDistanciaPercorridaCorrer());
	}
}
