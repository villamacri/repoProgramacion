package ejemploobjetos;

import java.util.Arrays;

public class Alumno2 {

	private String nombre;
	private double [] listadoNotas;//De momento, no instanciamos aquí el array, es decir, no ponemos el new.
	
	public Alumno2(String nombre, double[] listadoNotas) {
		super();
		this.nombre = nombre;
		this.listadoNotas = listadoNotas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double[] getListadoNotas() {
		return listadoNotas;
	}

	public void setListadoNotas(double[] listadoNotas) {
		this.listadoNotas = listadoNotas;
	}

	@Override
	public String toString() {
		return "Alumno2 [nombre=" + nombre + ", listadoNotas=" + Arrays.toString(listadoNotas) + "]";
	}
	
	public double calcularMediaNotas() {
		double suma = 0;
		for (int i = 0; i < listadoNotas.length; i++) {
			suma+=listadoNotas[i];
		}
		return suma/listadoNotas.length;
	}
	
	
}
