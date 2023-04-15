package poo.ejc9;

//SUBCLASE
public class BebidaAzucarada extends Bebida {

	// ATRIBUTOS
	private double porcentajeAzucar;
	private boolean promocion;

	// CONSTRUCTOR
	public BebidaAzucarada(double cantidadLitros, double precio, String marca, double porcentaje, boolean promocion) {
		super(cantidadLitros, precio, marca);
		this.porcentajeAzucar = porcentaje;
		this.promocion = promocion;
	}

	// GETTER Y SETTERS
	public double getPorcentaje() {
		return porcentajeAzucar;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentajeAzucar = porcentaje;
	}

	public boolean isPromocion() {
		return promocion;
	}

	public void setPromocion(boolean promocion) {
		this.promocion = promocion;
	}

	// SOBRE ESCRIBIENDO EL METODO getPrecio DE LA CLASE PADRE BEBIDA
	@Override
	public double getPrecio() {
		//
		if (isPromocion()) {
			return super.getPrecio() * 0.9;// vamos a realizar un descuento del
											// 10%
		} else {
			return super.getPrecio();
		}
	}

	// SOBRE ESCRIBIENDO EL METODO ToString DE LA CLASE PADRE BEBIDA
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "\n" + "Porcentaje Azucar  : " + porcentajeAzucar + "\nPromocion : " + promocion;
	}
}
