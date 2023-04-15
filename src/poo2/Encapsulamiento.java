package poo2;

public class Encapsulamiento {

	/*
	 * El encapsulamiento ayuda a garantizar la integridad de los datos y el
	 * comportamiento del objeto, ya que los cambios en la implementaci�n
	 * interna del objeto no afectan la interfaz p�blica proporcionada por los
	 * m�todos de acceso. Tambi�n permite que los objetos interact�en de manera
	 * m�s segura y controlada, lo que hace que el c�digo sea m�s f�cil de
	 * entender y mantener.
	 * 
	 * En Java, esto se logra mediante la declaraci�n de variables de instancia
	 * privadas y proporcionando m�todos de acceso p�blicos (tambi�n conocidos
	 * como getters y setters) para leer y modificar los valores de estas
	 * variables. Los m�todos de acceso permiten que los objetos externos
	 * obtengan y establezcan los valores de las variables de instancia de un
	 * objeto sin acceder directamente a ellas.
	 */
	// variables privadas
	private int edad;
	private String nombre;
	private double altura;
	private String PUERTO = "3000";// constante

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	// metodos Setters(set=establecer) y getters(get=obtener)
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	

}
