package poo2;

public class Sobrecarga {

	//sobrecarga de constructores
	public Sobrecarga(int edad){
		System.out.println("Tienes "+edad+" años.");
	}
	
	public Sobrecarga(int km, String nombre){
		System.out.println("La persona "+nombre+" corre "+km+" km.");
	}
	
	
	//sobrecarga de otros metodos
	public int calcular(int fActual,int fNaci){
		int edad = fActual-fNaci;
		return edad;
	}
	
	public int calcular(){
		return 1+1;
	}
	
	
	
	public void saludar(){
		System.out.println("hola mundo");
	}
	
	public void saludar(String nombre){
		System.out.println("Hola, mi nombre es "+nombre);
	}
}


