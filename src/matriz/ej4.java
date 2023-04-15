package matriz;

import javax.swing.JOptionPane;

public class ej4 {

	public static void main(String[] args) {
		/*
		 * matriz de n * m filas(cargar n y m por teclado) Imprimir el mayor y
		 * menor elemento de la matriz y la fila y columna donde se almacena.
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
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// hallar el mayor y menor elemento de la matriz:
		int mayorElemento = matriz[0][0], menorElemento = matriz[0][0];
		int posicionFilaMayor = 0, posicionColumnaMayor = 0, posicionFilaMenor = 0, posicionColumnaMenor = 0;

		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				if (matriz[i][j] > mayorElemento) {
					mayorElemento = matriz[i][j];
					posicionFilaMayor = i;
					posicionColumnaMayor = j;
				} else if (matriz[i][j] < menorElemento) {
					menorElemento = matriz[i][j];
					posicionFilaMenor = i;
					posicionColumnaMenor = j;
				}
			}
		}

		// imprimir
		System.out.println("\nEl MAYOR elemento es: " + mayorElemento + " que se encuentra en la FILA: "
				+ posicionFilaMayor + " y COLUMNA: " + posicionColumnaMayor);
		System.out.println("\nEl MENOR elemento es: " + menorElemento + " que se encuentra en la FILA: "
				+ posicionFilaMenor + " y COLUMNA: " + posicionColumnaMenor);

	}

}
