package matriz;

import javax.swing.JOptionPane;

public class ej23MatricesIrregularesII {

	public static void main(String[] args) {
		/*
		 * confeccionar un programa q permita crear una matriz irregular
		 * y luego imprimir la matriz en forma completa
		 */

		//una matriz irregular no tiene una cantidad de columnas fijas
		
		int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de filas para la matriz:"));
		
		int matriz[][]= new int[filas][];
		
		
		//rellenando la matriz irregular
		for (int i = 0; i < matriz.length; i++) {
			//solicito que ingrese cantidad de columnas para la fila
			int columnas =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de columnas para la fila "+i));
			//asignarle a la matriz la cantidad de columnas que ingrese
			matriz[i] = new int[columnas];
			
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion: "+i+"."+j));
			}
		}
		
		//imprimiendo la matriz
		System.out.println("La Matriz irregular es");
		for (int i = 0; i < matriz.length; i++) {
			//recorriendo cada fila=i
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

}
