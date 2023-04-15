package metodos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ejercicios_metodosVIII {

	public static void main(String[] args) {
		// programa que busca el numero 4

		int arreglo[] = { 1, 2, 3, 24, 5, 6, 7, 8, 9, 10, 11, 12, 14, 4 };

		// solicito que ingrese 1 numero
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero a buscar:"));

		buscarNumero(4, arreglo);

	}
	
	

	// metodo estatico
	public static boolean buscarNumero(int num, int arr[]) {
		int contador = 0;
		boolean encontrado = false;
		// recorrer el arreglo arr
		for (int i = 0; i < arr.length; i++) {
			// si el numero ingresado se encuentra en el arreglo de i
			if (num == arr[i]) {
				//encontrado = true;
				contador++;
				//break;
			}
			if(contador>0){
				encontrado = true;
				break;
			} else {
				encontrado = false;
			}
		}
		return encontrado;
	}

}
