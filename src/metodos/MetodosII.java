package metodos;

public class MetodosII {

	public static void main(String[] args) {
		// creando objeto de clase MetodosII
		MetodosII obj = new MetodosII();
		
		obj.mostrarNombre("yadira");
		System.out.println(obj.mostrarEdad(10));
		System.out.println("El sueldo es: "+obj.mostrarSueldo(1200.34));
	}
	
	//metodo (void): no retorna nada
	void mostrarNombre(String nombre){
		System.out.println("El nombre es: "+nombre);
	}
	
	
	//metodo que retorna un entero
	int mostrarEdad(int edad){
		return edad;
	}
	
	//mostrar sueldo
	double mostrarSueldo(double sueldo){
		return sueldo;
	}

}
