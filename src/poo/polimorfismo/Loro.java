package poo.polimorfismo;

public class Loro extends Animal{

	public Loro(String nombre, int edad, int tamano) {
		super(nombre, edad, tamano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarSonido() {
		System.out.println("El loro dice cri, cri, cri.");
		System.out.println("El loro "+nombre+" tiene "+ edad+" años y mide "+tamano);
	}

}
