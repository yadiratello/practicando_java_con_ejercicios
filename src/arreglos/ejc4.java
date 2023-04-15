package arreglos;

import javax.swing.JOptionPane;

public class ejc4 {

	public static void main(String[] args) {
		/*
		 * calcular el promedio de 2 arreglos de 10 elementos e indicar el
		 * promedio mayor.
		 */

		float arreglo1[] = new float[10], arreglo2[] = new float[10];
		float sumaArreglo1 = 0, sumaArreglo2 = 0, promedio1 = 0, promedio2 = 0;

		// llenar arreglo 1
		JOptionPane.showMessageDialog(null, "LLenando datos para el arreglo 1");
		for (int i = 0; i < arreglo1.length; i++) {
			arreglo1[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero para la posicion " + i));
			//sumando todos los elementos 
			sumaArreglo1 += arreglo1[i];
		}
		promedio1 = sumaArreglo1/10;

		// llenar arreglo 2
		JOptionPane.showMessageDialog(null, "LLenando datos para el arreglo 2");
		for (int i = 0; i < arreglo2.length; i++) {
			arreglo2[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero para la posicion " + i));
			//sumando todos los elementos 
			sumaArreglo2 += arreglo2[i];
		}
		promedio2 = sumaArreglo2/10;
		
		//calcular el promedio mayor
		if(promedio1>promedio2){
			System.out.println("El promedio mayor es del arreglo 1 : "+promedio1);
		}else if(promedio1<promedio2){
			System.out.println("El promedio mayor es del arreglo 2 : "+promedio2);
		}else{
			System.out.println("Ambos promedios son iguales : "+promedio1 + " - "+promedio2);
		}

	}

}
