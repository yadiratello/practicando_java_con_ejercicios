package arreglos;

import javax.swing.JOptionPane;

public class ejc7 {

	public static void main(String[] args) {
		// Hallar el mayor y menor elemento en un arreglo de N elementos

		int arreglo[];
		int elementos, mayor = 0, menor = 0;

		elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño para el arreglo:"));

		arreglo = new int[elementos];

		// llenar el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion: " + i));
		}

		mayor = arreglo[0];
		menor = arreglo[0];

		for (int i = 0; i < arreglo.length; i++) {
			// validar el mayor
			if (arreglo[i] > mayor) {
				mayor = arreglo[i];
			}
			// validar el menor
			if (arreglo[i] < menor) {
				menor = arreglo[i];
			}
		}

		

		System.out.println("El elemento mayor del arreglo es: " + mayor);
		System.out.println("El elemento menor del arreglo es: " + menor);

	}

}
