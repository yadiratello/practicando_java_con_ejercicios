package bucles;

import javax.swing.JOptionPane;

public class ejc30 {

	public static void main(String[] args) {
		/* crear una app que dado a 2 numeros sumarlos y
		 * mostrar la suma, si la suma es mayor a 100 que se termine el 
		 * bucle, caso contrario que siga.  
		 */

		int num1,num2, suma=0, condicion=1;
		
		//bucle
		do{
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero:"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero:"));
			
			//suma
			suma = num1 + num2;
			
			
		}while(suma<=100);
		
		
		System.out.println("la suma es mayor a 100. Fin del bucle."+suma);
		
	}

}
