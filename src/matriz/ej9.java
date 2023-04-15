package matriz;

import javax.swing.JOptionPane;

public class ej9 {

	public static void main(String[] args) {
		//

		int matriz[][] = new int[4][4];

		// rellenamos la matriz
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 4; k++) {
				matriz[i][k] = Integer
						.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i + "." + k));
			}
		}

		// mostramos la matriz
		for (int i = 0; i < 4; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(matriz[i][k]+" ");
			}
			System.out.println();
		}
		
		
		//imprimimos la diagonal
		System.out.println("\n1La diagonal principal es:");
		for (int i = 0; i < 4; i++) {
			System.out.println(matriz[i][i]+" ");
		}
	}

}
