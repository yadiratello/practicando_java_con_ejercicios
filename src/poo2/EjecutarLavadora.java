package poo2;

public class EjecutarLavadora {

	public static void main(String[] args) {

		// creamos el objeto
		Lavadora miLavadora = new Lavadora();

		String color = miLavadora.color = "rojo";
		String modelo = miLavadora.modelo = "LG x14";
		int numserie = miLavadora.numeroSerie = 1000001;
		float precio = miLavadora.precio = 1800.99f;
		
		Lavadora lavadora2 = new Lavadora();
		
		String color2 = lavadora2.color = "plomo";
		String modelo2 = lavadora2.modelo = "LG x15";
		int numserie2 = lavadora2.numeroSerie = 1000002;
		float precio2 = lavadora2.precio = 2800.09f;

		// imprimiendo
		System.out.println("Lavadora 1:\nColor: " + color + "\nModelo: " + modelo + "\nPrecio: " + precio + "\nNum de Serie: "+numserie);
		System.out.println("\nLavadora 2 :\nColor: " + color2 + "\nModelo: " + modelo2 + "\nPrecio: " + precio2 + "\nNum de Serie: "+numserie2);

	}

}
