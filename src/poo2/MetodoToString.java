package poo2;

public class MetodoToString {

	//atributos estaticos
	public static int edad;
	public final static String nombre="Juan";
	public static float altura;
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MetodoToString [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	public static void main(String[] args) {
		
		/*
		MetodoToString obj1 = MetodoToString();
		
		System.out.println(obj1.toString());
		*/
		
	}

	
}
