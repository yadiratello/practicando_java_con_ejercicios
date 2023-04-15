package bucles;

import javax.swing.JOptionPane;

public class ejc29 {

	public static void main(String[] args) {
		// calcular el factorial de un numero por ejm: 4(4 x 3 x 2 x 1)
		int factorial=1, resultado = 0;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));	
		
		//hallar el factorial de numero
		for (int i = 1; i <= numero; i++) {
			factorial = factorial * i;
		}
		
		
		System.out.println("el factorial de "+numero+" es: "+factorial);
		
	}

}
