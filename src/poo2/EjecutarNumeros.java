package poo2;


public class EjecutarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creando objeto de tipo Numeros
		Numeros calculo1 = new Numeros();
		
		int c1 = calculo1.calcularNumeroMayor(2, 113, 114);
		int c2 = calculo1.calcularNumeroMenor(1, 0, -10);
		System.out.println("El mayor es: "+c1);
		System.out.println("El menor es: "+c2);
	}

}
