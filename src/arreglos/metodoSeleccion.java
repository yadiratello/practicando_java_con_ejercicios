package arreglos;

import javax.swing.JOptionPane;

public class metodoSeleccion {

	public static void main(String[] args) {
		//

		int arreglo[];

		int nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo:"));

		arreglo = new int[nElementos];

		// llenando el arreglo
		for (int i = 0; i < nElementos; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion : " + i));
		}

		System.out.println("El arreglo desordenado es: ");
		for (int miarreglo : arreglo) {
			System.out.println(miarreglo);
		}

		// Metodo de seleccion

		int minimo, auxiliar;

		for (int i = 0; i < nElementos; i++) {
			minimo = i;

			for (int j = i + 1; j < nElementos; j++) {
				if (arreglo[j] < arreglo[minimo]) {
					minimo = j;
				}
			}
			auxiliar = arreglo[i];
			arreglo[i] = arreglo[minimo];
			arreglo[minimo] = auxiliar;
		}
		
		
		//imprimir el arreglo
		System.out.println("El arreglo Ordenado es: ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

	}

}
