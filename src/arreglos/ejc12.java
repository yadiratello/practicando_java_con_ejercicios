package arreglos;

import javax.swing.JOptionPane;

public class ejc12 {

	public static void main(String[] args) {
		/* arreglo de N elementos y dado a ese arreglo separar
		 * los elmentos pares e impares en diferentes arreglos.
		 */
		
		
		int elementos;
		
		elementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo:"));
		
		
		int numeros [] = new int [elementos];
		int cantPares = 0, cantImpares = 0; 
		
		
		
		//llenar el arreglo numeros
		for (int i = 0; i < elementos; i++) {
			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para la posicion "+i));
		
			//verificar la cant de elementos pares e impares
			if(numeros[i] % 2 == 0){
				cantPares++;
			}else {
				cantImpares++;
			}
		}
		
		//crear arreglos para los numeros pares e impares
		int[] numerosPares = new int [cantPares];
		int[] numerosImpares = new int [cantImpares];
		
		//inicializar la cantidades a 0
		cantImpares = 0;
		cantPares = 0;
		
		//llenar el arreglo pares 
		for (int i = 0; i < elementos; i++) {
			if(numeros[i] % 2 == 0){
				numerosPares[cantPares] = numeros[i];
				cantPares++;
			}else{
				numerosImpares[cantImpares] = numeros[i];
				cantImpares++;
			}
		}
		
		//imprimir los arreglos
		System.out.println("NUMEROS PARES");
		for (int i = 0; i < numerosPares.length; i++) {
			System.out.println(numerosPares[i]);
		}

		System.out.println("\nNUMEROS IMPARES");
		for (int i = 0; i < numerosImpares.length; i++) {
			System.out.println(numerosImpares[i]);
		}
	}

}
