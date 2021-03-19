package atividade_b2_7;

import java.util.Scanner;

public class E5_Codificador {
	
	static int deslocamento;
	static String fraseCodificar;
	static String fraseCodificada = "";
	static String fraseDecodificada = "";
	static String[] stringLimpa2;
	
    static Scanner scanner = new Scanner(System.in);
	
	E5_Codificador(String fraseCodificar2, int deslocamento2){
		deslocamento = deslocamento2;
		fraseCodificar = fraseCodificar2;
	}
	
	E5_Codificador(){
		System.out.println("Entre com a frase: ");
		fraseCodificar = scanner.nextLine();
		System.out.println("Insira o deslocamento: ");
		deslocamento = scanner.nextInt();
	}
	
	void limparString() {
		fraseCodificar = "";
	}
	void codificar() {
	        String stringEntrada = fraseCodificar;
	        System.out.println("Frase inicial: "+fraseCodificar);

	        // inicializando as variaveis auxiliares
	        // string para ser codificada
	        String fraseParaCodificar = "";
	        // string codificada
	        fraseCodificada = "";

	        // separa o string em letras e espacos para que seja possivel acessar posição de cada letra
	        String[] stringExplodidaLetraPorLetra = stringEntrada.split("");

	        /* duas variaveis do alfabeto, uma contendo o caracter de espaco e outro nao
	        * isso é necessario para preservar os espacos na hora da limpeza da string que foi fornecida pelo usuario*/
	        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
	        String[] alphabet_aux = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	        // inicializando a string auxiliar
	        String[] stringAuxiliarParaLimpeza = new String[stringExplodidaLetraPorLetra.length];

	        // limpa as palavras para que elas somente contenham as letras do alfabeto
	        for (int i = 0; i < stringExplodidaLetraPorLetra.length; i++)
	            for (int j = 0; j < alfabeto.length; j++)
	                if (stringExplodidaLetraPorLetra[i].equals(alfabeto[j]))
	                    stringAuxiliarParaLimpeza[i] = alfabeto[j];

	        // string que de fato sera codificada do tamanho da quantidade dos caracteres na string limpa
	        String[] stringLimpa = new String[stringAuxiliarParaLimpeza.length];
	        stringLimpa2 = new String[stringAuxiliarParaLimpeza.length];

	        /* copiando a string limpa para a string final. como o passo anterior iria deixar os valores null nos lugares
	        * dos carecteres que nao estao no alfabeto, essa etapa serve para consertar isso */
	        for (int i = 0; i < stringAuxiliarParaLimpeza.length; i++){
	            if (stringAuxiliarParaLimpeza[i] != null)
	                stringLimpa[i] = stringAuxiliarParaLimpeza[i];
	            else if (stringAuxiliarParaLimpeza[i] == null)
	                stringLimpa[i] = "";
	        }

	        // concatenando a frase para codificar com os caracters que sobraram
	        // somente necessario para impressao mais facil
	        for (int i = 0; i < stringLimpa.length; i++)
	        	{fraseParaCodificar += stringLimpa[i];}
	        
	        System.out.println("Frase para codificar: "+fraseParaCodificar);

	        /* codificando
	        * localizando cada letra da frase no alfabeto_aux e substituindo-a por a letra que esta 4 na frente no mesmo
	        * alfabeto_aux
	        *
	        * o break serve para interroper a verificação da repetição assim que letra da frase foi localizada*/
	        for (int i = 0; i < stringLimpa.length; i++) {
	            for (int j = 0; j < alphabet_aux.length; j++) {
	                // descomentar para ver o passo a passo da verificação
	                // System.out.println("stringLimpa = "+ stringLimpa[i]+" alphabet_aux = "+ alphabet_aux[j]);
	            	
	                if (stringLimpa[i].equals(alphabet_aux[j])) {
	                    // a formula (((j + alphabet_aux.length) + DESLOCAMENTO) % alphabet_aux.length) é responsavel pela
	                    // substituição das letras
	                    // notificação das substituições
//	                    System.out.println("Substituindo "+stringLimpa[i]+" por "+ alphabet_aux[(((j + alphabet_aux.length) + deslocamento) % alphabet_aux.length)]);
	                    // substituição
	                    stringLimpa[i] = alphabet_aux[(((j + alphabet_aux.length) + deslocamento) % alphabet_aux.length)];
	                    break;
	                }
	            }
	        }

	        // concatenando a frase codificada com os caracters da string que foi codificada
	        // somente é necessario para impressao mais facil
	        for (int i = 0; i < stringLimpa.length; i++)
	            fraseCodificada += stringLimpa[i];

//	        System.out.format("Frase inicial foi: '%s'\n", stringEntrada);

	        if (fraseParaCodificar.isEmpty()) {
	            System.out.println("Frase para codificar � vazia.\n");
	        } else {
//	            System.out.format("Frase para codificar é: '%s'\n", fraseParaCodificar);
//	            System.out.format("Frase codificada é: '%s'\n", fraseCodificada);
	        }
	}
	
