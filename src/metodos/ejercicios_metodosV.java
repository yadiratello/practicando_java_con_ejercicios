package metodos;

public class ejercicios_metodosV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado emp = new Empleado();
		
		emp.dameNombre("yadira");
		emp.dameEdad(12);
		emp.dameSueldo(1245.4);
	}

}

class Empleado{
	
	//metodos con parametros
	public void dameNombre(String nom){
		System.out.println("El nombre es : "+nom);
	}
	
	
	public void dameEdad(int edad){
		System.out.println("La edad es: "+edad);
	}
	
	public void dameSueldo(double sueldo){
		System.out.println("El sueldo es: "+sueldo);
	}
}
