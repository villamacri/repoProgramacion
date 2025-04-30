package ejercicio03;

public class Coche extends Vehiculo{

	private int potencia;

	public Coche(double impuesto, String categoriaEmision, int potencia) {
		super(impuesto, categoriaEmision);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return super.toString()+"Coche [potencia=" + potencia + "]";
	}

	@Override
	public double calcularImpuesto() {
		// TODO Auto-generated method stub
		return super.calcularImpuesto()+(potencia*25/100);
	}
	
}
