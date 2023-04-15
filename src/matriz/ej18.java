package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej18 {

	public static void main(String[] args) {
		/*
		 * Sumar todos los elementos de una matriz y asignarle Esa suma de
		 * tamaño a un arreglo y dado a ese array Rellenarlo e imprimirlo
		 */
		Scanner leer = new Scanner(System.in);
		int matriz[][];
		int cantFilas;
		int cantColumnas;
		int suma = 0;
		int arreglo[];

		cantFilas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de filas tendra la matriz: "));
		cantColumnas = Integer
				.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de columnas tendra la matriz: "));

		matriz = new int[cantFilas][cantColumnas];
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				System.out.print("ingrese el numero en la posicion: "+i+"."+j);
				matriz[i][j] = leer.nextInt();

				suma += matriz[i][j];

			}
		}

		arreglo = new int[suma];
		System.out.println("total de valores en la matriz: " + suma);
		System.out.println("Ingreso de valores al Arreglo: ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print("ingrese un numero en la posicion: [" + i + "]: ");
			arreglo[i] = leer.nextInt();

		}
		System.out.println("Matriz: ");
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				System.out.print(matriz[i][j] + " ");

			}
			System.out.println(" ");
		}
		System.out.println("Arreglo: ");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i] + " ");
		}

	}

}
