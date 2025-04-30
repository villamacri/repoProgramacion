package ejercicio02;

public class Socio implements Comparable<Socio>{

	private String nombre;
	private String apellidos;
	private String dni;
	private int idSocio;
	private double cuotaBase;
	private boolean alquilerPista;
	
	public Socio(String nombre, String apellidos, String dni, int idSocio, double cuotaBase, boolean alquilerPista) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.idSocio = idSocio;
		this.cuotaBase = cuotaBase;
		this.alquilerPista = alquilerPista;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
	}

	public double getCuotaBase() {
		return cuotaBase;
	}

	public void setCuotaBase(double cuotaBase) {
		this.cuotaBase = cuotaBase;
	}

	public boolean isAlquilerPista() {
		return alquilerPista;
	}

	public void setAlquilerPista(boolean alquilerPista) {
		this.alquilerPista = alquilerPista;
	}

	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", idSocio=" + idSocio
				+ ", cuotaBase=" + cuotaBase + ", alquilerPista=" + alquilerPista + "]";
	}

	public int compareTo(Socio s) {
		if(this.idSocio>s.idSocio) {
			return 1;
		}else {
			if(this.idSocio<s.idSocio) {
				return -1;
			}
			return 0;
		}
	}
	
	
}
