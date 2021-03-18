package atividade_b3_5;

public class Exercicio_6_ArmazenamentoVideo {
	public void store(Exercicio_6_Video video) {
        System.out.println("Armazenando os metadados de video em uma base de dados SQL...");
        System.out.println("Titulo: " + video.getTitulo());
        System.out.println("Primeiro Nome: " + video.getNomeArquivo());
        System.out.println("Pronto!\n");
    }
}
