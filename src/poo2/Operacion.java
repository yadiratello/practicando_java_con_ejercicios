package poo2;

import javax.swing.JOptionPane;

public class Operacion {

	int primerNumero;
	int segundoNumero;
	int resultado;

	public void mostrarMenu() {
		int opcion = 0;

		// pedir que ingrese una opcion a realizar
		opcion = Integer.parseInt(
				JOptionPane.showInputDialog("Ingrese una opcion a realizar:\n1.Sumar\n2.Restar\n3.Multiplicar"));

		// pedir numeros
		pedirNumero();

		switch (opcion) {
		case 1:
			suma();
			break;
		case 2:
			restar();
			break;
		case 3:
			multiplicar();
			break;
		default:
			System.out.println("Opcion no contemplada");
			break;
		}

	}

	// metodos
	public void suma() {
		resultado = primerNumero + segundoNumero;
		System.out.println("Suma = " + resultado);
	}

	public void restar() {
		resultado = primerNumero - segundoNumero;
		System.out.println("Resta = " + resultado);
	}

	public void multiplicar() {
		resultado = primerNumero * segundoNumero;
		System.out.println("Multiplicacion = " + resultado);
	}

	public void pedirNumero() {
		primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
	}

}
