package poo.ejc8;

//si esta clase tiene un metodo abstracto esta clase tmb debe de ser abstracta
public abstract class Empleado {
	
	//atributos
	private String nombre;
	private int edad;
	private double salario;
	private final double PLUS=300;//constante
	
	//constructor de clase
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	
	//getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPlus() {
		return PLUS;
	}


	//METODO TOSTRING
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ",\nedad=" + edad + ", \nsalario=" + salario + ", \nplus=" + PLUS + "]";
	}
	
	//metodo plus que se implementara en sus subclases
	public abstract boolean plus();
	

}
