package ejercicio05;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private String apellido;
	private String dni;
	private String ciudad;
	private int idPersona;
	
	public Persona(String nombre, String apellido, String dni, String ciudad, int idPersona) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.ciudad = ciudad;
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", ciudad=" + ciudad
				+ ", idPersona=" + idPersona + "]";
	}

	@Override
	public int compareTo(Persona p) {
		return this.nombre.toLowerCase().compareTo(p.getNombre().toLowerCase());
	}
	
}
