package matriz;

import javax.swing.JOptionPane;

public class ej13 {

	public static void main(String[] args) {
		// ingresar 3 sueldos de 4 empleados, sumarlos y ponerlos en otro
		// arreglo y mostrar el mayor de los sueldos

		// creamos las matrices y arreglos
		String nombres[] = new String[4];// arreglo para guardar los nombres de
											// los 4 empleados

		double sueldos[][] = new double[4][3];// esta matriz guardara los 3
												// sueldos de los 4 empleados

		double sumaSueldosTotal[] = new double[4];// arreglo que guardara los
													// sueldos totales de los 4
													// empleados

		// Rellenamos la matriz con los nombres y los sueldos
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese nombre para el empleado " + (i + 1));
			//creamos un segundo for para llenar los sueldos
			for (int j = 0; j < sueldos[i].length; j++) {		
				sueldos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sueldo "+(j+1)+" para el empleado " + nombres[i]+": "));
			}
			//System.out.println(sueldos[i].length);//=3
		}
		
		
		//calculando la suma de los sueldos de cada empleado
		for (int i = 0; i < sumaSueldosTotal.length; i++) {
			int sumaSueldos = 0;//guardara la suma de cada sueldo que hay en mi matriz sueldos
			for (int j = 0; j < sueldos[i].length; j++) {
				sumaSueldos += sueldos[i][j];
			}
			//guardarlo en mi array de suma de sueldos
			sumaSueldosTotal[i]= sumaSueldos;
		}
		
		//mostrar los sueldos de cada empleado
		System.out.println("\nLos sueldos totales son:");
		for (int i = 0; i < sumaSueldosTotal.length; i++) {
			System.out.println("El sueldo total del empleado "+nombres[i]+" es: "+sumaSueldosTotal[i]);
		}
		
		
		//hallamos el nombre del empleado con mayor sueldo 
		double sueldoMayor = sumaSueldosTotal[0];
		String nombreEmpleadoSueldoMayor = nombres[0];
		
		for (int i = 0; i < sumaSueldosTotal.length; i++) {
			if(sumaSueldosTotal[i]>sueldoMayor){
				sueldoMayor = sumaSueldosTotal[i];
				nombreEmpleadoSueldoMayor = nombres[i];
			}
		}
		
		//Mostramos el sueldo y nombre del empleado
		System.out.println("\nEl empleado con mayor sueldo es : "+nombreEmpleadoSueldoMayor+", con un total de "+sueldoMayor+" soles.");
		

	}

}
