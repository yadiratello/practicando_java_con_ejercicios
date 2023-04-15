package poo.ejc9;

public class AguaMineral extends Bebida{

	private String manantial;

	public AguaMineral(double cantidadLitros, double precio, String marca, String manantial) {
		super(cantidadLitros, precio, marca);
		this.manantial = manantial;
	}

	public String getManantial() {
		return manantial;
	}

	public void setManantial(String manantial) {
		this.manantial = manantial;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nManantial = " + manantial;
	}
	
	
}
