package poo2;

import javax.swing.JOptionPane;

public class EjecutarConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creando un objeto con mi constructor vacio y mas abajo le paso datos a c/u de sus atributos
		Constructor obj1 = new Constructor();	
		
		obj1.altura=1.80f;
		obj1.edad=23;
		obj1.nombre="Juan";
		obj1.mostrarInfo();//imprimiendo
		
		
		//creando un objeto con mi constructor con parametros y ahi mismo le paso los datos
		Constructor obj2 = new Constructor(15, 1.95f, "Pedro");
		obj2.mostrarInfo();//imprimiendo
		
		
		//creando objeto de mi contructor con 1 parametro
		Constructor obj3 = new Constructor(Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de elementos para el arreglo:")));
		obj3.imprimirArreglo();
	
	}

}
