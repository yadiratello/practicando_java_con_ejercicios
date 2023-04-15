package matriz;

import javax.swing.JOptionPane;

public class ej17 {

	public static void main(String[] args) {
		/*
		 * se tiene 2 matrices de 3 x 3: sumar, restar, multiplicar sus
		 * elementos e insertarlo en una nueva matriz
		 */

		int primeraMatriz[][] = new int[3][3];
		int segundaMatriz[][] = new int[3][3];
		int resultadoSumaMatriz[][] = new int[3][3];
		int resultadoRestaMatriz[][] = new int[3][3];
		int resultadoMultiMatriz[][] = new int[3][3];

		// llenando las 1ra matriz
		System.out.println("Digite los elementos para la primera matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				primeraMatriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i + "." + j));
			}
		}

		// llenando las 2da matriz
		System.out.println("Digite los elementos para la segunda matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				segundaMatriz[i][j] = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i + "." + j));
			}
		}

		// realizando los calculos
		// Sumamos las matrices
		for (int i = 0; i < primeraMatriz.length; i++) {
			for (int j = 0; j < segundaMatriz.length; j++) {
				resultadoSumaMatriz[i][j] = primeraMatriz[i][j] + segundaMatriz[i][j];
			}
		}

		// Restamos las matrices
		for (int i = 0; i < primeraMatriz.length; i++) {
			for (int j = 0; j < segundaMatriz.length; j++) {
				resultadoRestaMatriz[i][j] = primeraMatriz[i][j] - segundaMatriz[i][j];
			}
		}

		// Multiplicamos las matrices
		for (int i = 0; i < primeraMatriz.length; i++) {
			for (int j = 0; j < segundaMatriz.length; j++) {
				resultadoMultiMatriz[i][j] = primeraMatriz[i][j] * segundaMatriz[i][j];
			}
		}


		// im´primimos las matrices
		System.out.println("\nLa suma de las matrices es:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(resultadoSumaMatriz[i][j] + " ");
			}
			System.out.println("");
		}

		// im´primimos las matrices
		System.out.println("\nLa resta de las matrices es:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(resultadoRestaMatriz[i][j] + " ");
			}
			System.out.println("");
		}
		// im´primimos las matrices
		System.out.println("\nLa multiplicacion de las matrices es");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(resultadoMultiMatriz[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
