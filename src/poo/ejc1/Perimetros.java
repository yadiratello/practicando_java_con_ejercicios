package poo.ejc1;

public class Perimetros {

	// creamos los metodos para poder calcular los perimetros de la figuras
	// geometricas

	// creamos el metodo para calcular perimetro del cuadrado. Formula(P=4L)
	public float calcularPerimetroCuadrado(float lado) {
		float perimetro = 4 * lado;
		return perimetro;
	}

	// creamos el metodo para calcular perimetro del triangulo. Frml(L+L+L)
	public float calcularPerimetroTriangulo(float lado1, float lado2, float lado3) {
		float perimetro = lado1 + lado2 + lado3;
		return perimetro;
	}

	// creamos el metodo para calcular perimetro del circulo. Frml(P=Diametro *
	// PI)
	public float calcularPerimetroCirculo(float diametro) {

		float perimetro = (float) (diametro * Math.PI);
		return perimetro;
	}

	// creamos el metodo para calcular perimetro del rectangulo.
	// Frml(P=2Base+2Altura)
	public float calcularPerimetroRectangulo(float base, float altura) {
		float perimetro = 2 * (base) + 2 * (altura);
		return perimetro;
	}

}
