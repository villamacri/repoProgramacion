package ejemploobjetos;

public class Alumno {

	private String nombre;
	private String apellidos;
	private double notaPro;
	private double notaSis;
	
	public Alumno(String nombre, String apellidos, double notaPro, double notaSis) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.notaPro = notaPro;
		this.notaSis = notaSis;
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

	public double getNotaPro() {
		return notaPro;
	}

	public void setNotaPro(double notaPro) {
		this.notaPro = notaPro;
	}

	public double getNotaSis() {
		return notaSis;
	}

	public void setNotaSis(double notaSis) {
		this.notaSis = notaSis;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", notaPro=" + notaPro + ", notaSis=" + notaSis
				+ "]";
	}
	
	public double calcularMedia() {
		double dos=2.0;
		return (notaPro + notaSis)/dos;
	}
	
}
