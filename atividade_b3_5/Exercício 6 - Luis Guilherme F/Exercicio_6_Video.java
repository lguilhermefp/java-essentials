package atividade_b3_5;

public class Exercicio_6_Video {
	private String nomeArquivo;
    private String titulo;
    private Exercicio_6_Usuario usuario;

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String fileName) {
        this.nomeArquivo = fileName;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String title) {
        this.titulo = title;
    }

    public Exercicio_6_Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Exercicio_6_Usuario usuario) {
        this.usuario = usuario;
    }
}
