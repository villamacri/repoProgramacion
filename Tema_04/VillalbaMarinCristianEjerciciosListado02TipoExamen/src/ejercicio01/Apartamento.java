package ejercicio01;

public class Apartamento extends Habitacion{

	private boolean contratoServ;

	public Apartamento(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			boolean contratoServ) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes);
		this.contratoServ = contratoServ;
	}

	public boolean isContratoServ() {
		return contratoServ;
	}

	public void setContratoServ(boolean contratoServ) {
		this.contratoServ = contratoServ;
	}

	@Override
	public String toString() {
		return super.toString()+"Apartamento [contratoServ=" + contratoServ + "]";
	}

	@Override
	public double calcularPrecioHab(double desc, double precioServ) {
		// TODO Auto-generated method stub
		double precioFin=super.calcularPrecioHab(desc, precioServ);
		
		if(contratoServ) {
			precioFin=super.calcularPrecioHab(desc, precioServ)+precioServ;
		}
		return precioFin;
	}
	
	
	
}
