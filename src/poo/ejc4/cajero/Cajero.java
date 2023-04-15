package poo.ejc4.cajero;

import javax.swing.JOptionPane;

public class Cajero {

	// atributos
	public int saldo = 100000;
	public String contrasena = "holamundo";
	private String cadena;

	// METODO PARA MOSTRAR EL MENU PRINCIPAL
	public void mostrarMenu() {

		int opcion = 0;

		do {
			try {
				cadena = JOptionPane.showInputDialog(
						"1. Consultar Saldo\n" + "2. Depositar\n" + "3. Retirar\n" + "4. Cambiar clave\n" + "5. Salir");

				// validar que la opcion no este vacia ni sea nula
				if (cadena != null || !cadena.equals("")) {

					opcion = Integer.parseInt(cadena);// casteo

					switch (opcion) {
					// 1. consultar saldo
					case 1:
						consultarSaldo();
						break;
					// 2. depositar
					case 2:
						depositar();
						break;
					// 3. retirar
					case 3:
						retirar();
						break;
					// 4. cambiar clave
					case 4:
						cambiarClave();
						break;
					// 5. Salir
					case 5:
						JOptionPane.showMessageDialog(null, "Gracias por utilizar el cajero!");
						opcion=5;
						break;

					default:
						JOptionPane.showMessageDialog(null, "Opción no disponible, vuelva  digitar otra opcion");
						break;
					}
				}

			} catch (NumberFormatException e) {
				// TODO: handle exception
				System.out.println(e);
			}

		} while (opcion != 5);
	}

	// METODO PARA RETIRAR
	public void retirar() {
		String cadena;

		cadena = JOptionPane.showInputDialog("Digite su clave: ");

		// si la cadena es null
		if (cadena == null) {
			// vuelve a la ventana de inicio

		} else if (!cadena.equals("")) {// si la cadena NO esta vacia

			// si la cadena es igual a la contraseña
			if (cadena.equals(contrasena)) {
				// pedir que ingrese un monto a retirar
				cadena = JOptionPane.showInputDialog(
						"a)5.000\n" + "b)10.000\n" + "c)20.000\n" + "d)50.000\n" + "e)100.000\n" + "f)Otra cantidad");
				// validando el monto a retirar
				if (cadena != null) {
					if (!cadena.equals("")) {
						/// haciendo el retiro del saldo actual. La condicion es
						/// que no quede menos de 10 mil soles en mi saldo
						switch (cadena) {
						case "a":
							if ((saldo - 5000) >= 10000) {
								saldo = saldo - 5000;
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							}
							break;
						case "b":
							if ((saldo - 1000) >= 10000) {
								saldo -= 10000;
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							}
							break;
						case "c":
							if ((saldo - 20000) >= 10000) {
								saldo -= 20000;
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							}
							break;
						case "d":
							if ((saldo - 50000) >= 10000) {
								saldo -= 50000;
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							}
							break;
						case "e":
							if ((saldo - 100000) >= 10000) {
								saldo -= 100000;
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							}
							break;
						case "f":
							cadena = JOptionPane.showInputDialog("Digite la cantidad a retirar: ");
							if (cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena)
									&& (saldo - Integer.parseInt(cadena) >= 10000) && (Integer.parseInt(cadena) > 0)) {
								saldo -= Integer.parseInt(cadena);
								JOptionPane.showMessageDialog(null, "Su saldo actual es " + saldo);
							} else if (saldo < Integer.parseInt(cadena)) {
								JOptionPane.showMessageDialog(null,
										"El saldo actual es menor a la cantidad a retirar.");
							}
							break;
						default:
							JOptionPane.showMessageDialog(null, "La opcion no existe, vuelva  digitar!");
							break;
						}
					}
				}
			} else {// SI la CONTRASEÑA no ES correcta
				JOptionPane.showMessageDialog(null, "La contraseña es incorrecta!");
			}
		}

	}

	// METODO PARA DEPOSITAR
	public void depositar() {
		String cadena;
		int deposito = 0;

		cadena = JOptionPane.showInputDialog("Digite el monto a depositar");

		if (cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena)) {
			deposito = Integer.parseInt(cadena);

			if (deposito > 0) {
				saldo += deposito;// incrementar el deposito a mi saldo actual
				JOptionPane.showMessageDialog(null, "El saldo actual es : " + saldo);
			} else {
				JOptionPane.showMessageDialog(null, "Ingrese un monto mayor a 0");
			}
		}

	}

	// METODO PARA CAMBIAR CLAVE
	public void cambiarClave(){
		String claveActual;
		String contrasenaNueva;
		
		claveActual=JOptionPane.showInputDialog("Digite su clave actual:");
		
		//si la clave ingresada es diferente de nulo y es igual a la contraseña
		if(claveActual!=null){
			if(!claveActual.equals("")){
				if(claveActual.equals(contrasena)){
					contrasenaNueva = JOptionPane.showInputDialog("Digite su nueva clave: ");
					
					//validando que no tenga menos de 3 caracteres
					if(contrasenaNueva!=null){
						if(!contrasenaNueva.equals("")){
							if(contrasenaNueva.length()>3){
								claveActual = null;
								claveActual= contrasena;
								JOptionPane.showMessageDialog(null,"Su clave anterior es: "+claveActual);
								JOptionPane.showMessageDialog(null, "Su contraseña nueva es: "+contrasenaNueva);
								contrasena = contrasenaNueva;
							}else{
								JOptionPane.showMessageDialog(null, "Por favor digite una clave que tenga mas de 3 caracteres");
							}
						}
					}
				}
				//si la clave ingresada no es igual a la contraseña 
				else{
					JOptionPane.showMessageDialog(null, "La clave no coincide");
				}
			}
		}
	}

	// METODO PARA CONSULTAR SALDO ACTUAL
	public void consultarSaldo() {
		JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
	}

}
