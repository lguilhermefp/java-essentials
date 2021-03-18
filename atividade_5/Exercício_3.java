package atividade_5;

public class Exercício_3 {

	int tabela[][] = new int[9][9];
	
	Exercício_3(){
		ArrayTabela();
		System.out.println(""+tabela[0][0]+"  "+tabela[0][1]+"   "+tabela[0][2]+"   "+tabela[0][3]+"   "+tabela[0][4]+"  "+
				tabela[0][5]+"  "+tabela[0][6]+"  "+tabela[0][7]+"  "+tabela[0][8]);
		System.out.println(""+tabela[1][0]+"  "+tabela[1][1]+"   "+tabela[1][2]+"   "+tabela[1][3]+"   "+tabela[1][4]+"  "+
				tabela[1][5]+"  "+tabela[1][6]+"  "+tabela[1][7]+"  "+tabela[1][8]);
		System.out.println(""+tabela[2][0]+"  "+tabela[2][1]+"   "+tabela[2][2]+"   "+tabela[2][3]+"  "+tabela[2][4]+"  "+
				tabela[2][5]+"  "+tabela[2][6]+"  "+tabela[2][7]+"  "+tabela[2][8]);
		System.out.println(""+tabela[3][0]+"  "+tabela[3][1]+"   "+tabela[3][2]+"  "+tabela[3][3]+"  "+tabela[3][4]+"  "+
				tabela[3][5]+"  "+tabela[3][6]+"  "+tabela[3][7]+"  "+tabela[3][8]);
		for(int x=4; x<9; x++) {
			System.out.println(""+tabela[x][0]+"  "+tabela[x][1]+"  "+tabela[x][2]+"  "+tabela[x][3]+"  "+tabela[x][4]+"  "+
					tabela[x][5]+"  "+tabela[x][6]+"  "+tabela[x][7]+"  "+tabela[x][8]);
		}
	}
	
	void ArrayTabela(){
		for(int x=0; x<9; x++) {
			for(int y=0; y<9; y++) {
				tabela[x][y] = Elemento(x,y);
			}
		}
	}
	
	int Elemento(int x, int y){
		return (x+1)*(y+1);
	}
	
	public static void main(String[] args) {
		new Exercício_3();
	}
}
