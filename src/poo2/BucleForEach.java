package poo2;

public class BucleForEach {

	
	//atributos
	private String nombres;
	private String apellido;
	private int edad;
	private int dni;
	
	
	
	public BucleForEach(String nombres, String apellido, int edad, int dni) {
		super();
		this.nombres = nombres;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	
	
	//METODOS
	public void mostrarDatos(){
		System.out.println("Nombre: "+this.nombres);
		System.out.println("Apellido: "+this.apellido);
		System.out.println("Dni: "+this.dni);
		System.out.println("Edad: "+this.edad+"\n");
	}
	

}
