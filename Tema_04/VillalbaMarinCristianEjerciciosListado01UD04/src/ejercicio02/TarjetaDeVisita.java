package ejercicio02;

public class TarjetaDeVisita extends Documento{

	
	public TarjetaDeVisita(String cabecera) {
		super(cabecera);
	}

	public void imprimirTarjeta() {
		System.out.println(super.getCabecera()+"\t\tTfno: 666111222");
	}

}
