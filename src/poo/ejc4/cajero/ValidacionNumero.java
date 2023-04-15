package poo.ejc4.cajero;

public class ValidacionNumero {

	// metodo estatico para convertir una cadena a numero(int)
	
	public static boolean isNum(String cadena) {
		try {
			int numero = Integer.parseInt(cadena);// casting

			return true;

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println(e);
			return false;
		}
	}

}
