package sintaxys_java;

import java.util.Scanner;

public class ArraysI {

	public static void main(String[] args) {
		// arreglo de 8 elementos
		String miArray []= new String[8];

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Ingrese 8 nombres:");
		
		for(int i=0;i<8;i++){
			miArray[i] = sc.nextLine();			
		}
		
		for(int i =0;i<miArray.length;i++){
			System.out.println(i+1+". "+miArray[i]);			
		}
	}

}
