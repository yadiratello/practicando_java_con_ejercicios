package poo.ejc2;

public class Raices {
	//calcular ecuaciones de segundo grado

	// atributos
	private double a;
	private double b;
	private double c;

	// metodo constructor
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// metodo discriminante para obtener
	private double obtenerDiscriminante() {
		return Math.sqrt(Math.pow(b, 2) - 4 * a * c);
	}

	// metodos
	private void obtenerRaices() {
		double x1 = -b + obtenerDiscriminante() / 2 * a;
		double x2 = -b + obtenerDiscriminante() / 2 * a;

		System.out.println("La solucion (x1) es : " + x1);
		System.out.println("La solucion (x2) es : " + x2);
	}

	private void obtenerRaiz() {
		double solucion = -b / 2 * a;
		System.out.println("La unica solucion es: " + solucion);
	}

	private boolean comprobarSiTieneRaices() {
		return obtenerDiscriminante() > 0;
	}
	
	private boolean comprobarSiTieneRaiz(){
		return obtenerDiscriminante()==0;
	}
	
	
	public void calcular(){
		if(comprobarSiTieneRaices()){
			obtenerRaices();
		}else if(comprobarSiTieneRaiz()){
			obtenerRaiz();
		}else{
			System.out.println("No existe solucion");
		}
	}

}
