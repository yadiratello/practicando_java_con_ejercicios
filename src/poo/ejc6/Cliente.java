package poo.ejc6;

public class Cliente {
	//un cliente tendra muchas cuentas
	
	//ATRIBUTOS
	private String nombre;
	private String apellido;
	private String dni;
	Cuenta arregloCuenta[];//array de clase Cuenta
	
	
	//CONSTRUCTOR
	public Cliente(String nombre, String apellido, String dni, Cuenta[] arregloCuenta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.arregloCuenta = arregloCuenta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	//CONSULTAR SALDO DE LA CUENTA X 
	public double consultarSaldoActual(int nroCuenta){
		return arregloCuenta[nroCuenta].getSaldo();
	}
	
	
	//INGRESAR DINERO
	public void ingresarDinero(int nroCuenta, double cantidad){
		arregloCuenta[nroCuenta].depositarDinero(cantidad);
	}
	
	
	//RETIRAR DINERO
	public void retirarDinero(int indice, double cantidad){
		arregloCuenta[indice].retirarDinero(cantidad);
	}

}
