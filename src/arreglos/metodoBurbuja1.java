package arreglos;

import javax.swing.JOptionPane;

public class metodoBurbuja1 {

	public static void main(String[] args) {
		// metodo burbujar(ordenar ascendentememte un arreglo)

		int arreglo[];

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el tamaño del arreglo"));

		arreglo = new int[elementos];

		// llenando el arreglo
		for (int i = 0; i < elementos; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite un valor para la posicion " + i));
		}

		System.out.println("El arreglo actual es...");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

		// 0rdenando el arreglo
		// METODO BURBUJA
		int aux;

		//recorrer el array y ordenarlo
		for (int i = 0; i < elementos - 1; i++) {
			for (int j = 0; j < elementos -1; j++) {
				if(arreglo[j]>arreglo[j+1]){
					aux = arreglo[j];
					arreglo[j] = arreglo[j+1];
					arreglo[j+1] = aux;
				}
			}
		}
		
		//
		System.out.println("El arreglo ordenado es...");
		for (int i = 0; i < elementos; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
