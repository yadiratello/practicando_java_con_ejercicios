package poo.abstraccion;

public class JugadorFutbol extends Jugador{

	
	public JugadorFutbol(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	//implementando metodo abstracto de la clase padre(Jugador)
	@Override
	public void jugar() {
		System.out.println("El jugador de futbol "+nombre+" tiene "+edad+" a�os.");
		System.out.println("Este jugador est� en la cancha pateando ell balon.");
	}

}
