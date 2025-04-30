package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cabecera="Cafe Bar L@s Niñ@s		Cif: 111222333X";
		Documento d= new Documento(cabecera);
		TarjetaDeVisita t=new TarjetaDeVisita(cabecera);
		Carta c=new Carta(cabecera);
		
		d.imprimirCabecera();
		t.imprimirTarjeta();
		c.imprimirCarta();
	}

}
