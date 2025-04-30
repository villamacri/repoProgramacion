package ejercicio11;

public class Alumno {

	private String nombre;
	private String curso;
	private double [] notas;
	private int numSuspensos;
	private double notaMedia;
	
	public Alumno(String nombre, String curso, double[] notas, int numSuspensos, double notaMedia) {
		super();
		this.nombre = nombre;
		this.curso = curso;
		this.notas = notas;
		this.numSuspensos = numSuspensos;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public int getNumSuspensos() {
		return numSuspensos;
	}

	public void setNumSuspensos(int numSuspensos) {
		this.numSuspensos = numSuspensos;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
	
}
