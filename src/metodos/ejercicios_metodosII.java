package metodos;

import java.util.Scanner;

public class ejercicios_metodosII {

	public static void main(String[] args) {
		//obj
		Operaciones ope = new Operaciones();
		
		ope.pideNumeros();
		
		ope.sumaNumeros();
		ope.restaNumeros();
		
		ope.muestraResultados();

	}

}

// clase Operaciones
class Operaciones {
	double num1, num2;
	double suma, resta;

	// metodos
	public void pideNumeros() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese 1er numero :");

		num1 = sc.nextDouble();

		System.out.println("Ingrese 2do numero :");

		num2 = sc.nextDouble();	
	}
	
	
	public void sumaNumeros(){
		suma = num1+num2;
	}

	public void restaNumeros(){
		resta = num1-num2;
	}
	public void muestraResultados(){
		System.out.println("La suma es: "+suma);
		System.out.println("La resta es: "+resta);
	}
}