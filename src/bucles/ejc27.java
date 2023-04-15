package bucles;

public class ejc27 {

	public static void main(String[] args) {
		// inveertir una palabra conociendo la cadena
		
		String cadena="Hola mundo desde eclipse";
		String cadenaInvertida="";
		
		//recorrer la cadena
		for (int i = cadena.length()-1; i>=0;i--) {
			cadenaInvertida= cadenaInvertida + cadena.charAt(i);
			
		}
		
		
		System.out.println(cadenaInvertida);

	}

	
 
}
