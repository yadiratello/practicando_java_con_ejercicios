package matriz;

import javax.swing.JOptionPane;

public class ej5 {

	public static void main(String[] args) {
		/*
		 * crear una matriz de n * m filas(cargar n y m por teclado)
		 * Intercambiar la primera fila con la segunda Imprimir luego la matriz.
		 */

		// pedir al usuario que ingrese el numero de filas y de columnas
		int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas para la matriz:"));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas para la matriz:"));

		int matriz[][] = new int[fila][columna];

		// llenando la matriz
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane
						.showInputDialog("Ingrese una valor para la posicion: [" + i + "][" + j + "]"));
			}
		}

		// imprimiendo la matriz original
		System.out.println("La matriz original es:");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//intercambiamos la fila 1
		int auxiliar;
		
		for (int i = 0; i < matriz[0].length; i++) {
			//guardar en auxiliar los elementos de la primera fila=0
			auxiliar = matriz[0][i];
			//guardando en la 1ra fila los elementos de la 2da fila
			matriz[0][i] = matriz[1][i];
			//guardando en la 2da fila lo que hay en auxiliar(la 1ra fila)
			matriz[1][i] = auxiliar;
		}
		
		//imprimiendo la nueva matriz 
		System.out.println("\nLa matriz Intercambiada es:");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}

	}

}
