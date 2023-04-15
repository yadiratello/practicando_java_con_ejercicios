package poo.ejc1;

public class Heron {

	//creamos el metodo para caluclar la ley de Heron. formula = ()
	public float calcularLeyHeron(float a, float b, float c){
		float area = (a+b+c)/2;
		float resultado = (float) Math.sqrt(area*(area-a)*(area-b)*(area-c));
		return resultado;
	}
	
}
