package matriz;

import javax.swing.JOptionPane;

public class ej2 {

	public static void main(String[] args) {
		/*
		 * matriz de n * m filas(cargar n y m por teclado)
		 * Imprimir la matriz completa y la ultima fila, pero
		 * esta vez usando datos de tipo String
		 */
		
		int filas, columnas;
		
		filas = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de filas para la matriz"));
		columnas = Integer.parseInt(JOptionPane.showInputDialog("ingrese cantidad de columnas para la matriz"));

		
		String[][] matriz1 = new String [filas][columnas];

		//llenando la matriz
		//i=filas, j=columnas
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz1[i][j] = JOptionPane.showInputDialog("ingrese valor para la posicion "+i+"."+j);
			}
		}
		
		//mostrando la matriz
		System.out.println("Matriz actual:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nÚltima fila de la matriz:");
		for (int i = 0; i < columnas; i++) {
			System.out.print(matriz1[filas-1][i]+" ");
		}
		System.out.println();
		
	}

}
