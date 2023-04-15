package metodos;

import com.sun.media.sound.ModelStandardTransform;

public class metodos {

	public static void main(String[] args) {
		//creando instancia de clase metodos para poder acceder a sus metodos
		metodos obj = new metodos();
		
		//llamando al metodo statico
		mostrarMensaje();
		
		//llamando al metodo void
		obj.mostrarMensaje2();
	}
	
	
	
	
	
	
	//creando metodo estatico(no necesita instancia de clase)
	static void mostrarMensaje(){
		System.out.println("hola");
	}

	//metodo normal(necesita instancia)
	void mostrarMensaje2(){
		System.out.println("hola");
	}

}
