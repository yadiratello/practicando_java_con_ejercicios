package sintaxys_java;

import java.util.Scanner;

public class Arrays_ejercicioV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//definiendo el arreglo
		int arreglo[] = new int[5];
		int sumPositivos=0, sumNegativos=0, promedio, positivos=0,negativos=0; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ingrese los 5 numeros:");
		
		//recorro el arreglo e ingreso los 5 elementos y valido
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = sc.nextInt();
			//valido los positivos y negativos
			if(arreglo[i]>0){
				sumPositivos = sumPositivos+arreglo[i];
				positivos++;
			}
			else if(arreglo[i]<0){
				sumNegativos += arreglo[i];
				negativos++;
			}
		}
		
		
		System.out.println("la cantidad de numeros positivos es: "+positivos);
		System.out.println("la cantidad de numeros negativos es: "+negativos);
		
		System.out.println("la suma de numeros positivos es: "+sumPositivos);
		System.out.println("la suma de numeros negativos es: "+sumNegativos);
		
		System.out.println("El promedio de numeros positivos es: "+sumPositivos/5);
		System.out.println("El promedio de numeros positivos es: "+sumNegativos/5);
		
	}

}
