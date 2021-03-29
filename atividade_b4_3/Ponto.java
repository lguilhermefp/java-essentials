package atividade_b4_3;

import java.io.*;
import java.util.*;

class Comparar implements Comparator<Funcionario>{

	int a;
	
	@Override
	public int compare(Funcionario o1, Funcionario o2) {
		return o1.getGravarHorasTrabalhadas().compareTo(o2.getGravarHorasTrabalhadas());
	}
	
}

public class Ponto {

	public static void main(String[] args) throws Exception {
		
    	ArrayList<ArrayList<Integer>> arrayY = new ArrayList<>(3);
    	int contagem = 3;
    	
    	for(int i=0; i<contagem; i++) {
    	    arrayY.add(new ArrayList());
    	}
    	
    	/*arrayY.get(0).add(1);
    	arrayY.get(1).add(2);
    	arrayY.get(2).add(0);
    	arrayY.get(1).add(0);
    	arrayY.get(2).add(1);
    	arrayY.get(0).add(2);*/

    	int i=0;
		
		File arquivo = new File("C:\\Users\\Usuário\\Desktop\\arquivo.txt");
		if(!arquivo.exists()) {
			System.out.println("Não existe");
			System.exit(2);
		}
		// numero de caracteres
        int caracteres = 0;
        // numero de palavras
        int palavras = 0;
        // numero de linhas
        int linhas = 0;

        try (Scanner input = new Scanner(arquivo)) {
            while (input.hasNext()) {
                linhas++;
                String linha = input.nextLine();
                caracteres += linha.length();
            }
        }
        
        try (Scanner input = new Scanner(arquivo)){
            while (input.hasNext()) {
                String palavra = input.next();
                if(i<7) {
                	arrayY.get(0).add(Integer.parseInt(palavra));
                }
                if(i>=7 && i<14) {
                	arrayY.get(1).add(Integer.parseInt(palavra));
                }
                if(i>=14 && i<21) {
                	arrayY.get(2).add(Integer.parseInt(palavra));
                }
                palavras++;
                i++;
            }
        }
        
        // imprimindo os resultados
        System.out.println("Arquivo " + arquivo.getName() + " contem");
        System.out.println(caracteres + " caracteres");
        System.out.println(palavras + " palavras");
        System.out.println(linhas + " linhas");
        
        //System.out.println(arrayY);
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario0 = new Funcionario(0, 0);
        Funcionario funcionario1 = new Funcionario(1, 0);
        Funcionario funcionario2 = new Funcionario(2, 0);
        funcionario0.setGravarHorasTrabalhadas(Funcionario.calculoHoras(arrayY, 0));
        funcionario1.setGravarHorasTrabalhadas(Funcionario.calculoHoras(arrayY, 1));
        funcionario2.setGravarHorasTrabalhadas(Funcionario.calculoHoras(arrayY, 2));
        
        funcionarios.add(funcionario0);
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        Collections.sort(funcionarios, new Comparar());
        
        for(Funcionario funcionario : funcionarios) {
        	int a = Funcionario.calculoHoras(arrayY, funcionario.getId());
        	System.out.println(a +" "+funcionario.getId());
        }
        
        //System.out.println(Funcionario.calculoHoras(arrayY, funcionario0.getId()));
        //System.out.println(Funcionario.calculoHoras(arrayY, funcionario1.getId()));
        //System.out.println(Funcionario.calculoHoras(arrayY, funcionario2.getId()));
        
        //System.out.println(funcionario1.getGravarHorasTrabalhadas());
    }
}
