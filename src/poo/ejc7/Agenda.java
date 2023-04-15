package poo.ejc7;

public class Agenda {

	// ATRIBUTOS
	private Contacto contactos[];

	// CONSTRUCTOR
	// constructor que inicializa a 10 el tamaño del arreglo contactos
	public Agenda() {
		contactos = new Contacto[10];
	}

	// CONSTRUCTOR
	// constructor con parametro que establece el tamaño pasado por parametro
	// como tamaño del arreglo contactos
	public Agenda(int tamaño) {
		contactos = new Contacto[tamaño];
	}

	// -------------------------------------------------------------
	// METODO para AÑADIR CONTACTOS A LA AGENDA
	public void añadirContacto(Contacto contacto) {
		// verificar si el contacto ya existe
		if (comprobarSiExisteContacto(contacto)) {
			System.out.println("\nYa existe un contacto con ese nombre, por favor digite otro nombre");
		} else if (comprobarSiLaAgendaEstaLlena()) {
			System.out.println("\nLa agenda está llena");
		} else {
			boolean registrado = false;
			// recorrer el array
			for (int i = 0; i < contactos.length && !registrado; i++) {
				// si el contacto en la posicion i esta nula guardar el contacto
				// pasado por parametro
				if (contactos[i] == null) {
					contactos[i] = contacto;
					registrado = true;
				}
			}
			if (registrado == true) {
				System.out.println("\nEl contacto se ha registrado con exito!");
			} else {
				System.out.println("\nNo se ha podido registrar el contacto");
			}
		}

	}

	// COMPROBAR SI EXISTE EL CONTACTO
	public boolean comprobarSiExisteContacto(Contacto contacto) {
		// recorrer el arreglo de contactos
		for (int i = 0; i < contactos.length; i++) {
			// si se encontro el contatco
			if (contactos[i] != null && contactos[i].equals(contacto)) {
				return true;
			}
		}
		return false;
	}

	// Creamos el metodo para comprobar si la egenda esta llena
	public boolean comprobarSiLaAgendaEstaLlena() {
		// recorrer el arreglo de contactos
		for (int i = 0; i < contactos.length; i++) {
			// si el contacto en la posicion i esta nulla o vacia
			if (contactos[i] == null) {
				return false;
			}
		}
		return true;// retorna true si la agenda esta llena
	}

	// Creamos el metodo para LISTAR LOS CONTACTOS
	public void listarContactos() {
		if (comprobarSiHayHuecosLibres() == contactos.length) {
			System.out.println("\nNo hay contactos par listar");
		} else {
			for (int i = 0; i < contactos.length; i++) {
				if (contactos[i] != null) {
					System.out.println("Nombre : " + contactos[i].getNombre());
					System.out.println("Telefono : " + contactos[i].getTelefono()+"\n");
				}
			}
		}
	}

	// Comprobar si Hay espacios libres en el arreglo
	public int comprobarSiHayHuecosLibres() {
		int contadorVacios = 0;
		// verificar en el arreglo si hay posiciones vacias
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i] == null) {
				contadorVacios++;
			}
		}
		return contadorVacios;
	}

	// creamos metodo para BUSCAR UN CONTACTO POR NOMBRE
	public void buscarContactoPorNombre(String nombre) {
		boolean encontrado = false;
		// recorrer el array de contactos
		for (int i = 0; i < contactos.length && !encontrado; i++) {
			// si se encontro el contacto con ese nombre
			if (contactos[i] != null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())) {
				System.out.println("\nContacto encontrado, su telefono es " + contactos[i].getTelefono());
				encontrado = true;
			}
		}

		// (!encontrado) = encontrado ==false
		if (encontrado == false) {
			System.out.println("\nNo se ha encontrado el contacto");
		}
	}

	// creamos el metodo para ELIMINAR CONTACTO
	public void eliminarContacto(Contacto contacto) {
		boolean eliminado = false;
		// recorrer el array
		for (int i = 0; i < contactos.length && eliminado == false; i++) {
			// si el contacto en la posicion i es igual al pasado por parametro,
			// eliminarlo(null)
			if (contactos[i] != null && contactos[i].equals(contacto)) {
				contactos[i] = null;
				eliminado = true;
			}
		}
		if (eliminado) {
			System.out.println("\nEl contacto se ha eliminado!");
		} else {
			System.out.println("\nEl contacto NO se ha eliminado!");
		}
	}

}
