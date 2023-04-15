package bucles;

import javax.swing.JOptionPane;

public class ejc24_Calculadora {
	public static void main(String[] args) {
		//programa calculadora
		//sume,reste,multi y divida y salir 
		
		int numero1, numero2,suma=0,resta=0,multi=0,division=0, opcion;
		
		JOptionPane.showMessageDialog(null, "**PROGRAMA CALCULADORA**");
		do{
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n1. Sumar\n2. Restar\n3. Dividir\n4. Multiplicar\n5. Salir"));
			
			//
			switch (opcion) {
			case 1:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero:"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero:"));
				suma = numero1+numero2;
				JOptionPane.showMessageDialog(null, "La suma es: "+suma);
				break;
			case 2:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero:"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero:"));
				resta = numero1-numero2;
				JOptionPane.showMessageDialog(null, "La resta es: "+resta);
				break;
			case 3:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero:"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero:"));
				division = numero1/numero2;
				JOptionPane.showMessageDialog(null, "La division es: "+division);
				break;
			case 4:
				numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero:"));
				numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero:"));
				multi = numero1+numero2;
				JOptionPane.showMessageDialog(null, "La multiplicacion es: "+multi);
				break;
			case 5:
				System.out.println("Fin del programa...");
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opcion incorrecta");
				break;
			}
			
		}while(opcion != 5);
		
		
		
		
	}
}
