package matriz;

import javax.swing.JOptionPane;

public class ej26 {

	public static void main(String[] args) {
		/*
		 * Confeccionar una clase para dministrar los dias q han faltado los 3
		 * empleados de una empresa. Definir un vector de 3 elementos de tipo
		 * String para cargar los nombres y una matriz irregular para cargar los
		 * dias q han faltado cada empleado (cargar el numero de dia q falto)
		 * cada fila de la matriz representan los dias d cada empleado. Mostrar
		 * los empleados con la cantidad de inasistencias. Cual empleado falto
		 * menos dias.
		 */

		// creando array para los 3 empleados
		String nombres[] = new String[3];
		// matriz
		int dias[][] = new int[3][];

		// rellenamos el arreglo de nombres y la matriz irregular
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " + (i + 1));
			// establecer los dias faltados para cada empleado
			int cantFaltas = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese la cantidad de dias faltados del empleado " + nombres[i] + ": "));
			dias[i] = new int[cantFaltas];
			// recorrer las columnas
			for (int j = 0; j < dias[i].length; j++) {
				dias[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el n° de dia: "));
			}

		}

		
		// Imprimimos la catidad de inasistencias
		System.out.println("cantidad de faltas por empleado:");
		for (int i = 0; i < 3; i++) {
			System.out.println("El empleado "+nombres[i]+" tiene "+dias[i].length+" faltas.");
		}

		//calculamos el empleado con mayor numero de inasistencias
		String nombreEmpleado = nombres[0];
		int faltas = dias[0].length;
		
		//hallar al empleado que tiene el menor numero de inasistencias 
		for (int i = 0; i < nombres.length; i++) {
			if(dias[i].length<faltas){
				faltas = dias[i].length;
				nombreEmpleado = nombres[i];
			}
		}
		
		//mostrar
		System.out.println("El empleado con menor numero de faltas es "+nombreEmpleado+" con "+faltas+" faltas.");
		
	}

}
