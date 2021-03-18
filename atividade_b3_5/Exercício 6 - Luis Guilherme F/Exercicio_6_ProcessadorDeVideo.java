package atividade_b3_5;

public class Exercicio_6_ProcessadorDeVideo {
	
	 public void process(Exercicio_6_Video video) {
//	        Exercicio_6_interface().encode(video);
//	        encoder.encode(video);

	        var database = new Exercicio_6_ArmazenamentoVideo();
	        database.store(video);

	        var emailService = new Exercicio_6_ServicoDeEmail();
	        emailService.sendEmail(video.getUsuario());
	    }

/*	@Override
	public void encode(Exercicio_6_Video video) {
        System.out.println("Processando video...");
        System.out.println("Pronto!\n");
	}

	@Override
	public void store(Exercicio_6_Video video) {
		
	}

	@Override
	public void sendEmail(video.) {
		
	}
*/}
