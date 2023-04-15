package bucles;

import javax.swing.JOptionPane;

public class ejc25 {

	public static void main(String[] args) {
		
		//ejercicio que adivine un numero aleatorio del 1 al 50 y luego indicar si el num es mayor o menor hasta atinar el numero
		
		int intentos = 0, aleatorio, numero;
		
		//generando numeros del 0 hasta el 50
		aleatorio= (int)(Math.random()*50);
		
		do{
			numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
			
			//si el num ingresado es menor que el aleatorio
			if(numero < aleatorio){
				System.out.println("Ingrese un numero mayor al ingresado.");
			}else if (numero == aleatorio){
				System.out.println("Adivino el numero!");
			}else{
			
				System.out.println("Ingrese un numero menor al ingresado.");
			}
			intentos++;
			
		}while(numero!=aleatorio);
		
		System.out.println("La cantidad de intentos fueron: "+intentos);
		System.out.println("Numero aleatorio: "+aleatorio);
		
	}

}
