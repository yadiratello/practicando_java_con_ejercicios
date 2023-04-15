package arreglos;

import javax.swing.JOptionPane;

public class ejc1 {

	public static void main(String[] args) {
		// llenar 5 elementos y recorrerlo
		
		float miArreglo [] = new float [10];
		
		//pedir al usuario que ingrese 10 elementos para llenar el arreglo
		for (int i = 0; i < miArreglo.length; i++) {
			miArreglo[i] = Float.parseFloat(JOptionPane.showInputDialog("Ingrese numero en la posicion "+(i+1)+" :"));
		}
		
		//listar mi array
		for (int i = 0; i < miArreglo.length; i++) {
			System.out.println(miArreglo[i]);
		}
		
		System.out.println("Listado con for each");
		for (float i : miArreglo) {
			System.out.println(i);
		}
	}

}
