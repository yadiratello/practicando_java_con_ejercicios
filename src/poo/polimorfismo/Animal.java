package poo.polimorfismo;


// metodos abstractos => clase abstracta
public abstract class Animal {

	//atributos
	protected String nombre;
	protected int edad;
	protected int tamano;
	
	//constructor
	public Animal(String nombre, int edad, int tamano) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.tamano = tamano;
	}
	
	//metodo abstracto
	public abstract void realizarSonido();
	
}
