package Archivos;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		/*
		 * la clase File se utiliza para trabajar con archivos y directorios en
		 * el sistema de archivos. La clase File es parte de la biblioteca
		 * estándar de Java y se encuentra en el paquete java.io.
		 */

		// le pasamos la ruta absoluta:
		File archivo = new File("C:\\YADIRA\\CURSO JAVA\\curso_java_2023\\proyectos_java\\src\\Archivos\\ruta\\prueba.txt");
		
		
		//mostrando datos del archivo
		System.out.println("Nombre del archivo : "+archivo.getName());
		System.out.println("Ruta del archivo : "+archivo.getPath());
		System.out.println("¿Existe el archivo? : "+archivo.exists());
		System.out.println("¿Se puede escribir en el archivo? : "+archivo.canWrite());

		
		
		//tambien se puede crear un directorio
		//File archivo = new File("directorio");
		
		try {
			if(archivo.createNewFile()){
				System.out.println("El archico ha sido creado con exito!");
			}else{
				System.out.println("Ya existe el archivo - ocurrio un error");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
