package ejemploobjetos;

public class Secretaria {

	private String nombreColegio;
	private Alumno a;// Primera vez que se pone una clase como un atributo no básico
	
	public Secretaria(String nombreColegio, Alumno a) {
		
		this.nombreColegio = nombreColegio;
		this.a = a;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	public Alumno getA() {
		return a;
	}

	public void setA(Alumno a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "Secretaria [nombreColegio=" + nombreColegio + ", a=" + a + "]";
	}
	
	public double calcularMedia2() {
		double dos = 2.0;
		return a.calcularMedia();
	}
	
}
