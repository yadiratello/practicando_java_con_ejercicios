package poo.ejc8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * los empleado se definen por tener nombre, edad y salario tambien
		 * tendremos una constante llamada PLUS, que tendrá un valor de 300
		 * soles, tenemos dos tipos de empleados: Repartidor y comercial.
		 * 
		 * El comercial aparte de los atributos anteriores, tiene uno mas
		 * llamado comision(double). El repartidor aparte de los atrib de
		 * empleado, tiene otro llamado zona(String) En comercial, si tiene mas
		 * de 30 años y cobra una comision de mas de 200 soles, se le aplicara
		 * el plus. En repartidor si tiene menos de 25 y reparte en "Lima" este
		 * recibira el plus.
		 */

		Scanner teclado = new Scanner(System.in);

		// creando objetos de tipo Comercial y Repartidor
		Comercial comercial;
		Repartidor repartidor;
		int opcion;// opcion

		do {
			System.out.println("\n\tPLUS DE EMPLEADOS");
			System.out.println("1. PLUS de comercial" + "\n2. Plus de repartidor" + "\n3. Salir");
			System.out.println("Seleccione una opcion : ");
			opcion = teclado.nextInt();

			switch (opcion) {
			// PLUS de Comercial
			case 1:
				// pedir nombre, edad, salario y su comision
				String nombreComercial;
				double salarioComercial, comisionComercial;
				int edadComercial;

				System.out.println("\nDigite el nombre del comercial : ");
				nombreComercial = teclado.next();
				System.out.println("\nDigite el salario del comercial : ");
				salarioComercial = teclado.nextDouble();
				System.out.println("\nDigite la comisión del comercial : ");
				comisionComercial = teclado.nextDouble();
				System.out.println("\nDigite la edad del comercial : ");
				edadComercial = teclado.nextInt();

				// creando objeto con los datos ingresados
				comercial = new Comercial(comisionComercial, nombreComercial, edadComercial, salarioComercial);

				// imprimir la comision
				System.out.println(comercial.toString());

				// llamar al metodo PLUS
				comercial.plus();
				break;

			// PLUS de Repartidor
			case 2:
				// pedir nombre, edad, salario y su zona
				String nombreRepartidor, zona;
				double salarioRepartidor;
				int edadRepartidor;

				System.out.println("\nDigite el nombre del Repartidor : ");
				nombreRepartidor = teclado.next();
				System.out.println("\nDigite el salario del Repartidor : ");
				salarioRepartidor = teclado.nextDouble();
				System.out.println("\nDigite la edad del Repartidor : ");
				edadRepartidor = teclado.nextInt();
				System.out.println("\nDigite la zona del Repartidor : ");
				zona = teclado.next();
				
				// creando objeto con los datos ingresados
				repartidor = new Repartidor(zona, nombreRepartidor, edadRepartidor, salarioRepartidor);
				// imprimir la comision
				System.out.println(repartidor.toString());
				// llamar al metodo PLUS
				repartidor.plus();
				break;
				
			case 3:
				System.out.println("\nGracias por participar.");
				opcion=3;
				break;
			default:
				System.out.println("\nOpcion no disponible.");
				break;
			}

		} while (opcion != 3);

	}

}
