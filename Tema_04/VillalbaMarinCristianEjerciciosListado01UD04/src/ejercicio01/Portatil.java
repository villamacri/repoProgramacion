package ejercicio01;

public class Portatil extends Ordenador{

	private boolean seguroPant;
	private double precioSeguro;
	
	public Portatil(int capacidadDisco, double frecuenciaProc, double precioBase, String marca, boolean seguroPant,
			double precioSeguro) {
		super(capacidadDisco, frecuenciaProc, precioBase, marca);
		this.seguroPant = seguroPant;
		this.precioSeguro = precioSeguro;
	}

	public boolean isSeguroPant() {
		return seguroPant;
	}

	public void setSeguroPant(boolean seguroPant) {
		this.seguroPant = seguroPant;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	@Override
	public String toString() {
		return super.toString() + "Portatil [seguroPant=" + seguroPant + ", precioSeguro=" + precioSeguro + "]";
	}
	
	public double calcularPVP(double porc) {
		double pvp=0;
		if(seguroPant) {
			pvp=super.calcularPVP(porc)+precioSeguro;
		}else {
			pvp=super.calcularPVP(porc);
		}
		return pvp;
	}
}
