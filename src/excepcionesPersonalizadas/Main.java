package excepcionesPersonalizadas;

public class Main {

	public static void main(String[] args) {
		//
		int resultado=0;

		try {
			resultado = Division.dividir(10, 0); 
			
		} catch (OperacionAritmetica e) {
			// TODO: handle exception
			e.printStackTrace(System.out);
		}finally{
			System.out.println("fin del programa");
		}
		
		
		System.out.println(resultado);
		
	}

}
