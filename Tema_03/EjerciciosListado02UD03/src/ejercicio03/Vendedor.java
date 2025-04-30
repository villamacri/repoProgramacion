package ejercicio03;

import java.util.Arrays;

public class Vendedor {

	private Movil [] listado;
	private double totalVendido;
	private int numProd;
	
	public Vendedor(Movil[] listado, double totalVendido, int numProd) {
		super();
		this.listado = listado;
		this.totalVendido = totalVendido;
		this.numProd = numProd;
	}

	public Movil[] getListado() {
		return listado;
	}

	public void setListado(Movil[] listado) {
		this.listado = listado;
	}

	public double getTotalVendido() {
		return totalVendido;
	}

	public void setTotalVendido(double totalVendido) {
		this.totalVendido = totalVendido;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	
	
	@Override
	public String toString() {
		return "Vendedor [listado=" + Arrays.toString(listado) + ", totalVendido=" + totalVendido + ", numProd="
				+ numProd + "]";
	}

	public Movil findByCod(String cod) {
		Movil buscado=null;
		boolean encontrado=false;
		int i=0;
		
		while(i<listado.length && !encontrado) {
			if(listado[i].getCodigo().equalsIgnoreCase(cod)) {
				buscado=listado[i];
				encontrado=true;
			}else {
				i++;
			}
		}
		return buscado;
	}
	
	public int comprobarSinVender() {
		int suma=0;
		
		for (int i = 0; i < listado.length; i++) {
			if(!listado[i].isVendido()) {
				suma++;
			}
		}
		return suma;
	}
	
	public double calcularPrecioFinalUnMovil(Movil m) {
		double precioF=0, cien=100, descuento=20;
		if(m.isSegundaMano()) {
			precioF=m.getPrecioUnitario()-(m.getPrecioUnitario()*descuento)/cien;
		}else {
			precioF=m.getPrecioUnitario();
		}
		return precioF;
	}
	
	public void imprimirPrecioF(Movil m) {
		System.out.printf("El precio del movil %s %s es de %.2f€\n", m.getMarca(), m.getModelo(), calcularPrecioFinalUnMovil(m));
	}
	
	public double calcularCambio(Movil m, double pago) {
		double cambio=0;
		
		cambio=pago-calcularPrecioFinalUnMovil(findByCod(m.getCodigo()));
		return cambio;
	}
	
	public double calcularDinBolsillo() {
		double dinBols=0;
		
		for (int i = 0; i < listado.length; i++) {
			if(listado[i].isVendido()) {
				dinBols+=calcularPrecioFinalUnMovil(listado[i]);
			}
		}
		return dinBols;
	}
	
	public void agregarMovil(Movil m) {
		numProd++;
		listado[numProd]=m;
	}
	
	public void imprimirListado() {
		for (int i = 0; i < listado.length; i++) {
			if(listado[i]!=null) {
				System.out.println(listado[i]);
		
			}
		}
	}
	
}
