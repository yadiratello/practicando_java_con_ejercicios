package metodos;

import javax.swing.JOptionPane;

public class ejercicios_metodosVI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas per = new Personas();
		
		String nombre = JOptionPane.showInputDialog("Ingrese nombre:");
		
		per.estableceNombre(nombre);
		
		System.out.println(per.obtenerNombre());
	}

}


class Personas{
	
	String nombre;
	
	
	
	//metodo para pasarle un valor a la variable
	public void estableceNombre(String nom){
		nombre = nom;
	}
	
	
	//metodo para obtener el valor de la variable
	public String obtenerNombre(){
		return nombre;
	}
	
}
