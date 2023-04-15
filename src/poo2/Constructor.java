package poo2;

import javax.swing.JOptionPane;

public class Constructor {

	int edad;
	float altura;
	String nombre;
	
	int arreglo[];
	
	
	//constructor sin parametros
	public Constructor(){
		System.out.println("hola desde el metodo constructor sin parametros");
	}
	
	//constructor con parametros para inicializar los atributos de esta clase
	public Constructor(int edad,float altura,String nombre){
		this.edad=edad;
		this.altura=altura;
		this.nombre=nombre;
	}
	
	//constructor con 1 parametros
	public Constructor(int nElementos){	
		//al arreglo le doy un tamaño de n elementos ingresado por parametro
		arreglo = new int[nElementos];
		//rellenando el arreglo
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para la posicion: "+i));
		}
	}
	
	public void imprimirArreglo(){
		System.out.println("El arreglo es:");
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
	
	public void mostrarInfo(){
		System.out.println(this.nombre+" tiene "+this.edad+" y mide "+this.altura+" cm.\n");
	}
}
