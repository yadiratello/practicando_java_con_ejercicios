package poo.polimorfismo;

public class Gato extends Animal {

	public Gato(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarSonido() {
		System.out.println("El gato dice miau, mau, meow.");
		System.out.println("El gato "+nombre+" tiene "+ edad+" años y mide "+tamano+" cm.");
	}

}
