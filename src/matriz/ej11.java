package matriz;

public class ej11 {

	public static void main(String[] args) {
		/*
		 * cargar una matriz de 3 filas x 4 columnas imprimir la 1ra fila.
		 * Imprimir la ultima fila e imprimir la 1ra columna
		 */

		int[][] matriz = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("Matriz original");
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(matriz[i][k] + " ");
			}
			System.out.println();
		}

		// imprimimos la primera y ultima fila
		System.out.println("\nLa primera y ultima fila son:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (i == 0 || i == 2) {
					System.out.print(matriz[i][j] + " ");
				}
			}
			System.out.println();
		}

		// imprimimos la primera columna
		System.out.println("\nLa primera columna es::");
		for (int i = 0; i < 3; i++) {
			System.out.println(matriz[i][0] + " ");

		}
		System.out.println();

	}

}
