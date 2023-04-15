package matriz;

import javax.swing.JOptionPane;

public class ej10 {

	public static void main(String[] args) {
		/*
		 * crear y cargar una matriz de 4 x 4 Imprimir los elementos del medio:
		 * 
		 * - - - - - 2 3 - - 7 8 - - - - -
		 * 
		 */

		// int matriz[][] = new int[4][4];

		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		/*
		 * // rellenamos la matriz for (int i = 0; i < 4; i++) { for (int k = 0;
		 * k < 4; k++) { matriz[i][k] = Integer
		 * .parseInt(JOptionPane.showInputDialog(
		 * "Ingrese valor para la posicion " + i + "." + k)); } }
		 */
		// mostramos la matriz
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println();
		}

		// imprimimos la diagonal
		System.out.println("\nLos elementos del medio son:");
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 2; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
			

		

	}

}
