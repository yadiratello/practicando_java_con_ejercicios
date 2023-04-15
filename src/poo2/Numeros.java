package poo2;

public class Numeros {

	// metodo con return para calcular el mayor de 3 numeros
	public int calcularNumeroMayor(int n1, int n2, int n3) {

		int mayor = 0;

		if (n1 > n2 && n1 > n3) {
			mayor = n1;
		} else if (n2 > n1 && n2 > n3) {
			mayor = n2;
		} else if (n3 > n1 && n3 > n2) {
			mayor = n3;
		}

		return mayor;
	}

	// metodo con return para calcular el menor de 3 numeros
	public int calcularNumeroMenor(int n1, int n2, int n3) {

		int menor = 0;

		if (n1 < n2 && n1 < n3) {
			menor = n1;
		} else if (n2 < n1 && n2 < n3) {
			menor = n2;
		} else if (n3 < n1 && n3 < n2) {
			menor = n3;
		}

		return menor;
	}
}
