package sintaxys_java;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
		//solicitar al usuario que ingrese un numero
		int num;
		String dia;
		
		System.out.println("Ingrese un dia de la semana(1-7):");
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		//evaluar el numero ingresado
		switch(num){
		
		case 1:
			dia="Lunes";
			break;
		case 2:
			dia="Martes";
			break;
		case 3:
			dia="Miercoles";
			break;
		case 4:
			dia="Jueves";
			break;
		case 5:
			dia="Viernes";
			break;
		case 6:
			dia="Sabado";
			break;
		case 7:
			dia="Domingo";
			break;
			default:
				dia="El numero ingresado es incorrecto";
			
		}
		//mostramos
		System.out.println(dia);
		
		//cerramos el objeto scanner
		sc.close();
		
	}

}
