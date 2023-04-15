package matriz;

import javax.swing.JOptionPane;

public class ej1 {

	public static void main(String[] args) {
		/*
		 * crear una matriz de N * M filas( cargar n y m por teclado
		 * Imprimir la matriz dcompleta y la ultima fila
		 */
		
		int matriz[][];
		int cantidadFilas, cantidadColumnas;
		//.length : cuenta solo las filas
		
		cantidadFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas para la matriz:"));
		cantidadColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas para la matriz:"));

		matriz = new int[cantidadFilas][cantidadColumnas];
		
		
		//rellenando la matriz
		//i = filas
		for (int i = 0; i < cantidadFilas; i++) {
			//j = columnas
			for (int j = 0; j < cantidadColumnas; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la posicion : ["+i+"]["+j+"] "));
			}
		}
		
		System.out.println("Matriz actual");
		//imprimiendo la matriz
		for (int i = 0; i < cantidadFilas; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		System.out.println("Ultima fila de la matriz");
		//imprimiendo la ultima fila
		for (int i = 0; i < matriz[matriz.length-1].length; i++) {
			System.out.print(matriz[matriz.length-1][i] + " ");
		}
		System.out.println("");
	}

}
