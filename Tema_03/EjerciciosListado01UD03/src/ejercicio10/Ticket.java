package ejercicio10;

public class Ticket {

	private double precio;

	public Ticket(double precio) {
		super();
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ticket [precio=" + precio + "]";
	}
	
	
	
}
