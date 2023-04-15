package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej8 {

	public static void main(String[] args) {
		/*
		 * matriz de n * m filas(cargar n y m por teclado) Imprimir los 4
		 * valores q se encuentran en los vertices de la misma(mat[0][0], etc)
		 * pero esta vez usa datos de tipo char.
		 */

		Scanner entrada = new Scanner(System.in);
		// declaracion de variables

		char matriz[][];
		int nFilas;
		int nColumnas;

		nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un cantidad de FIlas "));
		nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Cantidad de Columnas"));

		matriz = new char[nFilas][nColumnas];

		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print("Ingrese un Elemento en la Posición [" + i + "] [" + j + "] :");
				matriz[i][j] = entrada.next().charAt(0);

			}
		}
		System.out.println("");
		System.out.println(" La Matriz es ");
		for (int i = 0; i < nFilas; i++) {
			for (int j = 0; j < nColumnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		// vamos a imprimir los veritices
		System.out.println("");
		System.out.println("El vertice Superior Izquierdo es:" + matriz[0][0]);
		System.out.println("El vertice Superior Derecho es:" + matriz[0][matriz[0].length - 1]);
		System.out.println("El vertice Inferior Izquierdo es:" + matriz[matriz.length - 1][0]);
		System.out.println(
				"El vertice Inferior Derecho es:" + matriz[matriz.length - 1][matriz[matriz.length - 1].length - 1]);

	}

}
