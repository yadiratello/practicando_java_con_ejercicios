package matriz;

import javax.swing.JOptionPane;

public class ejc1 {

	public static void main(String[] args) {
		/*
		// matriz de 3 x 3
		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// recorrer mi matriz de 3 x 3
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" ");
		}
		*/

		// matriz de 4 filas, 3 columnas

		float matriz2[][] = new float[4][3];

		//recorrer las filas
		for (int i = 0; i < 4; i++) {
			//recorrer las columnas
			for (int j = 0; j < 3; j++) {
				matriz2[i][j] = Float
						.parseFloat(JOptionPane.showInputDialog("Ingrese valor para la fila " + i + " " + j));

			}
		}
		
		
		//mostrar la matriz 
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
