package poo2;

import javax.swing.JOptionPane;

public class EjecutarBucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String nombres[] = new String[3];

		nombres[0] = "Juan";
		nombres[1] = "Jaime";
		nombres[2] = "Sandro";

		int edad[] = { 1, 2, 3, 4, 5 };

		// recorrer el arreglo con bucle for normal
		System.out.println("BUCLE FOR NORMAL");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre: " + nombres[i]);
		}

		// recorrer con bucle for each
		System.out.println("\nBUCLE FOR EACH");
		for (String nuevoNombre : nombres) {
			System.out.println("Nombre  " + nuevoNombre);
		}

		// recorrer con bucle for each
		System.out.println("\nBUCLE FOR EACH de EDADES");
		for(int misEdades : edad){
			System.out.println(misEdades);
		}
		*/
		
		
		
		//creamos arreglo de objetos 
		BucleForEach objArray[] = new BucleForEach[4];
		
		//llenando el arreglo de manera manual
		objArray[0] = new BucleForEach("Juan","Peres", 12, 3121212);
		objArray[1] = new BucleForEach("Marco","Torres", 23, 9999212);
		objArray[2] = new BucleForEach("Lupe","Porres",32, 2323212);
		objArray[3] = new BucleForEach("Pedro","Ramos", 50, 3188882);
	
		//pedir datos de manera dinamica
		String nombre, apellido;
		int edad, dni;
		
		for (int i = 0; i < objArray.length; i++) {
			nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona "+(i+1)+" : ");
			apellido = JOptionPane.showInputDialog("Ingrese el apellido de "+nombre+" : ");
			dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni de "+nombre+" : "));
			edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de "+nombre+" : "));
		
			objArray[i] = new BucleForEach(nombre, apellido, edad, dni);
		}
		
		//recorrer el arreglo 
		for (BucleForEach obj : objArray) {
			obj.mostrarDatos();
		}
	}

}
