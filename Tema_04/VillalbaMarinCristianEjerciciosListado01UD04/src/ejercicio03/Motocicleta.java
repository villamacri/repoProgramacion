package ejercicio03;

public class Motocicleta extends Vehiculo{

	private int cilindrada;

	public Motocicleta(double impuesto, String categoriaEmision, int cilindrada) {
		super(impuesto, categoriaEmision);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return super.toString()+"Motocicleta [cilindrada=" + cilindrada + "]";
	}

	@Override
	public double calcularImpuesto() {
		return super.calcularImpuesto()+(cilindrada*60/100);
	}
	
	
}
