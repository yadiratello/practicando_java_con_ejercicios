package arreglos;

import javax.swing.JOptionPane;

public class ejc13 {

	public static void main(String[] args) {
		// invertir un arreglo de N elementos
		
		
		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo:"));
		
		int arreglo[] = new int[elementos];
		int auxiliar[] = new int[elementos];
		
		//llenar el arreglo  
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion "+i));
		}
		
		
		//invertir el array anterior
		for (int i = elementos-1 , j = 0 ; i >= 0; i--, j++) {
			auxiliar[j] = arreglo[i];
		}
		
		//recorrer los bucles
		System.out.println("Arreglo original");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
		System.out.println("\nArreglo Invertido");
		for (int i = 0; i < auxiliar.length; i++) {
			System.out.println(auxiliar[i]);
		}

	}

}
