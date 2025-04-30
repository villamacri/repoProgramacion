package ejercicio02;

public class Carta extends Documento{

	public Carta(String cabecera) {
		super(cabecera);
	}

	public void imprimirCarta() {
		System.out.println(super.getCabecera()+"\t\tFecha:09/01/2025");
	}
	
}
