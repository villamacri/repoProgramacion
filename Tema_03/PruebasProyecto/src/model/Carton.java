package model;

import java.util.Arrays;

public class Carton {

	private String [][] cartonRelleno;
	private int numFilas;
	private int numColumnas;
	private int contHuecos;
	
	public Carton(String[][] cartonRelleno, int numFilas, int numColumnas, int contHuecos) {
		super();
		this.cartonRelleno = cartonRelleno;
		this.numFilas = numFilas;
		this.numColumnas = numColumnas;
		this.contHuecos = contHuecos;
	}

	public String[][] getCartonRelleno() {
		return cartonRelleno;
	}

	public void setCartonRelleno(String[][] cartonRelleno) {
		this.cartonRelleno = cartonRelleno;
	}

	public int getNumFilas() {
		return numFilas;
	}

	public void setNumFilas(int numFilas) {
		this.numFilas = numFilas;
	}

	public int getNumColumnas() {
		return numColumnas;
	}

	public void setNumColumnas(int numColumnas) {
		this.numColumnas = numColumnas;
	}

	public int getContHuecos() {
		return contHuecos;
	}

	public void setContHuecos(int contHuecos) {
		this.contHuecos = contHuecos;
	}

	@Override
	public String toString() {
		return "Carton [cartonRelleno=" + Arrays.toString(cartonRelleno) + ", numFilas=" + numFilas + ", numColumnas="
				+ numColumnas + ", contHuecos=" + contHuecos + "]";
	}
	
}
