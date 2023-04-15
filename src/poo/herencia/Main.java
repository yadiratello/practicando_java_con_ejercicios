package poo.herencia;

public class Main {

	public static void main(String[] args) {
		// creando objeto de tipo Nutria y le inicializamos sus datos
		Nutria nutria = new Nutria("Carla", 1, 10);
		// llamando a los metodos de la clase
		nutria.comer();
		nutria.mostrarDatos();
		nutria.nadar();
		System.out.println();

		// objeto de tipo Perro
		Perro perro = new Perro("Pelusa", 2, 3, "rubio", "ricocan y mimaskot");
		perro.comer();
		perro.mostrarDatos();
		perro.ladrar();
		System.out.println();
		
		
		
		//Objeto de tipo gato
		Gato gato1 = new Gato("Kitty", 3, 1);
		
		String comidas[] = {"galletas","sopa","huesos"};
		Gato gato2 = new Gato("Tomás",4, 6, comidas);
		
		
		gato1.comer();
		gato1.mostrarDatos();
		gato1.maullar();
		System.out.println();
		
		
		gato2.comer();
		gato2.mostrarDatos();
		gato2.maullar();
		System.out.println();
		
	}

}
