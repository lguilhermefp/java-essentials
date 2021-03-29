package atividade_b3_8;

public class Exercicio_3 {

    private double saldo;
    private boolean historico;

    public Exercicio_3(){
        this.saldo = 0;
        this.historico = false;
    }
    public Exercicio_3(double saldo) {
        this.saldo = saldo;
        this.historico = false;
    }
    
    // geral stricto
    public boolean sacar(double valor){
        if (saldo-valor >= 0){
            saldo-=valor;
            return true;
        }
        return false;
    }

    // geral stricto
    public boolean depositar(double valor){
        if (valor > 0){
            saldo+=valor;
            return true;
        }
        return false;
    }

    // particular
    public String consultarFatura(){
        return "Nivel 2 do detalhamento";
    }

    // geral
    public boolean pedirEmprestimo(double valorEmprestimo){
        if (historico && saldo >= valorEmprestimo/5){
            return true;
        }
        return false;
    }
}
