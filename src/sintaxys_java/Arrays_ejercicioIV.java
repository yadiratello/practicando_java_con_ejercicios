package sintaxys_java;

import java.util.Scanner;

public class Arrays_ejercicioIV {

	public static void main(String[] args) {
		//programa que muestra los elementos de mi arreglo duplicados
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de elementos para el arreglo:");		
		int elementos = sc.nextInt();
		
		//creando arreglo de x elementos
		int arreglo[] = new int[elementos];
		
		
		System.out.println("Ingrese los "+(arreglo.length)+" elementos:");
		for(int i=0;i<arreglo.length;i++){
			arreglo[i]= sc.nextInt();	
		}
		
		System.out.println("Numeros del arreglo duplicados:");
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]*2);
			
		}
		
	}

}
