package matriz;

import javax.swing.JOptionPane;

public class ej12 {

	public static void main(String[] args) {
		/*
		 * cargar una matriz de 2 filas x 5 columnas 
		 * realizar la carga de componentes por columna
		 * (es decor primero ingresar toda la 1ra columna, luego
		 * la 2da columna y asi sucesivamente)
		 * Imprimir luego la matriz
		 */

		int[][] matriz = new int[2][5];
		
		//llenar la matriz
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 2; i++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor para la posicion: "+i+"."+j));
			}
		}
		
		

		System.out.println("Matriz original");
		for (int i = 0; i < 2; i++) {
			for (int k = 0; k < 5; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println();
		}

	

	
	}

}
