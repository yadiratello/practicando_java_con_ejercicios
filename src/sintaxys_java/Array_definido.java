package sintaxys_java;

public class Array_definido {

	public static void main(String[] args) {
		// array de 8 elementos
		String nombres[]={"Juana","Lupe","Ana","Mia","Toño","Tito","Andres"};
	
		//System.out.println(nombres[nombres.length-1]);
	
		//contador
		int i =0;
		//recorrer el arreglo
		while(i < nombres.length){
			System.out.println(nombres[i]);
			//incremento el contador
			i++;
		}
	
	}

}
