package poo2;

public class EjecutarSobrecarga {

	public static void main(String[] args) {
		Sobrecarga obj2 = new Sobrecarga(120,"Juan");

		int res = obj2.calcular();
		int edad = obj2.calcular(2023, 1996);
		System.out.println(res);
		System.out.println(edad);
	}

}
