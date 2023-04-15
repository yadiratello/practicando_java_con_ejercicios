package poo2;

public class Persona {

	public void verificarMayoriaDeEdad(int edad, String nombre) {

		if (edad >= 18) {
			System.out.println("El ciudadano " + nombre + " es mayor de edad.");
		}else{
			System.out.println("El ciudadano " + nombre + " es menor de edad.");
		}
	}

}
