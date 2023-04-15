package poo2;

public class EjecutarModificadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modificadores obj1 = new Modificadores();
		
		obj1.hablar();
		obj1.saludar();
		obj1.comer();
		//obj1.despedir();
		
		obj1.describir();
		
		//objeto 2
		Modificadores obj2 = new Modificadores(15,"Diego");
		
		obj2.describir();
	
	
	}
	

}
