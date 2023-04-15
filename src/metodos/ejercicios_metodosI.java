package metodos;

import java.util.Scanner;

public class ejercicios_metodosI {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.leeDatosPersona();
		
		persona.mostrarDatosPersona();

	}

}

// clase Persona
class Persona {
	// atributos
	String nombre;
	String apellidos;
	int edad;
	String estado_civil;

	// metodo setter
	public void leeDatosPersona() {

		Scanner sc = new Scanner(System.in);

		System.out.println("ingrese nombre:");

		nombre = sc.nextLine();

		System.out.println("ingrese edad:");

		edad = sc.nextInt();
		
		System.out.println("ingrese Estado Civil:");

		estado_civil = sc.next();
	}
	
	
	//metodo getter(obtener)
	public void mostrarDatosPersona(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Est. Civil: "+estado_civil);
	}
	
}
