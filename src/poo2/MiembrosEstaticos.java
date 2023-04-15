package poo2;

public class MiembrosEstaticos {
	
	
	
	private int edad;
	private final static String nombre="Pepe";
	private final static int id=123456789;
	public static int varEstatica;
	
	
	//para acceder a los atributos de clase dentro de una clase estatica los atributos tmb tienen que ser estaticos
	public static void saludar(){
		System.out.println("Hola mundo");
		System.out.println("Mi nombre es "+nombre);
		//System.out.println("Mi edad es "+edad);
		System.out.println("Mi id es "+id);
	}
	
	//metodo estatico
	public static void hablar(){
		System.out.println("estoy hablando");
	}

}
