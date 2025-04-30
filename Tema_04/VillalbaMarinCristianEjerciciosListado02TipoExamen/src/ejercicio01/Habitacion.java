package ejercicio01;

public class Habitacion {

	private double precioBase;
	private boolean ocupada;
	private String nombreCliente;
	private int diasOcupacion;
	private int numOcupantes;
	
	public Habitacion(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes) {
		super();
		this.precioBase = precioBase;
		this.ocupada = ocupada;
		this.nombreCliente = nombreCliente;
		this.diasOcupacion = diasOcupacion;
		this.numOcupantes = numOcupantes;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasOcupacion() {
		return diasOcupacion;
	}

	public void setDiasOcupacion(int diasOcupacion) {
		this.diasOcupacion = diasOcupacion;
	}

	public int getNumOcupantes() {
		return numOcupantes;
	}

	public void setNumOcupantes(int numOcupantes) {
		this.numOcupantes = numOcupantes;
	}

	@Override
	public String toString() {
		return "Habitacion [precioBase=" + precioBase + ", ocupada=" + ocupada + ", nombreCliente=" + nombreCliente
				+ ", diasOcupacion=" + diasOcupacion + ", numOcupantes=" + numOcupantes + "]";
	}
	
	public double calcularPrecioHab(double desc, double precioServ) {
		return precioBase*diasOcupacion;
	}
	
}
