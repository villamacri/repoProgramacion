package ejercicio01;

public class Ordenador {

	private int capacidadDisco;
	private double frecuenciaProc;
	private double precioBase;
	private String marca;

	public Ordenador(int capacidadDisco, double frecuenciaProc, double precioBase, String marca) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuenciaProc = frecuenciaProc;
		this.precioBase = precioBase;
		this.marca = marca;
	}

	public int getCapacidadDisco() {
		return capacidadDisco;
	}

	public void setCapacidadDisco(int capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}

	public double getFrecuenciaProc() {
		return frecuenciaProc;
	}

	public void setFrecuenciaProc(int frecuenciaProc) {
		this.frecuenciaProc = frecuenciaProc;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuenciaProc=" + frecuenciaProc + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}
	
	public double calcularPVP(double porc) {
		return precioBase+=precioBase*(porc/100);
	}
}
