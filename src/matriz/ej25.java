package matriz;

import javax.swing.JOptionPane;

public class ej25 {

	public static void main(String[] args) {
		/*confecciona una clase para administrar una matriz irregular
		 * de 5 filas y 1 columna la 1ra fila, 
		 * 2 columnas la 2da fila y asi sucesivamnete hasta 
		 * 5 columnas la ultima fila(crearla sin la intervencion del operador)
		 * realizar la carga por teclado e imprimir posteriormenete.
		 */
		
		//creando matriz de 5 filas
		int matrizIrregular[][]=new int[5][];		
		
		//rellenar la matriz 
		//1. recorrer el numero de filas de la matriz
		for (int i = 0; i < matrizIrregular.length; i++) {
			//establesco la cantidad de columnas de cada fila: i = 1,2...5
			matrizIrregular[i] = new int[i+1];
			//recorro cada columna
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				matrizIrregular[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion: "+i+"."+j));
			}
			
		}

		//recorrer la matriz irregular
		System.out.println("La matriz es:");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < matrizIrregular[i].length; j++) {
				System.out.print(matrizIrregular[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
