package poo2;

public class Modificadores {

	/*
	 * En Java, hay cuatro modificadores de acceso que se utilizan para
	 * controlar el acceso a los miembros de una clase (variables, métodos,
	 * constructores) desde otras clases:
	 * 
	 * public: Un miembro declarado como público puede ser accedido desde
	 * cualquier clase en cualquier paquete. Es el modificador de acceso más
	 * permisivo.
	 * 
	 * protected: Un miembro declarado como protegido puede ser accedido desde
	 * cualquier clase en el mismo paquete o desde cualquier subclase (incluso
	 * si la subclase está en un paquete diferente).
	 * 
	 * private: Un miembro declarado como privado solo puede ser accedido desde
	 * la misma clase. No se puede acceder a un miembro privado desde una clase
	 * diferente.
	 * 
	 * default (también conocido como "amistoso" o "package-private"): Un
	 * miembro sin especificador de acceso (es decir, no se especifica public,
	 * protected o private) se considera como "default". Un miembro con acceso
	 * predeterminado solo puede ser accedido desde clases en el mismo paquete.
	 * 
	 * En resumen, la diferencia entre los modificadores de acceso en Java es el
	 * alcance de la visibilidad que se otorga a un miembro de la clase. El
	 * modificador "public" proporciona el mayor alcance de visibilidad,
	 * mientras que el modificador "private" proporciona el menor.
	 */
	
	private int edad;
	private String nombre;
	
	//constructores de la clase--------------------
	public Modificadores(int edad,String nombre){
		this.edad=edad;
		this.nombre=nombre;
	}
	
	public Modificadores(){
		
	}
	//-----------------------------------------------
	
	
	//metodos 
	public void describir(){
		saludar();
		System.out.println("El alumno "+nombre+" tiene "+edad+" años.");
		despedir();
	}
	

	//por defecto
	void hablar() {
		System.out.println("Hola, bla bla bla.");
	}

	// publico
	public void saludar() {
		System.out.println("\nsaludos!");
	}

	// private(accesible solo en esata clase)
	private void despedir() {
		System.out.println("chau.");
	}

	// protected
	protected void comer() {
		System.out.println("estoy comiendo.");
	}

}
