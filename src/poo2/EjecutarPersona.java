package poo2;

import javax.swing.JOptionPane;

public class EjecutarPersona {

	public static void main(String[] args) {
		// crear objeto de la clase persona
		Persona p1 = new Persona();

		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad:"));
		String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
		
		p1.verificarMayoriaDeEdad(edad, nombre);
		
	}

}
