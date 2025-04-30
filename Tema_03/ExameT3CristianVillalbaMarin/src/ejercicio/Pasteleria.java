package ejercicio;

import java.util.Arrays;

public class Pasteleria {

	private String nombre;
	private Magdalena [] listado;
	private int numProd;
	private double presupuesto;
	
	public Pasteleria(String nombre, Magdalena[] listado, int numProd, double presupuesto) {
		super();
		this.nombre = nombre;
		this.listado = listado;
		this.numProd = numProd;
		this.presupuesto = presupuesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Magdalena[] getListado() {
		return listado;
	}

	public void setListado(Magdalena[] listado) {
		this.listado = listado;
	}

	public int getNumProd() {
		return numProd;
	}

	public void setNumProd(int numProd) {
		this.numProd = numProd;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Pasteleria [nombre=" + nombre + ", listado=" + Arrays.toString(listado) + ", numProd=" + numProd
				+ ", presupuesto=" + presupuesto + "]";
	}
	
	public void agregarMagdalena(Magdalena m) {
		numProd++;
		listado[numProd]=m;
	}
	
	public void mostrarLista() {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i]!=null) {
				System.out.println(listado[i]);
			}
		}
	}
	
	public Magdalena [] findBySabor(String sabor) {
		Magdalena[] buscadosSabor=new Magdalena[listado.length];
		
		for (int i = 0; i < listado.length && listado[i]!=null; i++) {
			if(listado[i].getSabor().equalsIgnoreCase(sabor)) {
				buscadosSabor[i]=listado[i];
			}
		}
		return buscadosSabor;
	}
	
	public void mostrarBusquedaSabores(String sabor) {
		for (int i = 0; i < findBySabor(sabor).length; i++) {
			if(findBySabor(sabor)[i]!=null)
			System.out.println(findBySabor(sabor)[i]);
		}
	}
	
	public Magdalena findById(int id) {
		Magdalena buscada=null;
		int i=0;
		boolean encontrada=false;
		
		while(i<listado.length && !encontrada && listado[i]!=null) {
			if(listado[i].getId()==id) {
				buscada=listado[i];
				encontrada=true;
			}else {
				i++;
			}
		}
		return buscada;
	}
	
	public void imprimirBuscada(int id) {
		if(findById(id)!=null) {
			System.out.println(findById(id));
		}else {
			System.out.println("Producto no encontrado");
		}
	}
	
	public double calcularMedia() {
		double suma=0;
		
		for (int i = 0; i < listado.length && listado[i]!=null; i++) {
			suma+=listado[i].getVolMasa();
		}
		return suma/numProd;
	}
	
	public double calcularPrecioCoste(int id, double costeCm3) {
		return findById(id).getVolMasa()*costeCm3;
	}
	
	public void mostrarCupcake() {
		for (int i = 0; i < listado.length; i++) {
			if(listado[i]!=null && listado[i].isCupcake()) {
				System.out.println(listado[i]);
			}
		}
	}
	
	public double calcularPorcInversionMagdalena(int id, double costeCm3) {
		double porcInver;
		porcInver=presupuesto/(presupuesto-calcularPrecioCoste(id, costeCm3));
		return porcInver;
	}

	public double calcularPrecioCosteNormales(double costeCm3) {
		double suma=0;
		for (int i = 0; i < listado.length; i++) {
			if(listado[i]!= null && !listado[i].isCupcake()) {
				suma+=(listado[i].getVolMasa()*costeCm3);
			}
		}
		return suma;
	}
	
}
