package ejercicio01;

public class Suite extends Habitacion{

	private double metrosCuad;
	private double dinServicios;
	
	public Suite(double precioBase, boolean ocupada, String nombreCliente, int diasOcupacion, int numOcupantes,
			double metrosCuad, double dinServicios) {
		super(precioBase, ocupada, nombreCliente, diasOcupacion, numOcupantes);
		this.metrosCuad = metrosCuad;
		this.dinServicios = dinServicios;
	}

	public double getMetrosCuad() {
		return metrosCuad;
	}

	public void setMetrosCuad(double metrosCuad) {
		this.metrosCuad = metrosCuad;
	}

	public double getDinServicios() {
		return dinServicios;
	}

	public void setDinServicios(double dinServicios) {
		this.dinServicios = dinServicios;
	}

	@Override
	public String toString() {
		return super.toString()+"Suite [metrosCuad=" + metrosCuad + ", dinServicios=" + dinServicios + "]";
	}

	@Override
	public double calcularPrecioHab(double desc, double precioServ) {
		// TODO Auto-generated method stub
		double cien=100;
		return (super.calcularPrecioHab(desc, precioServ)+dinServicios)-(super.calcularPrecioHab(desc, precioServ)*desc/cien);
	}
	
}