	void decodificar() {
//		 System.out.println("Frase: ");
	        String stringEntrada = fraseCodificada;

	        // inicializando as variaveis auxiliares
	        // string para ser codificada
	        String fraseParaCodificar = "";
	        // string codificada
//	        fraseCodificada = "";

	        // separa o string em letras e espacos para que seja possivel acessar posição de cada letra
	        String[] stringExplodidaLetraPorLetra = stringEntrada.split("");

	        /* duas variaveis do alfabeto, uma contendo o caracter de espaco e outro nao
	        * isso é necessario para preservar os espacos na hora da limpeza da string que foi fornecida pelo usuario*/
	        String[] alfabeto = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};
	        String[] alphabet_aux = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

	        // inicializando a string auxiliar
	        String[] stringAuxiliarParaLimpeza = new String[stringExplodidaLetraPorLetra.length];

	        // limpa as palavras para que elas somente contenham as letras do alfabeto
	        for (int i = 0; i < stringExplodidaLetraPorLetra.length; i++)
	            for (int j = 0; j < alfabeto.length; j++)
	                if (stringExplodidaLetraPorLetra[i].equals(alfabeto[j]))
	                    stringAuxiliarParaLimpeza[i] = alfabeto[j];

	        // string que de fato sera codificada do tamanho da quantidade dos caracteres na string limpa
	        String[] stringLimpa = new String[stringAuxiliarParaLimpeza.length];

	        /* copiando a string limpa para a string final. como o passo anterior iria deixar os valores null nos lugares
	        * dos carecteres que nao estao no alfabeto, essa etapa serve para consertar isso */
	        for (int i = 0; i < stringAuxiliarParaLimpeza.length; i++){
	            if (stringAuxiliarParaLimpeza[i] != null)
	                stringLimpa[i] = stringAuxiliarParaLimpeza[i];
	            else if (stringAuxiliarParaLimpeza[i] == null)
	                stringLimpa[i] = "";
	        }

	        // concatenando a frase para codificar com os caracters que sobraram
	        // somente necessario para impressao mais facil
	        for (int i = 0; i < stringLimpa.length; i++)
	            fraseParaCodificar += stringLimpa[i];

	        /* codificando
	        * localizando cada letra da frase no alfabeto_aux e substituindo-a por a letra que esta 4 na frente no mesmo
	        * alfabeto_aux
	        *
	        * o break serve para interroper a verificação da repetição assim que letra da frase foi localizada*/
	        for (int i = 0; i < stringLimpa.length; i++) {
	            for (int j = 0; j < alphabet_aux.length; j++) {
	                // descomentar para ver o passo a passo da verificação
	                // System.out.println("stringLimpa = "+ stringLimpa[i]+" alphabet_aux = "+ alphabet_aux[j]);
	            	
	                if (stringLimpa[i].equals(alphabet_aux[j])) {
	                    // a formula (((j + alphabet_aux.length) + DESLOCAMENTO) % alphabet_aux.length) é responsavel pela
	                    // substituição das letras
	                    // notificação das substituições
//	                    System.out.println("Substituindo "+stringLimpa[i]+" por "+ alphabet_aux[(((j + alphabet_aux.length) - deslocamento) % alphabet_aux.length)]);
	                    // substituição
	                    stringLimpa[i] = alphabet_aux[(((j + alphabet_aux.length) - deslocamento) % alphabet_aux.length)];
	                    break;
	                }
	            }
	        }

	        fraseDecodificada = "";
	        // concatenando a frase codificada com os caracters da string que foi codificada
	        // somente é necessario para impressao mais facil
	        for (int i = 0; i < stringLimpa.length; i++)
	            fraseDecodificada += stringLimpa[i];

//	        System.out.format("Frase inicial foi: '%s'\n", stringEntrada);

	        if (fraseParaCodificar.isEmpty()) {
//	            System.out.println("Frase para codificar é vazia.\n");
	        } else {
//	            System.out.format("Frase para codificar é: '%s'\n", fraseParaCodificar);
//	            System.out.format("Frase codificada é: '%s'\n", fraseDecodificada);
	        }
	}
	
	String getStringCodificada(){return fraseCodificada;}
	String getStringDecodificada(){return fraseDecodificada;}
	
	 static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";
	    //deslocamento dos caracteres. é possivel modificar o numero dos caracteres de deslocamento
//	    static int DESLOCAMENTO = deslocamento;
}
