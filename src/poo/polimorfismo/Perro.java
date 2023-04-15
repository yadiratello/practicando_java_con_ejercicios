package poo.polimorfismo;

public class Perro extends Animal{

	public Perro(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarSonido() {
		System.out.println("El perro dice guau, gua, guau.");
		System.out.println("El perro "+nombre+" tiene "+ edad+" años y mide "+tamano+" cm.");
	}

}
