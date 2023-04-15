
package sintaxys_java;

//imports
import java.util.Scanner;

public class ClaseScanner {

	public static void main(String[] args) {
		
		// crear obj de tipo scanner para la entrada y salida de datos por la consola 
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce nombre:");
        
        String nombre=entrada.nextLine();
        
        System.out.println("Ingrese edad:");
        
        int edad = entrada.nextInt();
        
        System.out.println("ingrese sueldo:");
        
        double sueldo = entrada.nextDouble();
        
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(sueldo);
		
	}

}
