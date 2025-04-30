package ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto [] listado;//No se instancia aqui

	public Tienda(Producto[] listado) {
		super();
		this.listado = listado;
	}

	public Producto[] getListado() {
		return listado;
	}

	public void setListado(Producto[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Tienda [listado=" + Arrays.toString(listado) + "]";
	}
	
	public void listarProductos() {
		for (int i = 0; i < listado.length; i++) {
			if(listado[i]!=null) {
			System.out.println(listado[i]);
			}
		}
	}
	
	
	public Producto findById(int id) {
		int i=0;
		Producto buscado=null;
		boolean encontrado=false;
		
		while(i<listado.length && !encontrado) {
			if(listado[i].getId()==id) {
				encontrado=true;
				buscado=listado[i];
			}else {
			i++;
			}
		}
		return buscado;
	}
	
	public Producto[] findByNombre(String nombre) {
		int i=0;
		Producto [] listaBusquedas=new Producto[listado.length];
		
		while(i<listado.length) {
			if(listado[i].getNombre().equalsIgnoreCase(nombre)) {
				listaBusquedas[i]=listado[i];
				i++;
			}else {
				i++;
			}
		}
		return listaBusquedas;
	}
	
	public boolean comprobarFragil(Producto p) {
		boolean estado;
		if(findById(p.getId()).isFragil()) {
			estado=true;
		}else {
			estado=false;
		}
		
		return estado;
	}
	
	public void imprimirFragil(Producto p) {
		if(comprobarFragil(p)) {
			System.out.println("OJO, producto frágil.");
		}else {
			System.out.println("Producto estándar.");
		}
	}
	
	public Producto [] agregarProducto(Producto [] listado,Producto p) {
		Producto[] nuevoListado = new Producto[listado.length+1];
		for (int i = 0; i < listado.length; i++) {
			nuevoListado[i]=listado[i];
		}
		nuevoListado[nuevoListado.length-1]=p;
		return nuevoListado;
	}
	
	//Este es el bueno
	public void agregarProductoV2(Producto p, int numProductos) {
		listado[numProductos]=p;
	}
	
	public double calcularInversion() {
		double suma = 0;
		for (int i = 0; i < listado.length; i++) {
			suma+=listado[i].getPrecioFab();
		}
		return suma;
	}
	
	public double calcularPVP(Producto p, double porcentaje, double transporte) {
		double div=100, PvP;
		PvP=p.calcularPrecioCoste(transporte)+(p.calcularPrecioCoste(transporte)*porcentaje)/div;
		
		return PvP;
	}
	
	public double calcularGanancias(double porcentaje, double transporte) {
		double suma = 0;
		for (int i = 0; i < listado.length; i++) {
			suma+=calcularPVP(listado[i], porcentaje, transporte);
		}
		return suma-calcularInversion();
	}
	
}
