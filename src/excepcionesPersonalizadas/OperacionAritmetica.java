package excepcionesPersonalizadas;


//Esta clase va a ser utilizada como una excepcion 
public class OperacionAritmetica extends RuntimeException{

	
	
	public OperacionAritmetica(String mensaje){
		super(mensaje);
	}
	
}
