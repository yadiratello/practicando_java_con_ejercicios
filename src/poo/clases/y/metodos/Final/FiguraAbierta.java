package poo.clases.y.metodos.Final;

//esta clase heredara de la clase Figura
public class FiguraAbierta extends Figura{

	public FiguraAbierta(double tamano) {
		super(tamano);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public void dibujar() {
		System.out.println("Dibujando figura abierta del tamaño : "+tamano);
	}
	
	@Override
	public void pintar() {
		System.out.println("Dibujando figura abierta del tamaño : "+tamano);
	}
}
