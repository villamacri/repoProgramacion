package ejercicio01;

public class Nota {

	private String nombreNota;
	private String texto;
	
	public Nota(String nombreNota, String texto) {
		super();
		this.nombreNota = nombreNota;
		this.texto = texto;
	}

	public String getNombreNota() {
		return nombreNota;
	}

	public void setNombreNota(String nombreNota) {
		this.nombreNota = nombreNota;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}


	@Override
	public String toString() {
		return "Nombre de la Nota=" + nombreNota + "\n" + texto;
	}
	
}
