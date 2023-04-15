package poo.ejc2;

import java.util.Scanner;


public class Ecuacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Raices raiz;
		
		double a,b,c;
		boolean estado=true;
		String respuesta;
		int contador=0;
		
		for (int i = 0; estado; i++) {
			System.out.println("Digite el valor de a: ");
			a=teclado.nextDouble();
			
			System.out.println("Digite el valor de b: ");
			b=teclado.nextDouble();
			
			System.out.println("Digite el valor de c: ");
			c=teclado.nextDouble();
			
			raiz = new Raices(a,b,c);
			raiz.calcular();
			
			System.out.println("\nDesea continuar? : ");
			respuesta = teclado.next();
			
			if(respuesta.equalsIgnoreCase("si")){
				contador++;
				estado = true;
			}else{
				contador++;
				System.out.println("la cantidad de veces que usted calculo la ecuacion es: "+contador);
				estado=false;
			}
			
		}
		
		
	}
}
