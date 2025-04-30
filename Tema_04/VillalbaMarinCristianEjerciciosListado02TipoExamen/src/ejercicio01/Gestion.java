package ejercicio01;

import java.util.Arrays;

public class Gestion {

	private Habitacion [] listado;

	public Gestion(Habitacion[] listado) {
		super();
		this.listado = listado;
	}

	public Habitacion[] getListado() {
		return listado;
	}

	public void setListado(Habitacion[] listado) {
		this.listado = listado;
	}

	@Override
	public String toString() {
		return "Gestion [listado=" + Arrays.toString(listado) + "]";
	}
	
	
}
