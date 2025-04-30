package ejercicio03;

public class Alumno {
	
	private String nombre;
	private String apellidos;
	private int codAlum;
	private String dni;
	private double nota;
	
	public Alumno(String nombre, String apellidos, int codAlum, String dni, double nota) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.codAlum = codAlum;
		this.dni = dni;
		this.nota = nota;
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

	public int getCodAlum() {
		return codAlum;
	}

	public void setCodAlum(int codAlum) {
		this.codAlum = codAlum;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", codAlum=" + codAlum +
				", dni=" + dni + ", nota=" + nota + "]";
	}
	
}
