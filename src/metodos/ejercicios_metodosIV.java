package metodos;

import javax.swing.JOptionPane;

public class ejercicios_metodosIV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calificaciones cali = new Calificaciones();
		
		cali.pideCalificaciones();
		
		cali.mostrarCalificaciones();
	}

}


//clase
class Calificaciones{
	
	double calificaciones[]=new double[5];
	
	//metodos
	void pideCalificaciones(){
		
		for (int i = 0; i < calificaciones.length; i++) {
			calificaciones[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion "+(i+1)));
		}
	}
	
	void mostrarCalificaciones(){
		for (int i = 0; i < calificaciones.length; i++) {
			System.out.println("Calificacion "+(i+1)+" :"+calificaciones[i]);
		}
	}
	
}
