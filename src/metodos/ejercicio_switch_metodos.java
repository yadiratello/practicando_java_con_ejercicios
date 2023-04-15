package metodos;

import javax.swing.JOptionPane;

public class ejercicio_switch_metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EjerciciosSwitch es = new EjerciciosSwitch();

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese primer numero :"));

		int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese segundo numero :"));

		int opc = Integer.parseInt(JOptionPane.showInputDialog("ingrese una opcion:(\n1.suma\n2.resta\n3multiplicacion\n4division)"));

		// validar la opcion
		switch (opc) {
		case 1:
			es.suma(num1, num2);
			break;
		case 2:
			es.resta(num1, num2);
			break;
		case 3:
			es.multiplicacion(num1, num2);
			break;
		case 4:
			es.division(num1, num2);
			break;
			default:
				JOptionPane.showMessageDialog(null, "opcion invalida");
		}

	}

}

class EjerciciosSwitch {

	// propiedades
	int suma, resta, multiplicacion, division;

	// metodos
	public void suma(int n1, int n2) {
		suma = n1 + n2;
		System.out.println("La suma es: "+suma);
	}

	public void resta(int n1, int n2) {
		resta = n1 - n2;
		System.out.println("La resta es: "+resta);
	}

	public void multiplicacion(int n1, int n2) {
		multiplicacion = n1 * n2;
		System.out.println("La multiplicacion es: "+multiplicacion);
	}

	public void division(int n1, int n2) {
		division = n1 / n2;
		System.out.println("La division es: "+division);
	}

}
