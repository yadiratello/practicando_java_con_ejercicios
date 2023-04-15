package matriz;

import javax.swing.JOptionPane;

public class ej19 {

	public static void main(String[] args) {
		/*
		 * crear una matriz de n * m mostra la suma de cada fila y cada columna
		 */

		int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de filas de la matriz:"));
		int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de columnas para la matriz:"));

		int matriz[][] = new int[filas][columnas];

		// llenando la matriz
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion :" + i + "." + j));
			}
		}

		// imrpimiendo la matriz
		System.out.println("La matriz original es:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		//sumanos cada fila y columna de la matriz
		int sumaFila;
		int sumaColumna;
		
		for (int i = 0; i < filas; i++) {
			sumaFila = 0;
			for (int j = 0; j < columnas; j++) {
				sumaFila += matriz[i][j];
			}
			System.out.println("La suma de la fila "+i+" es: "+sumaFila);
		}
		
		//sumar las columnas
		for (int i = 0; i < columnas; i++) {
			sumaColumna=0;
			for (int j = 0; j < filas; j++) {
				sumaColumna = sumaColumna+matriz[j][i];
			}
			System.out.println("La suma de la columna "+i+" es: "+sumaColumna);
		}
		
	}

}
