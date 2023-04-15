package matriz;

import javax.swing.JOptionPane;

public class ej3 {

	public static void main(String[] args) {
		/*
		 * matriz de n * m filas(cargar n y m por teclado) Imprimir el mayor
		 * elemento y la fila y columna donde se almacena.
		 */

		int fila, columna;

		fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas:"));
		columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas:"));

		int matriz[][] = new int[fila][columna];

		// llenando la matriz
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				matriz[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("Ingrese valor para la fila:{" + i + "} columna{" + j + "}"));
			}
		}

		System.out.println("MAtriz original");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

		// variable que almacena el numero mayor
		int elementoMayor = matriz[0][0];
		int mayor = 0;
		int posicionFila = 0, posicionColumna = 0;

		// hallar el elemento mayor de la matriz
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				if (matriz[i][j] > elementoMayor) {
					// guardar el elemnto mayor, el numero de la fila y de la
					// columna
					elementoMayor = matriz[i][j];
					posicionFila = i;
					posicionColumna = j;
				}
			}
		}

		System.out.println("\nEl elemento mayor de la matriz es: "+elementoMayor);
		System.out.println("La posicion de la fila de dicho elemento es: "+posicionFila);
		System.out.println("La posicion de la columna de dicho elemento es: "+posicionColumna);

		

	}

}
