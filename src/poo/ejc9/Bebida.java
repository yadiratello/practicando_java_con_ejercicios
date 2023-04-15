package poo.ejc9;

//CLASE PADRE
public class Bebida {
	private static int idActual = 1;
	// ATRIBUTOS
	private int id;
	private double cantidadLitros;
	private double precio;
	private String marca;

	// CONSTRUCTOR
	public Bebida(double cantidadLitros, double precio, String marca) {
		//super();
		this.id = idActual++;
		this.cantidadLitros = cantidadLitros;
		this.precio = precio;
		this.marca = marca;
	}

	//METODOS GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCantidadLitros() {
		return cantidadLitros;
	}

	public void setCantidadLitros(double cantidadLitros) {
		this.cantidadLitros = cantidadLitros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "\nID = " + id + "\nCantidadLitros = " + cantidadLitros + "\nPrecio = " + precio + "\nMarca=" + marca;
	}

}
