package poo.ejc6;

public class Cuenta {

	// ATRIBUTOS
	private int numeroCuenta;
	private double saldo;

	// CONSTRUCTOR
	public Cuenta(int numeroCuenta, double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
	//INGRESAR DINERO
	public void depositarDinero(double cantidad){
		saldo += cantidad;
	}

	
	//RETIRAR DINERO
	public void retirarDinero(double cantidad){
		saldo -= cantidad;
	}
	
}
