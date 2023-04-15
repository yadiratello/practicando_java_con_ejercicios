package sintaxys_java;

import java.util.Scanner;

public class Array_ejercicioIII {

	public static void main(String[] args) {
		
		//programa que pide al usuario que ingrese una cantidad de elementos y al final imprima la suma de todos los elementos del arreglo
		
		Scanner sc = new Scanner(System.in);
		int suma=0;
		
		// pedir al usuario que ingrese la cant de elementos que tendra mi array
		System.out.println("Ingrese la cantidad de elementos para el array:");
		int numElem = sc.nextInt();
		
		//defino mi arrreglo
		int arreglo[] = new int [numElem];
		
		System.out.println("Ingrese los numeros:");
		
		//bucle para almacenar cada uno de los elementos en el array
		for(int i =0;i<arreglo.length;i++){
			arreglo[i] = sc.nextInt();
			suma+=arreglo[i];//sumando los elementos del array
		}
		System.out.println("La suma de todos los elementos es: "+suma);
		
		
		
		
		//mostrando los elementos del arreglo
		System.out.println("Listando los elementos del array con for-each:");
        for (int numero : arreglo) {
            System.out.println(numero);
        }
		
		
		
	}

}
