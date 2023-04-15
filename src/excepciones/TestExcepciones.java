package excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExcepciones {

	public static void main(String[] args) {
		/*
		 * En Java, se utiliza el bloque try-catch para manejar las excepciones.
		 * El bloque try contiene el código que puede producir una excepción,
		 * mientras que el bloque catch contiene el código que maneja la
		 * excepción si se produce. Si se produce una excepción dentro del
		 * bloque try, el control se transfiere al bloque catch correspondiente.
		 * 
		 * Por ejemplo, si un programa intenta abrir un archivo que no existe,
		 * se producirá una excepción de "FileNotFoundException". Para manejar
		 * esta excepción, podemos utilizar un bloque try-catch:
		 * 
		 */

		// dividir un numero entre 0
		int num1 = 10;
		int num2 = 0;

		Scanner teclado = new Scanner(System.in);
		int valor;

		try {
			System.out.println("ingrese un valor : ");
			valor = teclado.nextInt();

			System.out.println("el valor es : " + valor);

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("usted ha ingresado un tipo diferente al esperado " + e.getMessage());
			System.err.println(e);
			e.printStackTrace(System.out);
		} finally {
			// esto se ejecuta finalmente
			System.out.println("cerramos el programa y listo");
		}

		//ArithmeticException
		int x = 5;
		int y = 0;
		try {
			int z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("Error: división por cero");
		}

		//archivo no existe
		try {
			FileReader file = new FileReader("archivo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		}

		/*
		 * También es posible utilizar un bloque finally en conjunto con el
		 * bloque try-catch. El bloque finally se ejecuta siempre,
		 * independientemente de si se produjo una excepción o no. Esto es útil
		 * para realizar acciones de limpieza, como cerrar archivos o conexiones
		 * de red.
		 */
		FileReader file = null;
		try {
			file = new FileReader("archivo.txt");
			// Realizar operaciones en el archivo
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} finally {
			if (file != null) {
				try {
					file.close();
				} catch (IOException e) {
					System.out.println("No se pudo cerrar el archivo");
				}
			}
		}

	}

}
