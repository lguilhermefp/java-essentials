package atividade_b4_3;

import java.util.ArrayList;

public class Funcionario{

	Funcionario(int id, int horas){
		this.id = id;
		horas = 0;
	}
	
	int id;
	static int horasTrabalhadas, gravarHorasTrabalhadas;
	
	static int calculoHoras(ArrayList<ArrayList<Integer>> array, int id) {
		//System.out.println(array.get(id));
		for(int i=0; i<7; i++) {
			horasTrabalhadas += array.get(id).get(i);
		}
		//System.out.println("funcionario "+id+": "+ horasTrabalhadas);
		gravarHorasTrabalhadas = horasTrabalhadas;
		horasTrabalhadas = 0;
		return gravarHorasTrabalhadas;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcionario other = (Funcionario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	int getId() {
		return id;
	}
	
	Integer getGravarHorasTrabalhadas(){
		return gravarHorasTrabalhadas;
	}

	public static void setGravarHorasTrabalhadas(int gravarHorasTrabalhadas) {
		Funcionario.gravarHorasTrabalhadas = gravarHorasTrabalhadas;
	}
}
