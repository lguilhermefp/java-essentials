package atividade_b3_8;

class NumeroNegativoExceptionB extends RuntimeException {
	
    private static final long serialVersionUID = 1000002L;

    public NumeroNegativoExceptionB(String msg){
        super(msg);
    }

    public NumeroNegativoExceptionB(String msg, Throwable cause){
        super(msg, cause);
    }
}