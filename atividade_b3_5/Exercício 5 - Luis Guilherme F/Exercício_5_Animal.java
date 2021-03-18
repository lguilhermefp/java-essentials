package atividade_b3_5;

public abstract class Exerc�cio_5_Animal {

	static void nadar(int dist�ncia) {}
	static void correr(int dist�ncia) {}
	
	public static void main(String[] args) {
		
		Exerc�cio_5_Animal vaca = new Exerc�cio_5_Vaca();
		Exerc�cio_5_Animal cachorro = new Exerc�cio_5_Cachorro();
		Exerc�cio_5_Animal gato = new Exerc�cio_5_Gato();
		Exerc�cio_5_Animal tigre1 = new Exerc�cio_5_Tigre();
		Exerc�cio_5_Animal tigre2 = new Exerc�cio_5_Tigre();
		
		Exerc�cio_5_Animal array[] = new Exerc�cio_5_Animal[5];
		array[0] = vaca;
		array[1] = cachorro;
		array[2] = gato;
		array[3] = tigre1;
		array[4] = tigre2;
		
		int contadorVaca = 0;	int contadorCachorro = 0;	int contadoGato = 0;	int contadorTigre = 0;	int contadorAnimais = 0;
		
		for(int i=0; i<array.length; i++) {
			if(array[i].getClass()==atividade_b3_5.Exerc�cio_5_Vaca.class) {contadorVaca++; contadorAnimais++;}
			if(array[i].getClass()==atividade_b3_5.Exerc�cio_5_Cachorro.class) {contadorCachorro++; contadorAnimais++;}
			if(array[i].getClass()==atividade_b3_5.Exerc�cio_5_Gato.class) {contadoGato++; contadorAnimais++;}
			if(array[i].getClass()==atividade_b3_5.Exerc�cio_5_Tigre.class) {contadorTigre++; contadorAnimais++;}
		}
		
		System.out.println("N�mero de vacas: "+contadorVaca);
		System.out.println("N�mero de cachorros: "+contadorCachorro);
		System.out.println("N�mero de gatos: "+contadoGato);
		System.out.println("N�mero de tigres: "+contadorTigre);
		System.out.println("N�mero de animais: "+contadorAnimais);
		
		Exerc�cio_5_Vaca.nadar(3);
		Exerc�cio_5_Cachorro.nadar(3);
		Exerc�cio_5_Gato.nadar(3);
		Exerc�cio_5_Tigre.nadar(3);
		
		Exerc�cio_5_Vaca.correr(5);
		Exerc�cio_5_Cachorro.correr(5);
		Exerc�cio_5_Gato.correr(5);
		Exerc�cio_5_Tigre.correr(5);
		
		System.out.println("Distancia percorrida ao nadar por vaca(s): "+Exerc�cio_5_Vaca.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por cachorro(s): "+Exerc�cio_5_Cachorro.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por gato(s): "+Exerc�cio_5_Gato.getDistanciaPercorridaNadar());
		System.out.println("Distancia percorrida ao nadar por tigre(s): "+Exerc�cio_5_Tigre.getDistanciaPercorridaNadar());
		
		System.out.println("Distancia percorrida ao correr por vaca(s): "+Exerc�cio_5_Vaca.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por cachorro(s): "+Exerc�cio_5_Cachorro.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por gato(s): "+Exerc�cio_5_Gato.getDistanciaPercorridaCorrer());
		System.out.println("Distancia percorrida ao correr por tigre(s): "+Exerc�cio_5_Tigre.getDistanciaPercorridaCorrer());
		
	}
}
