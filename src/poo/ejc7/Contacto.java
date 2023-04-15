package poo.ejc7;

public class Contacto {

	// ATRIBUTOS
	private String nombre;
	private int telefono;

	// CONSTRUCTORES
	public Contacto(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Contacto(String nombre) {
		this.nombre = nombre;
		this.telefono = 0;
	}

	// -------------------------- GETTERS AND SETTERS ------------------------
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	
	
	
	
	
	//METODO EQUALS
	public boolean equals(Contacto contacto) {
		if(nombre.trim().equalsIgnoreCase(contacto.getNombre().trim())){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "\nNombre : " + nombre + "\nTelefono : " + telefono + "\n";
	}
	
	
	
	
	
	
	
}
