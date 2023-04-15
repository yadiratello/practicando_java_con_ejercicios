package arreglos;

import javax.swing.JOptionPane;

public class ejc20 {

	public static void main(String[] args) {
		/*
		 * programa q llene un array con 10 numeros enteros que se leen por
		 * teclado. A continuacion calcula y muestra la media de los valores
		 * pares e impares.
		 */

		int arreglo[] = new int[10];
		int sumaPares = 0, sumaImpares = 0, contPares = 0, contImpares = 0;

		// llenando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i));
		}

		// calcular la suma de los pares e impares
		for (int i = 0; i < arreglo.length; i++) {
			if (arreglo[i] % 2 == 0) {
				sumaPares += arreglo[i];
				contPares++;
			} else {
				sumaImpares += arreglo[i];
				contImpares++;
			}

		}
		
		// calcular la media de los pares e impares
		int mediaPares = sumaPares/contPares;
		int mediaImpares = sumaImpares/contImpares;
		
		//mostrar
		System.out.println("La media de los valores pares es: "+mediaPares);
		System.out.println("La media de los valores impares es: "+mediaImpares);
	}

}
