package arreglos;

import javax.swing.JOptionPane;


public class ejc17 {

	public static void main(String[] args) {
		//

		int arreglo1[] = new int[10];
		int arreglo2[] = new int[10];
		int arreglo3[] = new int[20];

		boolean esCreciente = false;

		// llenamos el 1er arreglo
		do {
			JOptionPane.showMessageDialog(null, "Ingrese valores para el primer arreglo");
			// llenar los datos par el primer arreglo
			for (int i = 0; i < arreglo1.length; i++) {
				arreglo1[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i));

			}

			// verificamos si el arreglo es creciente
			for (int i = 0; i < arreglo1.length - 1; i++) {
				if (arreglo1[i] < arreglo1[i + 1]) {
					esCreciente = true;
				} else {
					esCreciente = false;
					break;
				}
			}
			// si el arreglo no esta en orden creciente pedir que vuelva a
			// digitar
			if (esCreciente == false) {
				JOptionPane.showMessageDialog(null, "\nPor favor, vuelva a digitar...\n");
			}

		} while (esCreciente == false);

		// llenamos el 2do arreglo
		do {
			JOptionPane.showMessageDialog(null, "Ingrese valores para el segundo arreglo");
			// llenar los datos par el primer arreglo
			for (int i = 0; i < arreglo2.length; i++) {
				arreglo2[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i));

			}

			// verificamos si el arreglo es creciente
			for (int i = 0; i < arreglo2.length - 1; i++) {
				if (arreglo2[i] < arreglo2[i + 1]) {
					esCreciente = true;
				} else {
					esCreciente = false;
					break;
				}
			}

			// si el arreglo no esta en orden creciente pedir que vuelva a
			// digitar
			if (esCreciente == false) {
				JOptionPane.showMessageDialog(null, "\nPor favor, vuelva a digitar...\n");
			}

		} while (esCreciente == false);

		// fucionamos los arreglos
		int i = 0, j = 0, k = 0;

		// llenamos 1 de los 2 arreglos(creciente)
		while (i < 10 && j < 10) {
			if (arreglo1[i] < arreglo2[j]) {
				arreglo3[k] = arreglo1[i];
				i++;
			} else {
				arreglo3[k] = arreglo2[j];
				j++;
			}
			k++;
		}

		if (i == 10) {
			while (j < 10) {
				arreglo3[k] = arreglo2[j];
				j++;
				k++;
			}
		} else {
			while (i < 10) {
				arreglo3[k] = arreglo1[i];
				i++;
				k++;
			}
		}

		// mostramos los elementos del 3er arreglo
		System.out.println("el tercer arreglo es:");
		for (k = 0; k < 20; k++) {
			System.out.println(arreglo3[k] + " ");
		}

	}

}
