package atividade_b3_8;

public class MyException extends Exception {
    public MyException(String msg){
        super(msg);
    }

    public MyException(String msg, Throwable cause){
        super(msg, cause);
    }
    
}
