package poo.ejc8;

public class Comercial extends Empleado {

	// ATRIBUTOS
	private double comision;

	// METODOS GETTERS Y SETTERS
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	// CONSTRUCTOR DE LA CLASE
	public Comercial(double comision, String nombre, int edad, double salario) {
		super(nombre, edad, salario);// atributos de la clase padre
		// TODO Auto-generated constructor stub
		this.comision = comision;
	}

	// implementando metodo abstracto
	@Override
	public boolean plus() {
		/*
		 * En comercial, si tiene mas de 30 años y cobra una comision de mas de
		 * 200 soles, se le aplicara el plus.
		 */
		if (getEdad() > 30 && this.comision > 200) {
			double nuevoSalario = super.getSalario() + super.getPlus();
			super.setSalario(nuevoSalario);
			System.out.println("\nSe le ha añadido el PLUS al empleado " + super.getNombre());
			System.out.println("Su salario actual es : " + super.getSalario());
			return true;
		} else {
			System.out.println("\nEl empleado no cumple con los requisitos para el PLUS.");
			return false;
		}
	}

	// metodo tostring
	@Override
	public String toString() {
		System.out.println("\n"+super.toString());
		return "\nComision=" + comision;
	}

}
