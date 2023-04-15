package sintaxys_java;

public class Clase_String {

	public static void main(String[] args) {
		
		String cadena="Esta es mi cadena de texto";
		
		
		//charAt(posicion): devueve 1 caracter de la cadena
		//System.out.println(cadena.charAt(0));
		
		
		//recorrer la cadena de texto
		for (int i = 0; i < cadena.length(); i++) {
			System.out.println((i+1)+". "+cadena.charAt(i));
		}
		
	}

}
