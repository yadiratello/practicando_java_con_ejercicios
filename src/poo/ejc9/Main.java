package poo.ejc9;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * En un almacen se guardan un conjunto, estos productos son bebidas
		 * como agua mineral y bebidas azucaradas(coca cola, fanta, etc). De los
		 * productos nos interesa saber su identificador(cada uno tiene uno
		 * distinto), cantidad de litros, precio y marca. Si es agua mineral nos
		 * interesa saber tmb el origen(manatial tal sitio o donde sea). Si es
		 * una bebida azucarada queremos saber el porcentaje q tiene de azucar y
		 * si tiene o no alguna promocion(si la tiene tendra un descuento de 10%
		 * en el precio). En el almacen iremos almacenado estas bebidas por
		 * estatentrias(q son las columnas de la matriz).
		 * 
		 * Las operaciones de almacen son: calcular precio de todas las bebidas
		 * Agregar producto Eliminar un producto Mostrar informacion
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		int opcion;

		Bebida bebida;
		Almacen almacen = new Almacen();

		do {
			System.out.println("\n\tMENÚ DE OPCIONES");
			System.out.println("1. Agregar Bebida" + "\n2. Eliminar bebida" + "\n3. Mostrar bebidas"
					+ "\n4. Calcular el precio de las bebidas" + "\n5. Salir");
			System.out.print("\nDigite una opción:");
			opcion = sc.nextInt();

			switch (opcion) {
			// 1. Agregar Bebida
			case 1:
				// ------------ Creando bebida Azucarada --------------
				// creando variables
				double porcentajeAzucar, precioAzucar, cantidadLitrosAzucar;
				boolean promocionAzucar;
				String marcaAzucar;

				System.out.print("\nDigite el porcentaje del azucar: ");
				porcentajeAzucar = sc.nextDouble();
				System.out.print("Digite la promocion del azucar(true o false) : ");
				promocionAzucar = sc.nextBoolean();
				System.out.print("Digite la cantidad del azucar: ");
				cantidadLitrosAzucar = sc.nextDouble();
				System.out.print("Digite el precio del azucar: ");
				precioAzucar = sc.nextDouble();
				System.out.print("Digite la marca del azucar: ");
				marcaAzucar = sc.next();

				// creando la bebida
				bebida = new BebidaAzucarada(cantidadLitrosAzucar, precioAzucar, marcaAzucar, porcentajeAzucar, promocionAzucar);
				almacen.agregarBebida(bebida);

				// ---------------------- FIN ---------------------------

				// ---------------- Creando bebida AguaMineral ------------

				double precioMineral, cantidadLitrosMineral;
				String marcaMineral, manantial;

				System.out.print("\nDigite la cantidad del Mineral: ");
				cantidadLitrosMineral = sc.nextDouble();
				System.out.print("Digite el precio del Mineral: ");
				precioMineral = sc.nextDouble();
				System.out.print("Digite la marca del Mineral: ");
				marcaMineral = sc.next();
				System.out.print("Digite el manantial del Mineral: ");
				manantial = sc.next();

				bebida = new AguaMineral(cantidadLitrosMineral, precioMineral, marcaMineral, manantial);
				almacen.agregarBebida(bebida);

				break;

			// 2. Eliminar bebida
			case 2:
				System.out.print("\nDigite el ID de la bebida a eliminar : ");
				int id = sc.nextInt();

				almacen.eliminarBebida(id);

				break;

			// 3. Mostrar bebidas
			case 3:
				almacen.mostrarBebidas();
				break;
			//
			case 4:
				System.out.println("\nEl precio total de las bebidas es : " + almacen.calcularPrecioBebidas());
				break;
			case 5:
				System.out.println("Gracias por participar!");
				opcion = 5;
				break;
			default:
				System.out.println("Opcion no disponible. Gracias por participar.");
				break;
			}
		} while (opcion != 5);

	}

}
