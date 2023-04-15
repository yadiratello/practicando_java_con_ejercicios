package matriz;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej16 {

	public static void main(String[] args) {
		/*
		 * llenar una matriz con numeros aleatorios de n columnas y filas o la
		 * cantidad de filas y columnas que desea
		 */
		Scanner input = new Scanner(System.in);

		System.out.print("Ingrese el número de filas: ");
		int rows = input.nextInt();

		System.out.print("Ingrese el número de columnas: ");
		int cols = input.nextInt();

		int[][] matrix = new int[rows][cols];
		Random rand = new Random();

		// llenar la matriz con números aleatorios
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = rand.nextInt(100); // generamos un número
													// aleatorio entre 0 y 99
			}
		}

		// imprimir la matriz
		System.out.println("Matriz generada:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		input.close();

	}

}
