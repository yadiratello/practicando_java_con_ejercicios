package matriz;

import javax.swing.JOptionPane;

public class ej15 {

	public static void main(String[] args) {
		/*
		 * llenar una matriz con numeros aleatorios de n columnas y filas o la
		 * cantidad de filas y columnas que desea
		 */

		int matriz[][];

		int cantFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de filas: "));
		int cantColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas: "));

		int limite=Integer.parseInt(JOptionPane.showInputDialog("Digite el limite que desea para generar los numeros aleatorios: "));;
		
		matriz = new int[cantFilas][cantColumnas];

		// Rellenar la matriz
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				matriz[i][j] = (int) (Math.random() * limite);//generando numeros aleatorios del 1 al limite
			}
		}

		
		//imprimimos la matriz
		for (int i = 0; i < cantFilas; i++) {
			for (int j = 0; j < cantColumnas; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
