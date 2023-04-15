package poo.ejc10;

public class Lavadora extends Electrodomestico {

	// ATRIBUTOS
	private int carga;

	public Lavadora(String color, char consumoEnergetico, double precioBase, double peso, int carga) {
		super(color, consumoEnergetico, precioBase, peso);
		// TODO Auto-generated constructor stub
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	//
	@Override
	public double obtenerPrecioFinal() {
		// TODO Auto-generated method stub
		double plus = super.obtenerPrecioFinal();
		if (this.carga > 30) {
			plus += 50;
		}
		return plus;
	}

}
