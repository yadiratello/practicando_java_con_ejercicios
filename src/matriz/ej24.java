package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ej24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int cantidadFilas;

		char matrizIrregular[][];

		cantidadFilas = Integer.parseInt(
				JOptionPane.showInputDialog("Digite la cantidad de filas que desea para la matriz irregular: "));

		matrizIrregular = new char[cantidadFilas][];

		// rellenamos la matriz irregular

		for (int i = 0; i < matrizIrregular.length; i++) {
			System.out.print("Digite la cantidad de elementos para la fila " + i + ":");
			int nColumnas = entrada.nextInt();
			matrizIrregular[i] = new char[nColumnas];

			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print("Digite una letra en la posición [" + i + "] " + j + "]: ");
				matrizIrregular[i][j] = entrada.next().charAt(0);

			}

		}
		System.out.println("");

		System.out.println("La matriz irregular es: ");
		for (int i = 0; i < matrizIrregular.length; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print(matrizIrregular[i][j] + " ");

			}
			System.out.println("");
		}
	}

}
