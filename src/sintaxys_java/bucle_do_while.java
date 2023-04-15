package sintaxys_java;

import java.util.Scanner;

public class bucle_do_while {

	public static void main(String[] args) {
		// programa que pide un numero del 1 al 10 
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Ingrese un numero del 1 al 10:");
		
		do{
			num = sc.nextInt();
			if (num >= 1 && num <= 10) {
		        System.out.println("N�mero v�lido");
		      } else {
		        System.out.println("N�mero inv�lido. Por favor ingrese un n�mero entre 1 y 10.");
		      }
			
		}while(num>=1 && num <=10);
		
		System.out.println("Ha ingresado un n�mero fuera del rango de 1 a 10. El programa ha finalizado.");
	}

}
