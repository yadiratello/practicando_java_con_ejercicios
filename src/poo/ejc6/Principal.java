package poo.ejc6;

import java.util.Scanner;

public class Principal {

	// METODO PARA BUSCAR EL NRO DE CUENTA
	public static int buscarNumeroCuenta(Cuenta cuentas[], int nroCuentaABuscar) {
		// variables
		int indice = 0, iterador = 0;
		boolean nroCuentaEncontrada = false;

		// iterar para buscar el nro de cuenta
		while ((iterador < cuentas.length) && (nroCuentaEncontrada == false)) {
			if (cuentas[iterador].getNumeroCuenta() == nroCuentaABuscar) {// si
																			// se
																			// encontro
																			// la
																			// cuenta
				nroCuentaEncontrada = true;
				indice = iterador;
			}
			iterador++;
		}

		if (nroCuentaEncontrada == false) {
			indice -= 1;
		}
		return indice;
	}

	public static void main(String[] args) {
		/*
		 * crear un programa para realizar gestiones de un banco oara lo cual
		 * tendremos 2 clases(Cliente y Cuenta). Considere q un cliente se
		 * caracteriza por nombre, apellido y DNI. El cliente puede consultar
		 * saldo, asi como ingresar y retirar dinero de sus cuentas. Ademas cada
		 * cuenta se caracteriza por un numero de cuenta y saldo.
		 */

		Scanner sc = new Scanner(System.in);

		// VARIABLES
		String nombre, apellido, dni;
		Cuenta cuenta[];
		Cliente cliente;
		int nroCuenta, cantCuentas, opcion, indiceNroCuenta;
		double saldo, cantidadDinero;

		// Pedimos los datos del cliente
		System.out.print("Digite el nombre del cliente: ");
		nombre = sc.next();

		System.out.print("Digite el apellido del cliente: ");
		apellido = sc.next();

		System.out.print("Digite el DNI del cliente: ");
		dni = sc.next();

		System.out.print("\nAhora digite la cantidad de cuentas del cliente: ");
		cantCuentas = sc.nextInt();

		cuenta = new Cuenta[cantCuentas];// definiendo el tamaño del array de
											// cuentas

		// rellenamos las cuentas
		for (int i = 0; i < cuenta.length; i++) {
			System.out.println("ingrese el numero de cuenta " + (i + 1) + " : ");
			nroCuenta = sc.nextInt();

			System.out.println("Digite el saldo de la cuenta: ");
			saldo = sc.nextDouble();

			cuenta[i] = new Cuenta(nroCuenta, saldo);
		}

		// creando un objeto de tipo cliente
		cliente = new Cliente(nombre, apellido, dni, cuenta);

		// MENU DE OPCIONES
		do {

			System.out.println("\n\tMENU");
			System.out.println("1. Ingresar saldo de la cuenta.");
			System.out.println("2. Retirar saldo a la cuenta");
			System.out.println("3. Consultar saldo de la cuenta");
			System.out.println("4. Salir");
			System.out.print("Digite una opcion: ");
			opcion = sc.nextInt();

			// switch de las opciones
			switch (opcion) {
			case 1:
				System.out.print("\nDigite el nro de cuenta: ");
				nroCuenta = sc.nextInt();

				indiceNroCuenta = buscarNumeroCuenta(cuenta, nroCuenta);

				if (indiceNroCuenta == -1) {
					System.out.println("\nCuenta no encontrada, verifique su numero de cuenta\n");
				} else {
					System.out.println("Digite la cantidad de dinero a depositar");
					cantidadDinero = sc.nextDouble();

					cliente.ingresarDinero(indiceNroCuenta, cantidadDinero);
					System.out.println("\nDeposito con exito!");
					System.out.println("Saldo disponible: " + cliente.consultarSaldoActual(indiceNroCuenta));
				}
				break;
			case 2:
				System.out.print("\nDigite el nro de cuenta: ");
				nroCuenta = sc.nextInt();

				indiceNroCuenta = buscarNumeroCuenta(cuenta, nroCuenta);

				if (indiceNroCuenta == -1) {
					System.out.println("No existe la cuenta ingresada\n");
				} else {
					// hacer las transacciones
					System.out.print("Digite la cantidad a retirar: ");
					cantidadDinero = sc.nextDouble();

					if (cliente.consultarSaldoActual(indiceNroCuenta) < cantidadDinero) {
						System.out.println("Saldo Insuficiente!");
					}else{
						cliente.retirarDinero(indiceNroCuenta, cantidadDinero);
						System.out.println("Retiro con exito!");
						System.out.println("Saldo disponible de la cuenta: "+cliente.consultarSaldoActual(indiceNroCuenta));
					}
				}

				break;
			case 3:
				System.out.print("\nDigite el nro de cuenta: ");
				nroCuenta = sc.nextInt();

				indiceNroCuenta = buscarNumeroCuenta(cuenta, nroCuenta);

				if (indiceNroCuenta == -1) {
					System.out.println("No existe la cuenta ingresada\n");
				} else {
					System.out.println("Saldo disponible: "+cliente.consultarSaldoActual(indiceNroCuenta));
				}
				break;
			case 4:
				System.out.println("\nGracias por participar");
				opcion = 4;
				break;
			default:
				System.out.println("\nOpcion no disponible, vuelve a digitar");
				break;
			}

		} while (opcion != 4);

	}

}
