package sintaxys_java;

import java.util.Scanner;

public class Arrays_ejercicioVI {

	public static void main(String[] args) {
		// llenar arreglo con palabras maximo de 10 letras y mostrarlas en mayusculas
		
		Scanner sc = new Scanner(System.in);
		
		String palabras[] = new String[5];
		
		//pedir al usuario qye ingrese las palabras y meterlo dentro de mi arreglo
		System.out.println("Ingrese 5 palabras distintas:");
		int i=0;
		while (i < palabras.length) {
			
			palabras[i] = sc.nextLine();
			if(palabras[i].length()<=10){
				i++;
			}else{
			System.out.println("Ingrese una palabra de nuevo:");
		}
		}
		
		System.out.println("palabras con minimo de 10 caracteres:");
		for (String word: palabras) {
				System.out.println(word.toUpperCase());
		}
		
		
		
	}

}
