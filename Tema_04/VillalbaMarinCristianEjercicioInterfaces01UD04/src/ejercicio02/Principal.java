package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double porcIrpf=9.0, sueldo=1400.0, precio=15.0;
		int iva=21;
		
		Producto p=new Alimentacion(precio, "Coca", true);
		Trabajador t=new Trabajador(porcIrpf);
		IImpuestoProd i=new Producto(precio,"Lechuga");
		
		System.out.println(p.calculoIva(iva));
		System.out.println();
		System.out.println(t.calculoIrpf(sueldo));
		
		System.out.println(((Producto)i).calcularPVP(iva));
	}

}
