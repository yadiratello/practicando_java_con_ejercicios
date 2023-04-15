package arreglos;

import javax.swing.JOptionPane;

public class ejc15 {

	public static void main(String[] args) {
		/*
		 * leer un arreglo de 10 elementos numericos enteros con posiciones del
		 * (0 y 9) eliminar el elemento situado en la posicion dada
		 */

		int arreglo[] = new int[10];
		int posicionEliminar;

		// llenamos el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la posicion " + i));
		}

		// listando el arreglo
		System.out.println("Arreglo original al inicio");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

		posicionEliminar = Integer.parseInt(JOptionPane.showInputDialog("Digite la posicion del array a eliminar "));

		// eliminamos el elemento de esa posicion del array
		for (int i = posicionEliminar; i < 9; i++) {
			arreglo[i] = arreglo[i + 1];
		}

		// listando el arreglo actual
		System.out.println("Arreglo Actual...");
		for (int i = 0; i < 9; i++) {
			System.out.println(arreglo[i]);
		}

	}

}
