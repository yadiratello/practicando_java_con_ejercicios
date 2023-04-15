package arreglos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ejc16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * crear un programa q lea elementos a un array y terminar el programa
		 * cuando digites el -1, por ultimo mostrar el array.
		 */

		ArrayList<Integer> arreglo = new ArrayList<>();

		int numero = 0;

		// recorrer con un bucle
		while (numero != -1) {

			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor "));

			if (numero != -1) {
				arreglo.add(numero);
			}

		}

		// mostrar el programa
		for (

		int arr : arreglo) {
			System.out.println(arr);
		}

	}

}
