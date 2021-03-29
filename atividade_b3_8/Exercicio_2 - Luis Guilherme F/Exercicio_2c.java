package atividade_b3_8;

class NumeroNegativoExceptionC extends Exception {
	
    private static final long serialVersionUID = 1000003L;

    public NumeroNegativoExceptionC(int num, String msg){
        super(msg);
    }

    public NumeroNegativoExceptionC(String msg, Throwable cause){
        super(msg, cause);
    }
}