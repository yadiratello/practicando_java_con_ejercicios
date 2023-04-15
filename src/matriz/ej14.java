package matriz;

import javax.swing.JOptionPane;

public class ej14 {

	public static void main(String[] args) {
		/*
		 * Se desea saber la temperatura media trimestral de cuatro paises. Para
		 * ello se tiene como dato las temperaturas medias mensuales de dichos
		 * paises. Se debe ingresar el nombre del país y seguidamente las tres
		 * temperaturas medias mensuales. Seleccionar las estructuras de datos
		 * adecuadas para el almacenamiento de los datos en memoria. a - Cargar
		 * por teclado los nombres de los paises y las temperaturas medias
		 * mensuales. b - Imprimir los nombres de las paises y las temperaturas
		 * medias mensuales de las mismas. c - Calcular la temperatura media
		 * trimestral de cada país. c - Imprimr los nombres de los paises y las
		 * temperaturas medias trimestrales. b - Imprimir el nombre del pais con
		 * la temperatura media trimestral mayor.
		 */

		// creamos las matrices y arreglos
		String nombres[] = new String[4];// arreglo para guardar los nombres de
											// los 4 paises

		double temperaturas[][] = new double[4][3];// esta matriz guardara los 3
													// temperaturas de los 4
													// paises

		double sumaSueldosTotal[] = new double[4];// arreglo que guardara los
													// sueldos totales de los 4
													// paises

		// Rellenamos la matriz con los nombres y los temp
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese nombre del Pais " + (i + 1));
			// creamos un segundo for para llenar los sueldos
			for (int j = 0; j < temperaturas[i].length; j++) {
				temperaturas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
						"Ingrese temperatura media del mes " + (j + 1) + " para el pais " + nombres[i] + ": "));
			}
		}

		// Imprimir los nombres de los países y las temperaturas medias
		// mensuales
		System.out.println("Los nombres de los países y las temperaturas medias mensuales son:");
		for (int i = 0; i < 4; i++) {
			System.out.print(nombres[i] + ": ");
			for (int j = 0; j < 3; j++) {
				System.out.print(temperaturas[i][j] + " ");
			}
			System.out.println();
		}

		// Calcular la temperatura media trimestral de cada país
		double[] temperaturasMediasTrimestrales = new double[4];
		for (int i = 0; i < 4; i++) {
			double sumaTemperaturas = 0;
			for (int j = 0; j < 3; j++) {
				sumaTemperaturas += temperaturas[i][j];
			}
			temperaturasMediasTrimestrales[i] = sumaTemperaturas / 3;
		}

		// Encontrar el país con la temperatura media trimestral mayor
		double temperaturaMaxima = temperaturasMediasTrimestrales[0];
		String paisMaximo = nombres[0];
		for (int i = 1; i < 4; i++) {
			if (temperaturasMediasTrimestrales[i] > temperaturaMaxima) {
				temperaturaMaxima = temperaturasMediasTrimestrales[i];
				paisMaximo = nombres[i];
			}
		}
		System.out.println("El país con la temperatura media trimestral mayor es " + paisMaximo
				+ " con una temperatura de " + temperaturaMaxima);
	}

}
