package poo.abstraccion;

public class JugadorBasquet extends Jugador {

	// constructor
	public JugadorBasquet(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	// implementando el metodo abstracto de la clase padre(Jugador)
	@Override
	public void jugar() {
		System.out.println("El jugador de basquet " + nombre + " tiene " + edad + " a�os.");
		System.out.println("Este jugador est� en el campo saltando con el balon.");
	}

}
