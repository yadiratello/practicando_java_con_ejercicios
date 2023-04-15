package bucles;

import javax.swing.JOptionPane;

public class ejc23 {

	public static void main(String[] args) {
		/*
		 * crear un cajero automatico q tenga los sgtes opciones 1.depositar
		 * 2.retirar 3.consultar 4.salir Tener en cuenta q podras ingresar las
		 * opciones siempre y cuando la contra sea correcta
		 */

		// variables
		String contrasena;
		int opcion, saldoInicial = 1000, deposito = 0, retiro = 0, numIntentos = 0;
		boolean salir = false, contraCorrecta = false;

		do {
			contrasena = JOptionPane.showInputDialog("Ingrese su contrase�a:");

			if (contrasena.equals("123")) {
				// realizar las transacciones

				while (!salir) {// mientras salir sea igual a true(bucle
								// infinito)
					JOptionPane.showMessageDialog(null, "BIENVENIDO A SU CAJERO AUTOMATICO");
					opcion = Integer.parseInt(JOptionPane.showInputDialog(
							"Ingrese una opcion:\n1. Depositar.\n2. Retirar\n3. Consultar Saldo\n4. Salir"));

					switch (opcion) {
					case 1:
						// DEPOSITO
						deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a depositar:"));

						JOptionPane.showMessageDialog(null, "Se hizo el deposito de " + deposito + " soles.");
						saldoInicial += deposito;

						break;
					case 2:
						// RETIRO
						retiro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese monto a retirar:"));
						if (retiro <= saldoInicial) {
							JOptionPane.showMessageDialog(null, "Se hizo el retiro de: " + retiro + " soles.");
							saldoInicial -= retiro;
						} else {
							JOptionPane.showMessageDialog(null,
									"Su saldo actual es menor al monto a retirar\nSaldo actual: " + saldoInicial);
						}
						break;
					case 3:
						// CONSULTAR SALDO
						JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldoInicial);
						break;
					case 4:
						// SALIR
						System.out.println("Gracias por utilizar el cajero autom�tico.");
						salir = true;
						contraCorrecta = true;
						break;
					default:
						System.out.println("Opci�n inv�lida.");
						break;
					}
				}

			} else {
				//
				JOptionPane.showMessageDialog(null, "La contrase�a es Incorrecta");
				numIntentos++;
			}

			// si intento ingresar mas de 3 veces la contra no lo permita
			if (numIntentos == 3) {
				JOptionPane.showMessageDialog(null, "Usted super� el numero de intentos permitidos");
				break;
			}

		} while (contraCorrecta == false);
	}

}
