package bucles;

import javax.swing.JOptionPane;

public class ejc32 {

	public static void main(String[] args) {
		/* crear una app que te pida un numero, si el numero es negativo
		 * terminar el bucle y mostrar la suma de todos los num ingresados 
		 */
		int num,suma =0;
		
		//ejecutar este bucle mientras el numero sea mayor o igual que 0
		do{
			num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero:"));			
			
			if(num<0){
				System.out.println("El numero ingresado es negativo. Fin del programa.");
				break;			
			}
			
			suma += num;
			
			//System.out.println(num);
			
		}while(num>=0);
		
		System.out.println("La suma es: "+suma);
		
		
		
	}
	

}
