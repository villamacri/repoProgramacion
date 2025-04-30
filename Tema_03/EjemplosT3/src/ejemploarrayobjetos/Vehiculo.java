package ejemploarrayobjetos;

public class Vehiculo {

	private String modelo;
	private double potencia;
	
	public Vehiculo(String modelo, double potencia) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	
	
	
}
