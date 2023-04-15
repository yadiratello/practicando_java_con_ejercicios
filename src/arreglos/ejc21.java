package arreglos;

import javax.swing.JOptionPane;

public class ejc21 {

	public static void main(String[] args) {
		/*
		 * buscar un elemento en un array de nelementos o la cantidad que desea
		 * segun su posicion
		 */

		int nElementos;
		int elementoABuscar;
		int arreglo[];
		boolean encontrado = false;

		nElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del arreglo:"));

		arreglo = new int[nElementos];

		// llenando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor para la posicion: " + i));
		}

		// mostrando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}

		elementoABuscar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el elemento a buscar:").toUpperCase());

		int i = 0;//almacenara la posicion encontrada en el arreglo

		// buscar el elemento a buscar en el arreglo
		while (i < nElementos && encontrado == false) {

			if (arreglo[i] == elementoABuscar) {
				encontrado = true;//sale del bucle
				break;
			}
			i++;//incrementa i
		}
		
		if(encontrado == false){
			System.out.println("Elemento no encontrado en el array");
		}else{
			System.out.println("Elemento encontrado, en la posicion "+i);
		}

	}

}
