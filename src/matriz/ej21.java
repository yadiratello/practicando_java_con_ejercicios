package matriz;

import javax.swing.JOptionPane;

public class ej21 {

	public static void main(String[] args) {
		// transponer una matriz de n * m(reemplazo la fila por la columna
		/*
		 * 1 2 3 4 5 6 7 8 9
		 * 
		 * transpuesta 1 4 7 2 5 8 3 6 9
		 * 
		 */

		int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de filas:"));
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas:"));

		int matriz[][] = new int[filas][columnas];

		// rellenar la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion: " + i + "." + j));
			}
		}

		// imprimiendo matriz original
		System.out.println("La matriz original es:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// transponemos la matriz
		int auxiliar;

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < i; j++) {
				auxiliar = matriz[i][j];
				matriz[i][j] = matriz[j][i];
				matriz[j][i] = auxiliar;
			}
		}

		// mostrando la matriz transpuesta
		System.out.println("La matriz transpuesta es:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
