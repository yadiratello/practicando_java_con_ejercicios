package poo.herencia;


//CLASE PADRE O SUPER CLASES
public class Animal {
	
	//protected: permite que las subclases hereden estos atributos o metodos 
	protected String nombre;
	protected int id;
	protected int edad;

	//CONSTRUCTOR
	public Animal(String nombre, int id, int edad) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
	}
	
	//METODOS
	public void comer(){
		System.out.println("El animal está comiendo...");
	}


	public void mostrarDatos(){
		System.out.println("El nombre del animal es: "+this.nombre);
		System.out.println("El ID del animal es: "+this.id);
		System.out.println("El animal tiene  "+edad+" años.");
	}

}
