package poo.polimorfismo;

public class Main {

	public static void main(String[] args) {
		
		//clasePadre  nombreObjeto = new ClaseHija(parametros..);
		
		//creando objetos
		Animal perro = new Perro("pelusa", 3, 30); 
		perro.realizarSonido();
		
		
		Animal gato = new Gato("Kitty", 2,40);
		gato.realizarSonido();
		
		Animal loro = new Loro("Roberto", 1, 11);
		loro.realizarSonido();
		
	}

}
