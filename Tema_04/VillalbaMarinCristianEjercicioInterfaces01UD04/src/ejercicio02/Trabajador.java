package ejercicio02;

public class Trabajador implements IImpuestoTrab{

	private double porcIrpf;
	
	public Trabajador(double porcIrpf) {
		super();
		this.porcIrpf = porcIrpf;
	}

	public double getPorcIrpf() {
		return porcIrpf;
	}

	public void setPorcIrpf(double porcIrpf) {
		this.porcIrpf = porcIrpf;
	}

	@Override
	public String toString() {
		return "Trabajador [porcIrpf=" + porcIrpf + "]";
	}

	@Override
	public double calculoIrpf(double sueldo) {
		// TODO Auto-generated method stub
		double cien=100;
		
		return sueldo*(porcIrpf/cien);
	}

}
