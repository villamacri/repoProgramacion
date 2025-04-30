package ejercicio02;

public class Documento {

	private String cabecera;
	
	public Documento(String cabecera) {
		super();
		this.cabecera = cabecera;
	}

	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public void imprimirCabecera() {
		System.out.println(cabecera);
	}
}
