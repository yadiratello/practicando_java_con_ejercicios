package poo.herencia;

public class Gato extends Animal {

	String tipoComidas[] = { "carne", "pescado", "atun", "ratones" };

	// constructores...
	public Gato(String nombre, int id, int edad) {
		super(nombre, id, edad);
		// TODO Auto-generated constructor stub
	}

	public Gato(String nombre, int id, int edad, String[] tipoComidas) {
		super(nombre, id, edad);
		this.tipoComidas = tipoComidas;
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.print("El gato " + nombre + " esta comiendo: ");
		for (int i = 0; i < tipoComidas.length; i++) {
			System.out.print( tipoComidas[i] + ", ");
		}
		System.out.println();
	}

	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
	}

	public void maullar() {
		System.out.println("El gato " + nombre + " está maullando.");
	}
}
