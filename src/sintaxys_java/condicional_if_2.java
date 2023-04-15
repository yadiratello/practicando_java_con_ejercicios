package sintaxys_java;

public class condicional_if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20, c = 30;
		String rspta;
		
		//se tienen que cumplir las 3 coindiciones &&
		rspta = ((a>0 && b<0) && (c>0 && 100>0) && 0>100) ? "if ejecutado" : "else ejecutado";
		
		
		System.out.println(rspta);
	}

}
