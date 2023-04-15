package poo.ejc10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);

		// arreglo
		Electrodomestico listaElectrodomesticos[] = new Electrodomestico[3];

		int opcion;

		// recorriendo el arreglo para registrar los electrodomesticos,
		// televisor o lavadora
		for (int i = 0; i < listaElectrodomesticos.length;) {
			System.out.println("\n\tMENU DE OPCIONES");
			System.out.println("1. Agregar electrodomestico ");
			System.out.println("2. Agregar lavadora ");
			System.out.println("3. Agregar televisor ");
			System.out.println("4. Salir ");

			System.out.print("Digite una opcion : ");
			opcion = sc.nextInt();

			switch (opcion) {
			// 1. Agregar electrodomestico
			case 1:
				// variables
				String color;
				char consumoEnergetico;
				double precioBase, peso;

				// pedir datos
				System.out.print("\nDigite un color para el electrodomestico : ");
				color = sc.next();
				System.out.print("Digite el consumo energetico: ");
				consumoEnergetico = sc.next().charAt(0);
				System.out.print("Digite precio base : ");
				precioBase = sc.nextDouble();
				System.out.print("Digite el peso : ");
				peso = sc.nextDouble();

				listaElectrodomesticos[i] = new Electrodomestico(color, consumoEnergetico, precioBase, peso);
				System.out.println("\nElectrodomestico agregado!");
				i++;

				break;

			// agregar lavadora
			case 2:
				// variables
				String colorLavadora;
				char consumoEnergeticoLavadora;
				double precioBaseLavadora, pesoLavadora;
				int cargaLavadora;

				// pedir datos
				System.out.print("\nDigite un color para la lavadora : ");
				colorLavadora = sc.next();
				System.out.print("Digite el consumo energetico: ");
				consumoEnergeticoLavadora = sc.next().charAt(0);
				System.out.print("Digite precio base : ");
				precioBaseLavadora = sc.nextDouble();
				System.out.print("Digite el peso : ");
				pesoLavadora = sc.nextDouble();
				System.out.print("Digite la carga : ");
				cargaLavadora = sc.nextInt();

				listaElectrodomesticos[i] = new Lavadora(colorLavadora, consumoEnergeticoLavadora, precioBaseLavadora,
						pesoLavadora, cargaLavadora);

				System.out.println("\nLavadora agregada!");
				i++;

				break;

			//// agregar Televisor
			case 3:
				// variables
				String colorTelevisor;
				char consumoEnergeticoTelevisor;
				double precioBaseTelevisor, pesoTelevisor;
				int resolucionTelevisor;
				boolean sincronizadorTelevisor;

				// pedir datos
				System.out.print("\nDigite un color para el televisor : ");
				colorTelevisor = sc.next();
				System.out.print("Digite el consumo energetico: ");
				consumoEnergeticoTelevisor = sc.next().charAt(0);
				System.out.print("Digite precio base : ");
				precioBaseTelevisor = sc.nextDouble();
				System.out.print("Digite el peso : ");
				pesoTelevisor = sc.nextDouble();
				System.out.print("Digite la resolucion : ");
				resolucionTelevisor = sc.nextInt();
				System.out.print("Digite el sincronizador TDT(true o false) : ");
				sincronizadorTelevisor = sc.nextBoolean();

				listaElectrodomesticos[i] = new Television(colorTelevisor, consumoEnergeticoTelevisor,
						precioBaseTelevisor, pesoTelevisor, resolucionTelevisor, sincronizadorTelevisor);
				System.out.println("\nTelevisor añadido!");
				i++;
				break;
			case 4:
				System.out.println("Gracias por participar!");
				System.exit(0);
				break;
			default:
				System.out.println("opcion no disponible, vuelva a intentar");
				break;
			}
		}

		// calculamos la suma de todos los electrodomesticos
		double sumaElectrodomesticos = 0;
		double sumaTelevisores = 0;
		double sumaLavadoras = 0;

		// recorremos los electrodomesticos
		for (int j = 0; j < listaElectrodomesticos.length; j++) {
			// si listaElectrodomesticos[j] es una instancia de la clase
			// Electrodomestico
			if (listaElectrodomesticos[j] instanceof Electrodomestico) {
				sumaElectrodomesticos += listaElectrodomesticos[j].obtenerPrecioFinal();
			}
			if (listaElectrodomesticos[j] instanceof Television) {
				sumaTelevisores += listaElectrodomesticos[j].obtenerPrecioFinal();
			}
			if (listaElectrodomesticos[j] instanceof Lavadora) {
				sumaLavadoras += listaElectrodomesticos[j].obtenerPrecioFinal();
			}
		}

		// mostramos las sumas...
		System.out.println("\nLa suma del precio de electrodomesticos es : " + sumaElectrodomesticos);
		System.out.println("\nLa suma del precio de las lavadoras es : " + sumaLavadoras);
		System.out.println("\nLa suma del precio de los televisores es : " + sumaTelevisores);

	}

}
