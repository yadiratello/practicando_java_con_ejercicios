package Archivos_texto;

import java.io.File;
import java.io.IOException;

public class ArchivosTexto {

	File archivo;

	// METODOS
	private void crearArchivoDeTexto() {
		// creando archivo
		archivo = new File("archvo.txt");

		try {
			if (archivo.createNewFile()) {
				System.out.println("archivo cteado con exito");
			} else {
				System.out.println("error al crear archivo");
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}
	}

	private void eliminarArchivoDeTexto() {
		if (archivo.delete()) {
			System.out.println("archivo eliminado con exito");
		} else {
			System.out.println("error al eliminar el archivo");
		}
	}
	
	
	
	public static void main(String[] args) {
		ArchivosTexto archivoTexto = new ArchivosTexto();
		archivoTexto
	}
}
