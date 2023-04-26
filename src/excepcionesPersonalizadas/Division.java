package excepcionesPersonalizadas;

public class Division {

	/*
	 * En resumen, "throw" se utiliza para lanzar una excepción en el código,
	 * mientras que "throws" se utiliza en la definición del método para indicar
	 * qué excepciones pueden ser lanzadas por ese método.
	 */

	// hay una excepcion de tipo Operacion Aritmetica
	public static int dividir(int numerador, int denominador) throws OperacionAritmetica {
		if (denominador == 0) {
			// throw new ArithmeticException("Excepcion de tipo
			// Aritmetica");//lanzo una nueva excepcion
			throw new OperacionAritmetica("Error al dividir entre cero");
		}
		return numerador / denominador;
	}
	
	

}
