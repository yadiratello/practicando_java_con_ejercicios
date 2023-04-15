package arreglos;

import javax.swing.JOptionPane;

public class ejc8 {

	public static void main(String[] args) {
		/*
		 * crear un array de tipo String de 20 elementos y 
		 * mostrar el elemento con mayor letras.
		 */
		
		String arreglo[] = new String[10];
		
		//llenando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = JOptionPane.showInputDialog("Ingrese cadena para la posicion"+i);
		}
		
		//mostrar la cadena mayor
		int longitudCadenaMayor = arreglo[0].length();
		String cadenaEnLetras ="";
		
		for (int i = 0; i < arreglo.length; i++) {
			if(longitudCadenaMayor < arreglo[i].length()){
				longitudCadenaMayor = arreglo[i].length();
				cadenaEnLetras = arreglo[i];
			}
		}
		
		System.out.println("La longitud de la cadena mayor es: "+longitudCadenaMayor);
		System.out.println("La cadena mayor es: "+cadenaEnLetras.toUpperCase());
	}

}
