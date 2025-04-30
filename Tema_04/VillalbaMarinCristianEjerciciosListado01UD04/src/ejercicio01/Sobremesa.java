package ejercicio01;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	public Sobremesa(int capacidadDisco, double frecuenciaProc, double precioBase, String marca, double precioMontaje) {
		super(capacidadDisco, frecuenciaProc, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	@Override
	public String toString() {
		return super.toString() + "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}
	
	public double calcularPVP(double porc) {
		return super.calcularPVP(porc)+precioMontaje;
	}
}
