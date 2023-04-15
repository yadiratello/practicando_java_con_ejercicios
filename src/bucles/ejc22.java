package bucles;

import javax.swing.JOptionPane;

public class ejc22 {

	public static void main(String[] args) {
		// programa que sume valores ingresados hasta ingresar 9999(no sumar
		// dicho valor)

		int n, sum = 0;

		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:\n9999 = Finaliza el programa."));

			if (n == 9999) {
				System.out.println("Se ingresó 9999 - Fin del programa.");
				break;
			}
			System.out.println(n);
			// calcular la suma de los numeros ingresados
			sum += n;

		} while (n != 9999);

		System.out.println("La suma de los valores ingresados es: " + sum);

		// comprobar la suma
		if (sum > 0) {
			System.out.println("La suma es mayor a 0");
		} else if (sum == 0) {
			System.out.println("La suma es igual a 0");
		} else if (sum < 0) {
			System.out.println("La suma es menor a 0");
		}

	}

}
