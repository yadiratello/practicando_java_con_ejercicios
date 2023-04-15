package poo2;

import javax.swing.JOptionPane;

public class EjecutarEncapsulamiento {

	public static void main(String[] args) {
		//ODO Auto-generated method stub

		Encapsulamiento obj = new Encapsulamiento();
		
		//ingresando datos
		String nom = JOptionPane.showInputDialog("Ingrese su nombre:");
		int eda = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
		double alt = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su altura:"));

		
		//pasandole datos por sus metodos publicos
		obj.setEdad(eda);
		obj.setNombre(nom);
		obj.setAltura(alt);
		
		//obteniendo el valor de cada variable a traves de sus metodos getters
		System.out.println(obj.getNombre());
		System.out.println(obj.getEdad());
		System.out.println(obj.getAltura());
	}

}
