package poo.ejc10;

//clase Padre
public class Electrodomestico {

	// CONSTANTES CON VALORES POR DEFECTO
	// Asignamos valores por defecto
	protected final static String COLOR_DEFECTO = "blanco";// Constante
	protected final static char CONSUMO_ENERGETICO_DEFECTO = 'F';
	protected final static double PRECIO_BASE_DEFECTO = 100;
	protected final static double PESO_DEFECTO = 5;

	// ATRIBUTOS DE ESTA CLASE
	protected String color;
	protected char consumoEnergetico;
	protected double precioBase;
	protected double peso;

	// CREAMOS EL METODO PARA COMPROBAR QUE EL COLOR INGRESADO SEA IGUAL A UNO
	// DE LA LISTA
	private void comprobarColor(String color) {
		String colores[] = { "blanco", "azul", "negro", "gris" };
		boolean encontrado = false;

		for (int i = 0; i < colores.length; i++) {
			if (colores[i].equals(color)) {
				encontrado = true;
			}
		}
		// si el color si existe en la lista
		if (encontrado) {
			this.color = color;// establecer el color
		} else {
			this.color = COLOR_DEFECTO;// establecer el color por defecto
		}
	}

	// METODO PARA COMPROBAR SI EXISTE EL CONSUMO ENERGETICO
	public final void comprobarConsumoEnergetico(char consumoEnergetico) {
		if (consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
	}

	// METODO PARA ONTENER EL PRECIO FINAL
	public double obtenerPrecioFinal() {
		double plus = 0;

		//dando un plus de acuerdo al consumo energetico
		switch (consumoEnergetico) {
		case 'A':
			plus += 100;
			break;
		case 'B':
			plus += 80;
			break;
		case 'C':
			plus += 60;
			break;
		case 'D':
			plus += 50;
			break;
		case 'E':
			plus += 30;
			break;
		case 'F':
			plus += 10;
			break;
		default:
			break;
		}
		
		//agregar un plus de acuerdo al peso
		if(peso >=0 && peso <=19){
			plus +=10;
		}else if(peso >=20 && peso <=49){
			plus +=50;
		}else if(peso >=50 && peso <=79){
			plus +=80;
		}else if(peso >=80 ){
			plus +=100;
		}
		
		return precioBase+plus;
	}

	// GETTERS Y SETTERS

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	// CONSTRUCTOR
	public Electrodomestico(String color, char consumoEnergetico, double precioBase, double peso) {
		super();
		//this.color = color;
		//this.consumoEnergetico = consumoEnergetico;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		this.precioBase = precioBase;
		this.peso = peso;
	}

	

	// METODO TOSTRING
}
