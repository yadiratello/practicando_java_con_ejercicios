package arreglos;

import javax.swing.JOptionPane;

public class ejc11 {

	public static void main(String[] args) {
		/*
		 * crear un arreglo de N elementos y dado a ese arreglo separar los
		 * elementos positivos y negativos en diferentes arreglos
		 */
		int elementos, cantPositivos = 0, cantNegativos = 0, cantCeros = 0;
		int arreglo[], negativos[], positivos[];

		// establecer la cantidad de elementos que tendra el arreglo
		elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño para el arreglo:"));

		arreglo = new int[elementos];

		// lenando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion " + i));

			// contar los numeros positivos, negativos y ceros
			if (arreglo[i] > 0) {
				cantPositivos++;
			} else if (arreglo[i] < 0) {
				cantNegativos++;
			} else {
				cantCeros++;
			}
		}

		positivos = new int[cantPositivos];
		negativos = new int[cantNegativos];

		// inicializar a 0 las cantidades
		cantPositivos = 0;
		cantNegativos = 0;

		// llenando mis arreglos de numeros positivos
		for (int i = 0; i < elementos; i++) {
			// validando
			if (arreglo[i] > 0) {
				positivos[cantPositivos] = arreglo[i];
				cantPositivos++;
			} else if (arreglo[i] < 0) {
				negativos[cantNegativos] = arreglo[i];
				cantNegativos++;
			} 
		}
		
		System.out.println("ARREGLO DE POSITIVOS...");
		// imprimir el array positivos
		for (int i = 0; i < positivos.length; i++) {
			System.out.println(positivos[i]);
		}

		System.out.println("ARREGLO DE NEGATIVOS...");
		// imprimir el array negativos
		for (int i = 0; i < negativos.length; i++) {
			System.out.println(negativos[i]);
		}
		
		
		System.out.println("la cantidad de Ceros en el arreglos es: "+cantCeros);
	}

}
