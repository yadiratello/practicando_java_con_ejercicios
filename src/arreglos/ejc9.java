package arreglos;


import javax.swing.JOptionPane;

public class ejc9 {

	public static void main(String[] args) {
		/*
		 * programa que permita cargar 5 nombres de personas y sus edades
		 * Luego de realizar la carga por teclado de todos los datos imprimir
		 * los nombres de las personas mayores de edad( >= 18)
		 */
		
		
		String nombres [] = new String [5];
		int edades [] = new int [5];

		
		//llenando los arreglos
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = JOptionPane.showInputDialog("Ingrese nombre para la persona "+(i+1) );
			edades[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad para "+nombres[i]));

		}
		
		// Imprimir los nombres de las personas mayores de edad
		System.out.println("Las personas mayores de edad son....".toUpperCase());
		for (int i = 0; i < nombres.length; i++) {
			
			if(edades[i]>=18){
				System.out.println(nombres[i].toUpperCase()+" tiene "+edades[i]+" años.");
			}
		}
		
		
	}

}
