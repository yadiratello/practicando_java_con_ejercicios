package bucles;

import javax.swing.JOptionPane;

public class ejc31 {

	public static void main(String[] args) {
		// indicar si un numero es primo o no
		/*Un número es primo si solo es divisible entre 1 y sí mismo. Es decir, si un número tiene únicamente dos divisores distintos, 1 y el propio número, entonces es primo.*/
		int contador=0;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));
		
		
		for (int i = 1; i <= num; i++) {
			if(num % i == 0){
				contador++;
			}
		}
		
		if (contador==2)
			System.out.println("es primo");
		else
			System.out.println("No es primo");

	}

}
