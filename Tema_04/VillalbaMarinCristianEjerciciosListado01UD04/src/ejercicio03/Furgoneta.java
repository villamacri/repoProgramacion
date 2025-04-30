package ejercicio03;

public class Furgoneta extends Vehiculo{

	private double cantFijaTransporte;

	public Furgoneta(double impuesto, String categoriaEmision, double cantFijaTransporte) {
		super(impuesto, categoriaEmision);
		this.cantFijaTransporte = cantFijaTransporte;
	}

	public double getCantFijaTransporte() {
		return cantFijaTransporte;
	}

	public void setCantFijaTransporte(double cantFijaTransporte) {
		this.cantFijaTransporte = cantFijaTransporte;
	}

	@Override
	public String toString() {
		return super.toString()+"Furgoneta [cantFijaTransporte=" + cantFijaTransporte + "]";
	}

	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto()+cantFijaTransporte;
	}
	
	
}
