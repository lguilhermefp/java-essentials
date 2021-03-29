package atividade_b4_2;

public class Livro {
    protected String titulo;
    protected int numeroPaginas;
    protected String autor;
    protected int anoLancamento;
    protected String ISBN;

    public Livro(String titulo, int numeroPaginas, String autor, int anoLancamento, String ISBN) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.ISBN = ISBN;
    }
    boolean equals(Livro a) {
    	if (a.ISBN == ISBN){
    		return true;
    	}
    	return false;
    }
}
