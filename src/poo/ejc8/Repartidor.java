package poo.ejc8;

//esta clase heredará de Empleado 
public class Repartidor extends Empleado {

	// ATRIBUTO
	private String zona;

	public Repartidor(String zona, String nombre, int edad, double salario) {
		super(nombre, edad, salario);
		// TODO Auto-generated constructor stub
		this.zona = zona;
	}

	//METODOS GETTER Y SETTERS
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	// implementando el metodo abstracto
	@Override
	public boolean plus() {
		/*
		 * En repartidor si tiene menos de 25 y reparte en "Lima" este recibira
		 * el plus.
		 */

		if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("lima")) {
			double nuevoSalario = super.getSalario() + super.getPlus();// actualizando
																		// el
																		// salario
			super.setSalario(nuevoSalario);// estableciendo el nuevo salario
			System.out.println("\nSe ha añadido el PLUS al empleado " + super.getNombre());
			System.out.println("Su salario actual es " + super.getSalario());
			return true;
		} else {
			System.out.println("El empleado no cumple con los requisitos para recibir el PLUS");
			return false;
		}
	}

	// metod toString
	@Override
	public String toString() {
		System.out.println(super.toString());
		return "Zona=" + zona;
	}

}
