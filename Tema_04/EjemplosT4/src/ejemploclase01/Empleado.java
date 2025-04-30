package ejemploclase01;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuestos;
	
	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);//Esto indica que se heredan atributos de la clase madre
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	@Override
	public String toString() {
		return super.toString()+"Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	public double calcularPaga() {
		return sueldo-impuestos;
	}

}
