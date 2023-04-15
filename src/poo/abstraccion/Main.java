package poo.abstraccion;

public class Main {

	public static void main(String[] args) {
		
		//Jugador jugador = new Jugador();
		
		//instanciando las subclases
		JugadorFutbol jugadorFutbol = new JugadorFutbol("Juan", 12);	
		jugadorFutbol.jugar();
		
		JugadorBasquet jugadorBasquet = new JugadorBasquet("Luis",15);
		jugadorBasquet.jugar();
		
	}

}
