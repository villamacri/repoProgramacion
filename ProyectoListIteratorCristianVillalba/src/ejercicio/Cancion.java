package ejercicio;

public class Cancion {

	
	private String titulo;
	private String autor;
	private double duracion;
	
	public Cancion(String titulo, String autor, double duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + ", duracion=" + duracion + "]";
	}
	
}
