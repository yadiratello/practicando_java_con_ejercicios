package arreglos;

import javax.swing.JOptionPane;

public class ejc6 {

	public static void main(String[] args) {
		/*
		 * crear un array de 10 elmentos enteros y contar los elementos
		 * negativos, positivos, pares e impares.
		 */

		int arreglo[] = new int[10];
		int negativos = 0, positivos = 0, pares = 0, impares = 0;

		// llenar el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero para la posicion " + i));

			// contar los positivos y negativos
			if (arreglo[i] >= 0) {
				positivos++;
			} else if (arreglo[i] < 0) {
				negativos++;
			}
			// contar los pares y impares
			if (arreglo[i] % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		} // fin del bucle

		System.out.println("Numeros positivos: " + positivos);
		System.out.println("Numeros negativos: " + negativos);
		System.out.println("Numeros pares: " + pares);
		System.out.println("Numeros impares: " + impares);
	}

}
