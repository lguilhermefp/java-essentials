package atividade_b2_7;

public class E5_TesteCodificador {
	public static void main(String[] args) {
		E5_Codificador codificador1 = new E5_Codificador("ir embora",4);
        codificador1.codificar();
        System.out.printf("Frase codificada é \"%s\"\n", codificador1.getStringCodificada());
        codificador1.decodificar();
        System.out.printf("Frase decodificada é \"%s\"\n",codificador1.getStringDecodificada());
        System.out.println("------");
        E5_Codificador codificador2 = new E5_Codificador("voce viu meus 3 gatos e 2 caes?", 4);
        codificador2.codificar();
        System.out.printf("Frase codificada é \"%s\"\n", codificador2.getStringCodificada());
        codificador2.decodificar();
        System.out.printf("Frase decodificada é \"%s\"\n",codificador2.getStringDecodificada());
        System.out.println("------");

        // Entrada: 93589()çç%&=+12AD
        E5_Codificador codificador3 = new E5_Codificador();
        codificador3.codificar();
        System.out.printf("Frase codificada é \"%s\"\n",codificador3.getStringCodificada());
        codificador3.decodificar();
        System.out.printf("Frase decodificada é \"%s\"\n",codificador3.getStringDecodificada());
    }
}
