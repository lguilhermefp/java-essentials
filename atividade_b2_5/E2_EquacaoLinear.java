package atividade_b2_5;

public class E2_EquacaoLinear {

	private double a, b, c, d, e, f, x, y;
	
	//Construtor
	E2_EquacaoLinear(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		x = (e*d - b*f)/(a*d - b*c);
		y = (a*f - e*c)/(a*d - b*c);
	}
	
	//Getters
	public double getA() {
		return a;
	}	
	public double getB() {
		return b;
	}	
	public double getC() {
		return c;
	}	
	public double getD() {
		return d;
	}	
	public double getE() {
		return e;
	}	
	public double getF() {
		return f;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	private boolean temSolucao(){
		if((a*d - b*c)!= 0) {return true;}
		else {return false;}
	}
	
	public static void main(String[] args) {
		E2_EquacaoLinear equacao = new E2_EquacaoLinear(3.4, 50.2, 2.1, 0.55, 44.5, 5.9);
		System.out.println("O sistema:");
		System.out.println(equacao.getA()+"x + "+equacao.getB()+"y = "+equacao.getE());
		System.out.println(equacao.getC()+"x + "+equacao.getD()+"y = "+equacao.getF());
		if(equacao.temSolucao() == true) {
			System.out.println("E sua solução é:");
			System.out.println("x é "+equacao.getX()+" y é "+equacao.getY()+"\n\n");
		}else {
			System.out.println("Não possui solução\n\n");
		}
		
		E2_EquacaoLinear equacao2 = new E2_EquacaoLinear(3, -2, 6, -4, 1, 6);
		System.out.println("O sistema:");
		System.out.println(equacao2.getA()+"x + "+equacao2.getB()+"y = "+equacao2.getE());
		System.out.println(equacao2.getC()+"x + "+equacao2.getD()+"y = "+equacao2.getF());
		if(equacao2.temSolucao() == true) {
			System.out.println("E sua solução é:");
			System.out.println("x é "+equacao.getX()+" y é "+equacao.getY());
		}else {
			System.out.println("Não possui solução\n\n");
		}
	}
}
