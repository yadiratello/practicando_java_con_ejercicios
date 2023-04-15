package arreglos;

import java.util.Scanner;

public class ejc5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		// Pedimos al usuario que ingrese la cantidad de elementos del arreglo.
		do {
			System.out.print("Ingrese la cantidad de elementos del arreglo: ");
			N = sc.nextInt();
		} while (N <= 0);
		// Creamos un arreglo de tamaño N para almacenar los números enteros.
		int[] arreglo = new int[N];
		// Pedimos al usuario que ingrese N números enteros positivos.
		for (int i = 0; i < N; i++) {
			int numero;
			// Pedimos al usuario que ingrese un número entero positivo.
			do {
				System.out.print("Ingrese un número entero positivo: ");
				numero = sc.nextInt();
				if (numero < 0) {
					// Si el usuario ingresa un número negativo, mostramos un
					// mensaje de error.
					System.out.println("Error: el número debe ser positivo.");
				}
			} while (numero < 0);
			// Almacenamos el número ingresado en la posición i del arreglo.
			arreglo[i] = numero;
		}
		// Verificamos si el arreglo está en forma creciente, decreciente o
		// desordenado.
		boolean ordenado = true;
		int anterior = arreglo[0];
		for (int i = 1; i < N; i++) {
			if (arreglo[i] <= anterior) {
				// Si el elemento actual es menor o igual al elemento anterior,
				// el arreglo no está en forma creciente.
				ordenado = false;
			}
			anterior = arreglo[i];
		}
		if (ordenado) {
			System.out.println("El arreglo está en forma creciente.");
		} else if (isSortedDescending(arreglo)) {
			// Si el arreglo no está en forma creciente pero está en forma
			// decreciente, lo indicamos al usuario.
			System.out.println("El arreglo está en forma decreciente.");
		} else {
			// Si el arreglo no está en forma creciente ni decreciente, entonces
			// está desordenado.
			System.out.println("El arreglo está desordenado.");
		}
	}

	// Esta función auxiliar verifica si el arreglo está en forma decreciente.
	private static boolean isSortedDescending(int[] arreglo) {
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > arreglo[i - 1]) {
				// Si el elemento actual es mayor que el elemento anterior, el
				// arreglo no está en forma decreciente.
				return false;
			}
		}
		// Si llegamos al final del arreglo sin encontrar un elemento mayor que
		// el anterior, entonces el arreglo está en forma decreciente.
		return true;
	}
}
