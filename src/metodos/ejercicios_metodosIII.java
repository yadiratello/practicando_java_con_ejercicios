package metodos;

import javax.swing.JOptionPane;

public class ejercicios_metodosIII {

	public static void main(String[] args) {
		//crear obj de tipo Alumno
		
		Alumno alu = new Alumno();
		
		alu.pideDatos();
		
		alu.estadoCalificacion();
		
		alu.mostrarDatos();

	}

}


//clase
class Alumno{
	
	//propiedades
	String nombre;
	double calificacion;
	
	
	//metodos
	public void pideDatos(){

		nombre = JOptionPane.showInputDialog("Ingrese nombre:");
		calificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese calificacion:"));
	
	}
	
	public void estadoCalificacion(){
		if(calificacion>=11){
			JOptionPane.showMessageDialog(null, "Aprobado");
		}else{
			JOptionPane.showMessageDialog(null, "Desaprobado");
		}
	}
	
	public void mostrarDatos(){
		JOptionPane.showMessageDialog(null, "Nombre: "+nombre+"\n"+"Calificacion: "+calificacion);
	}
	
}