package sintaxys_java;

import java.util.Scanner;

public class condicional_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultado="";
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Ingrese un numero:");
		int numero = sc.nextInt();
				
		resultado = (numero%2==0) ? numero+" Es par" : numero+" Es impar";
		
		System.out.println(resultado);
		
	}

}
