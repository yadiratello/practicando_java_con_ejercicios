package poo.ejc10;

public class Television extends Electrodomestico {

	// ATRIBUTOS
	private int resolucion;
	private boolean sincronizadorTDT;

	// CONSTRUCTOR
	public Television(String color, char consumoEnergetico, double precioBase, double peso, int resolucion,
			boolean sincronizador) {
		super(color, consumoEnergetico, precioBase, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = resolucion;
		this.sincronizadorTDT = sincronizador;
	}

	// sobre escribiendo
	@Override
	public double obtenerPrecioFinal() {
		double plus = super.obtenerPrecioFinal();

		if (this.resolucion > 40) {
			plus = precioBase * 0.3;
		}
		if (sincronizadorTDT) {
			plus += 50;
		}
		return plus;
	}

}
