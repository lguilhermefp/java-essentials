package atividade_b3_5;

public class Exercicio_6_Main {

	public static void main(String[] args) {
        var video = new Exercicio_6_Video();
        video.setNomeArquivo("aniversario.mp4");
        video.setTitulo("Aniversario de Pedro");
        video.setUsuario(new Exercicio_6_Usuario("pedro@domain.com"));

        var processor = new Exercicio_6_ProcessadorDeVideo();
        processor.process(video);
    }
}
