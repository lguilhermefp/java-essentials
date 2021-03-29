package atividade_b3_8;

public class Testa{
	
	static void somarArray(String[] b){
		 try{		
		if(b.length != 4) {
			   throw new MyArraySizeException();
		    }
		 }catch(MyException me){
			 
		     System.err.println(me.getMessage());
		   }
	}
	
	 public static void main(String[] args){
		 
		 String a[] = new String[4];
		 
		 somarArray(a);
	  }
	}
