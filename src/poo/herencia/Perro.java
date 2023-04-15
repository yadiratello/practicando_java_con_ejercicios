package poo.herencia;

public class Perro extends Animal{
	//atributos
	private String colorPelo;
	private String tipoComida = "galletas";

	//incializando los atributos de la clase padre
	public Perro(String nombre, int id, int edad) {
		super(nombre, id, edad);
		// TODO Auto-generated constructor stub
	}

	//constructor de esta clase hija
	public Perro(String nombre, int id, int edad, String colorPelo, String tipoComida) {
		super(nombre, id, edad);
		this.colorPelo = colorPelo;
		this.tipoComida = tipoComida;
	}

	//sobreescribiendo el metodo comer de la clase padre(Animal)
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		//super.comer();
		System.out.println("El perro está comiendo "+tipoComida);
	}
	
	@Override
	public void mostrarDatos() {
		// TODO Auto-generated method stub
		super.mostrarDatos();
		System.out.println("El color de su pelo es "+colorPelo);
	}
	
	//metodo de esta clase hija
	public void ladrar(){
		System.out.println("El perro está ladrando");
	}
}
