package atividade_b3_7;

//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Teste {

	public static void main(String[] args) {
		try{
			FileReader leitor = new FileReader("arquivo.txt");
			var valor = leitor.read();
			leitor.close();
		}catch(IOException e) {
			e.printStackTrace();
		}//catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}
		//o segundo "catch" é unreachable, pois o erro previsto por ele já foi previsto no primeiro catch.
	}
}
