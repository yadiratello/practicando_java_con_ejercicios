package poo.herencia;

//SUBCLASE
public class Nutria extends Animal {

	
	public Nutria(String nombre, int id, int edad) {
		super(nombre, id, edad);
		// TODO Auto-generated constructor stub
	}

	//llamando al metodo de la clase padre
	// override se utiliza para indicar que se está sobrescribiendo un método de la clase padre (superclase).
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		super.comer();
		System.out.println("La nutria come peces.");
	}
	
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
	}
	
	//metodo de esta clase hija
	public void nadar(){
		System.out.println("La nutria está nadando.");
	}
	
}
