package poo.ejc7;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Nos piden hacer una agenda telefonica de contactos. Un contacto esta
		 * definido por un nombre y un telefono(No es necesario de validar) Un
		 * contacto es igual a otro cuando sus nombres son iguales. Una agenda
		 * de contactos esta formada por un conjunto de contactos(Piensa en q
		 * tipo puede ser) Se podra crear de 2 formas, indicandoles nosotros el
		 * tamaño o con un tamaño por defecto(10)
		 */

		Scanner sc = new Scanner(System.in);

		int opcion, telefono;
		String nombre;
		Contacto contacto;
		int tamanoAgenda;

		// pedir que se ingrese el tamaño para la agenda
		tamanoAgenda = Integer
				.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de contactos para su agenda : "));

		Agenda agendaTelefonica = new Agenda(tamanoAgenda);

		// bucle do..while
		do {
			System.out.println("\n\tBIENVENIDO A MI AGENDA DE CONTACTOS");
			System.out.println("1. Añadir Contacto");
			System.out.println("2. Listar Contactos");
			System.out.println("3. Buscar Contacto");
			System.out.println("4. Comprobar si existe el Contacto");
			System.out.println("5. Eliminar Contacto");
			System.out.println("6. Comprobar Contactos disponibles");
			System.out.println("7. Comprobar si la Agenda está llena");
			System.out.println("8. Salir");

			System.out.print("Digite una opcion por favor : \n");
			opcion = sc.nextInt();

			// switch opcion
			switch (opcion) {
			// Agregamos un contacto
			case 1:
				System.out.print("\nDigite su nombre : ");
				nombre = sc.next();
				System.out.print("Digite su telefono : ");
				telefono = sc.nextInt();

				contacto = new Contacto(nombre, telefono);
				agendaTelefonica.añadirContacto(contacto);
				break;

			// Listar Contactos
			case 2:
				agendaTelefonica.listarContactos();
				break;
				
			// Buscar Contacto
			case 3:
				System.out.println("\nDigite el nombre del contacto a buscar : ");
				nombre=sc.next();
				
				agendaTelefonica.buscarContactoPorNombre(nombre);
				break;
				
			// 4. Comprobar si existe el Contacto
			case 4:
				System.out.println("\nDigite el nombre del contacto a buscar : ");
				nombre=sc.next();
				
				contacto = new Contacto(nombre);
				
				if(agendaTelefonica.comprobarSiExisteContacto(contacto)){
					System.out.println("El contacto SI existe!");
				}else{
					System.out.println("El contacto No existe!");
				}
				
				break;
				
			// 5. Eliminar Contacto
			case 5:
				System.out.println("\nDigite el nombre del contacto a eliminar : ");
				nombre=sc.next();
				
				contacto = new Contacto(nombre);
				
				agendaTelefonica.eliminarContacto(contacto);				
				break;
				
			// 6. Comprobar Contactos disponibles
			case 6:
				System.out.println("\nHay "+agendaTelefonica.comprobarSiHayHuecosLibres()+" espacios libres.");
				break;
				
			// 7. Comprobar si la Agenda está llena
			case 7:
				if(agendaTelefonica.comprobarSiLaAgendaEstaLlena()){
					System.out.println("La agenda está llena\n");
				}else{
					System.out.println("Aún puedes registrar contactos.\n");
				}
				break;
				
			// 8. Salir
			case 8:
				System.out.println("\nGracias por participar!");
				opcion = 8;
				break;
			default:
				System.out.println("\nOpcion NO valida, por favor vuelva a digitar otra opcion");
				break;
			}

		} while (opcion != 8);

	}

}
