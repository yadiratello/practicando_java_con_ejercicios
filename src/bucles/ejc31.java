package bucles;

import javax.swing.JOptionPane;

public class ejc31 {

	public static void main(String[] args) {
		// indicar si un numero es primo o no
		/*Un n�mero es primo si solo es divisible entre 1 y s� mismo. Es decir, si un n�mero tiene �nicamente dos divisores distintos, 1 y el propio n�mero, entonces es primo.*/
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
