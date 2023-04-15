package matriz;

import javax.swing.JOptionPane;

public class ej7 {

	public static void main(String[] args) {
		// ubico los vertices de mi matriz y lo imprimo

		int fila = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de filas:"));
		int columna = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columnas:"));

		int matriz[][] = new int[fila][columna];

		// llenando la matriz
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				matriz[i][j] = Integer.parseInt(
						JOptionPane.showInputDialog("Ingrese valor para la posicion: {" + i + "}{" + j + "}"));
			}
		}

		// imprimiendo matriz original
		System.out.println("Matriz Original:");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < columna; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

		// Hallando los vertices:

		// imprimimos el vertice superior izquierda(que seria la 1ra fila y 1ra
		// columna)
		System.out.println("\nEl vertice superior izquierda es " + matriz[0][0]);

		// imprimimos el vertice superior derecho(que seria la 1ra fila y ultima
		// columna)
		System.out.println("El vertice superior derecho es " + matriz[0][matriz[0].length - 1]);

		// imprimimos el vertice inferior izquierd(que seria la ultima fila y
		// 1ra columna)
		System.out.println("El vertice inferior izquierdo es " + matriz[matriz.length - 1][0]);

		// imprimimos el vertice inferior derecho(que seria la la ultima fila y
		// 1ra columna
		System.out.println(
				"El vertice inferior derecho es " + matriz[matriz.length - 1][matriz[matriz.length - 1].length - 1]);

	}

}
