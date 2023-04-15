package poo.abstraccion;

/*
 * Una "clase abstracta" es una clase que no puede ser instanciada directamente, 
 * sino que sirve como plantilla o base para otras clases que la heredan. 
 *  Estas clases abstractas pueden contener métodos abstractos, que son métodos 
 * sin implementación y deben ser implementados en las clases hijas. El
 */
public abstract class Jugador {

	// atributos 
	protected String nombre;
	protected int edad;
	
	//constructor
	public Jugador(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//creamos metodo abstracto(metodo sin implementacion)
	public abstract void jugar();
		
	
	
}
