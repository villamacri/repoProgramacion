package ejercicio_lambdas;

public class Trabajador {

	private int id;
	private String nombre;
	private String apellidos;
	private int aniosEmpresa;
	private double sueldoMensual;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getAniosEmpresa() {
		return aniosEmpresa;
	}
	public void setAniosEmpresa(int aniosEmpresa) {
		this.aniosEmpresa = aniosEmpresa;
	}
	public double getSueldoMensual() {
		return sueldoMensual;
	}
	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	@Override
	public String toString() {
		return "Trabajador [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", aniosEmpresa="
				+ aniosEmpresa + ", sueldoMensual=" + sueldoMensual + "]";
	}
	public Trabajador(int id, String nombre, String apellidos, int aniosEmpresa, double sueldoMensual) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.aniosEmpresa = aniosEmpresa;
		this.sueldoMensual = sueldoMensual;
	}

	
	
	
	
	
	
	
}
