package atividade_b2_5;

public class E5_MeuInteiro {

	int valor;
	
	//Construtor
	E5_MeuInteiro(int v){
		valor = v;
	}
	
	//Getter
	int getMeuInteiro() {
		return valor;
	}
	
	void setMeuInteiro(int v) {
		valor = v;
	}
	
	//Métodos
	//1
	boolean par() {
		if(valor%2 == 0) {return true;}else {return false;}
	}
	boolean impar() {
		if(valor%2 != 0) {return true;}else {return false;}
	}
	boolean primo(){
		
		boolean primo = true;
		
			for(int i=2; i<valor; i++) {
				primo = true;
				if(valor%i==0) {primo = false; break;}
			}
		return primo;
	}
	
	//2
	boolean par(int v) {
		if(v%2 == 0) {return true;}else {return false;}
	}
	boolean impar(int v) {
		if(v%2 != 0) {return true;}else {return false;}
	}
	boolean primo(int v){
		
		boolean primo = true;
		
			for(int i=2; i<v; i++) {
				primo = true;
				if(v%i==0) {primo = false; break;}
			}
		if(primo == true) {
			System.out.printf("%d, ",v);
		}
		return primo;
	}
	
	//3
	boolean par(E5_MeuInteiro v) {
		if(valor%2 == 0) {return true;}else {return false;}
	}
	boolean impar(E5_MeuInteiro v) {
		if(valor%2 != 0) {return true;}else {return false;}
	}
	boolean primo(E5_MeuInteiro v){
		valor = v.valor;
		boolean primo = true;
		
			for(int i=2; i<v.getMeuInteiro(); i++) {
				primo = true;
				if(valor%i==0) {primo = false; break;}
			}
		return primo;
	}
	
	//4
	boolean igual(int v) {
		if(valor == v) {return true;}else {return false;}
	}
	boolean igual(E5_MeuInteiro v) {
		if(valor == v.valor) {return true;}else {return false;}
	}
}
