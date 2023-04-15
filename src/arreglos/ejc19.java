package arreglos;

import javax.swing.JOptionPane;

public class ejc19 {

	public static void main(String[] args) {
		/*
		 * cargar 2 arreglos de 12 elementos c/u y mezclarlos en un tercer
		 * arreglo de la forma que: 3 del primer arreglo, 3 del segundo arreglo,
		 * 3 del primer arreglo, 3 del segundo arreglo, etc
		 */

		/*
		 * ejm: a[] = {1,2,3,4,5,6,7,8,9,10,11,12} b[] =
		 * {13,14,15,16,17,18,19,20,21,22,23,24} c[] = {1,2,3, 13,14,15, 4,5,6,
		 * 16,17,18 ...}
		 */

		int a[] = new int[12];
		int b[] = new int[12];
		int c[] = new int[24];

		// llenamos el 1er arreglo
		JOptionPane.showMessageDialog(null, "Digite valores para el Primer arreglo");
		for (int i = 0; i < a.length; i++) {
			a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i));
		}

		// llenamos el 2do arreglo
		JOptionPane.showMessageDialog(null, "Digite valores para el Segundo arreglo");
		for (int i = 0; i < a.length; i++) {
			b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion " + i));
		}

		// mezclamos los arreglos en el arreglo c
		int i = 0; // me va a recorrer los arreglos a y b
		int j = 0; // va a apuntar al tercer arreglo, voy a guardar los
					// elementos

		//
		while (i < 12) {
			// llenamos 3 elementos del 1er arreglo a hacia c
			for (int k = 0; k < 3; k++) {
				c[j] = a[i + k];// 0+1
				j++;
			}
			// llenamos 3 elementos del 2do arreglo b hacia c
			for (int k = 0; k < 3; k++) {
				c[j] = b[i + k];// 0+1
				j++;
			}
			i += 3;
		}
		
		
		//mostramos el 3er arreglo
		System.out.println("Arreglo 3");
		for ( j = 0; j < c.length; j++) {
			System.out.println(c[j]+" ");
		}

	}

}
