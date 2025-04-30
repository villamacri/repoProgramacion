package ejemploobjetos;

public class Secretaria2 {

	private String nombre;

	public Secretaria2(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Secretaria2 [nombre=" + nombre + "]";
	}
	
	//Así no
	/*
	public double calcularMedia3() {
		Alumno a = new Alumno("Angel", "Naranjo", 8, 2);
		return a.calcularMedia();
	}
	*/
	//Así noo
	/*
	public double calcularMedia4(String nombre, String apellidos, double notaPro, double notaSis) {
		return (notaPro+notaSis)/2;
	}
	*/
	
	//Uno que sí
	public double calcularMedia3(Alumno a) {
		return a.calcularMedia();
	}
	
	public double [] mediaNotas(double [] notas) {
		double suma=0;
		for (int i = 0; i < notas.length; i++) {
			suma+=notas[i];
		}
		return notas;
	}
	
}
