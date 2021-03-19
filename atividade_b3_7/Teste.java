package atividade_b3_7;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) {
		int valor=0;
		try{
			FileReader leitor = new FileReader("arquivo.txt");
			valor = leitor.read();
			leitor.close();
		}catch(IOException e) {
			e.printStackTrace();
		}//catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		//o segundo "catch" e unreachable, pois o erro previsto por ele ja foi previsto no primeiro catch.
		System.out.println(valor);
	}
}
