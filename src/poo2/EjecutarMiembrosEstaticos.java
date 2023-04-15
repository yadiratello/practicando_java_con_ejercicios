package poo2;

public class EjecutarMiembrosEstaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MiembrosEstaticos.saludar();
		
		//llamando a mi metodo statico
		MiembrosEstaticos.hablar();
		
		//variable estatica
		MiembrosEstaticos.varEstatica=123;
		
		System.out.println(MiembrosEstaticos.varEstatica);
	}

}
