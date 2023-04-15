package arreglos;

import javax.swing.JOptionPane;


public class ejc14 {

	public static void main(String[] args) {
		/*
		 * crear un programa que guarde 10 nombres de personas con sus alturas,
		 * luego indicar la mayor y menor altura con sus nombres.
		 */

		// variables
		String nombres[] = new String[5];
		double alturas[] = new double[5];
		double mayorAltura = 0, menorAltura = 0;

		// llenar los array
		for (int i = 0; i < alturas.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese nombre:");
			alturas[i] = Double
					.parseDouble(JOptionPane.showInputDialog((i + 1) + ". Ingrese la altura de " + nombres[i]));
		}

		mayorAltura = alturas[0];
		menorAltura = alturas[0];
		String nomMayorAltura = nombres[0];
		String nomMenorAltura = nombres[0];
		
		// hallar la mayor y menor altura
		for (int i = 0; i < alturas.length; i++) {

			// hallar la mayor y menor altura
			if (alturas[i] > mayorAltura) {
				mayorAltura = alturas[i];
				nomMayorAltura = nombres[i];			
			} else if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
				nomMenorAltura = nombres[i];
			}

		}
		
		System.out.println("la mayor altura es de : " + nomMayorAltura + " - Altura: " + mayorAltura);
		System.out.println("la menor altura es de : " + nomMenorAltura + " - Altura: " + menorAltura);

	}

}
