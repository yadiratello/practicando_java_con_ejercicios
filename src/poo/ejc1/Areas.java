package poo.ejc1;

public class Areas {
	// metodos para calcular las areas de las figuras geometricas

	// calcular area del cuadrado. Area = (L*L) o lado al cuadrado
	public float calcularAreaCuadrado(float lado) {
		float area = (float) Math.pow(lado, 2);
		return area;
	}

	// calcular area del circulo. Area = (Pi*radio al cuadrado)
	public float calcularAreaCirculo(float radio) {
		float area = (float) (Math.PI * (Math.pow(radio, 2)));
		return area;
	}

	// calcular area del circulo. Area = ((b*altura)/2)
	public float calcularAreaTriangulo(float base, float altura) {
		float area = base * altura / 2;
		return area;
	}

	// calcular area del circulo. Area = (b*altura)
	public float calcularAreaRectangulo(float base, float altura){
		float area = base * altura;
		return area;
	}
	
}
