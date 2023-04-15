package sintaxys_java;

import java.util.Scanner;

public class ciclo_while {

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero del 1 al 50:");
		
		int numero = sc.nextInt();
		int contador = 1;
		
		
		while(contador<=numero){
			System.out.println(contador);
			contador++;
		}
		
		System.out.println("programa finalizado.");

	}

}
