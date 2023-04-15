package poo.clases.y.metodos.Final;

//cuando una clase es final no va a poder heredarse, es decir no podra tener hijas
public final class FiguraCerrada extends Figura{

	public FiguraCerrada(double tamano) {
		super(tamano);
		// TODO Auto-generated constructor stub
	}
	
	//sobre escribiendo los metodos de la clase padre(Figura)
	@Override
	public void dibujar() {
		// TODO Auto-generated method stub
		System.out.println("Dibujando figura cerrada del tamaño : "+tamano);
	}
	
	@Override
	public void pintar() {
		System.out.println("Pintando figura cerrada del tamaño : "+tamano);
	}

}
