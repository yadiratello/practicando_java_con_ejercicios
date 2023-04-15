package arreglos;

import javax.swing.JOptionPane;

public class OrdenamientoString {

	public static void main(String[] args) {
		// ordenar un string

		String nombres[];
		int nElementos;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño para el arreglo:"));

		nombres = new String[nElementos];

		// llenando el array
		for (int i = 0; i < nElementos; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese un nombre en la posicion " + i);
		}

		System.out.println("EL arreglo original es:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

		// METODO BURBUJA

		String aux;

		for (int i = 0; i < nElementos - 1; i++) {
			for (int j = 0; j < nElementos - 1; j++) {
				// compareto: devuelve 0 si son iguales, positivo si es mayor
				if (nombres[j].compareTo(nombres[j + 1]) > 0) {
					aux = nombres[j];
					nombres[j] = nombres[j + 1];
					nombres[j + 1] = aux;
				}
			}
		}

		System.out.println("EL arreglo ORDENADO es:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}

	}

}
