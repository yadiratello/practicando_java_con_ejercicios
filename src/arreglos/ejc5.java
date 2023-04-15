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
		// Creamos un arreglo de tama�o N para almacenar los n�meros enteros.
		int[] arreglo = new int[N];
		// Pedimos al usuario que ingrese N n�meros enteros positivos.
		for (int i = 0; i < N; i++) {
			int numero;
			// Pedimos al usuario que ingrese un n�mero entero positivo.
			do {
				System.out.print("Ingrese un n�mero entero positivo: ");
				numero = sc.nextInt();
				if (numero < 0) {
					// Si el usuario ingresa un n�mero negativo, mostramos un
					// mensaje de error.
					System.out.println("Error: el n�mero debe ser positivo.");
				}
			} while (numero < 0);
			// Almacenamos el n�mero ingresado en la posici�n i del arreglo.
			arreglo[i] = numero;
		}
		// Verificamos si el arreglo est� en forma creciente, decreciente o
		// desordenado.
		boolean ordenado = true;
		int anterior = arreglo[0];
		for (int i = 1; i < N; i++) {
			if (arreglo[i] <= anterior) {
				// Si el elemento actual es menor o igual al elemento anterior,
				// el arreglo no est� en forma creciente.
				ordenado = false;
			}
			anterior = arreglo[i];
		}
		if (ordenado) {
			System.out.println("El arreglo est� en forma creciente.");
		} else if (isSortedDescending(arreglo)) {
			// Si el arreglo no est� en forma creciente pero est� en forma
			// decreciente, lo indicamos al usuario.
			System.out.println("El arreglo est� en forma decreciente.");
		} else {
			// Si el arreglo no est� en forma creciente ni decreciente, entonces
			// est� desordenado.
			System.out.println("El arreglo est� desordenado.");
		}
	}

	// Esta funci�n auxiliar verifica si el arreglo est� en forma decreciente.
	private static boolean isSortedDescending(int[] arreglo) {
		for (int i = 1; i < arreglo.length; i++) {
			if (arreglo[i] > arreglo[i - 1]) {
				// Si el elemento actual es mayor que el elemento anterior, el
				// arreglo no est� en forma decreciente.
				return false;
			}
		}
		// Si llegamos al final del arreglo sin encontrar un elemento mayor que
		// el anterior, entonces el arreglo est� en forma decreciente.
		return true;
	}
}
