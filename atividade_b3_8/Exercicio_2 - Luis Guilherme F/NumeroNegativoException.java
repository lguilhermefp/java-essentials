package atividade_b3_8;

public class NumeroNegativoException extends Exception {
	
    private static final long serialVersionUID = 1000001L;

    public NumeroNegativoException(String msg){
        super(msg);
    }

    public NumeroNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}