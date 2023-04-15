package poo.ejc9;

import poo.interfaces.Estudiante;

/*
 * Las operaciones de almacen son:
		 * calcular precio de todas las bebidas
		 * Agregar producto
		 * Eliminar un producto
		 * Mostrar informacion
 */

public class Almacen {

	// creando matriz
	private Bebida matrizEstanteria[][];

	// constructor para inicializar la matriz a una cantidad de filas y columnas
	// ingresada por parametro
	public Almacen(int filas, int columnas) {
		matrizEstanteria = new Bebida[filas][columnas];
	}

	// metodo constructor que inicializa la matriz a 5 x 5
	public Almacen() {
		matrizEstanteria = new Bebida[5][5];
	}

	// creamos el metodo para agregar la Bebida
	public void agregarBebida(Bebida bebida) {
		boolean encontrado = false;

		// bucle para llenar la matriz: recorriendo las filas
		for (int i = 0; i < matrizEstanteria.length && !encontrado; i++) {
			// recorriendo las columnas
			for (int j = 0; j < matrizEstanteria[0].length && !encontrado; j++) {
				if (matrizEstanteria[i][j] == null) {// si la matriz en esa
														// posicion esta vacia
					matrizEstanteria[i][j] = bebida;// agregar la bebida
					encontrado = true;// salgo del bucle
				}
			}
		}

		// si encontrado es true:
		if (encontrado) {
			System.out.println("\nBebida añadida");
		} else {
			System.out.println("\nNo se ha podido añadir la bebida");
		}
	}

	// Calcular el precio de las bebidas
	public double calcularPrecioBebidas() {
		double precioTotal = 0;

		// recorriendo la matriz
		for (int i = 0; i < matrizEstanteria.length; i++) {
			for (int j = 0; j < matrizEstanteria[0].length; j++) {
				if (matrizEstanteria[i][j] != null) {// si no esta vacio
					precioTotal += matrizEstanteria[i][j].getPrecio();// precio
				}
			}
		}
		return precioTotal;
	}

	//
	// Mostrar Bebidas
	public void mostrarBebidas() {
		// recorrer la matriz
		for (int i = 0; i < matrizEstanteria.length; i++) {
			for (int j = 0; j < matrizEstanteria[0].length; j++) {
				if (matrizEstanteria[i][j] != null) {// si no esta vacio
					System.out.println(
							"\nFila : " + i + " - Columna : " + j + "\nBebida : " + matrizEstanteria[i][j].toString());
				}
			}
		}
	}

	//
	// metodo para Eliminar una Bebida
	public void eliminarBebida(int id) {
		boolean encontrado = false;
		// bucle para llenar la matriz: recorriendo las filas
		for (int i = 0; i < matrizEstanteria.length && !encontrado; i++) {
			// recorriendo las columnas
			for (int j = 0; j < matrizEstanteria[0].length && !encontrado; j++) {
				if (matrizEstanteria[i][j] != null) {// si la matriz en esa
														// posicion NO esta vacia
					if (matrizEstanteria[i][j].getId() == id) {
						matrizEstanteria[i][j] = null;// elimino la bebida
						encontrado = true;// salgo del bucle
					}
				}
			}
		}

		// si encontrado es true:
		if (encontrado) {
			System.out.println("\nBebida eliminada");
		} else {
			System.out.println("\nNo se ha podido eliminar la bebida");
		}
	}

}
