package model;

import java.util.Arrays;

public class Jugador {
	
	private int [][] cartonJugador;
	private String nombre;
	private int cantidadCartones;
	
	public Jugador(int[][] cartonJugador, String nombre, int cantidadCartones) {
		super();
		this.cartonJugador = cartonJugador;
		this.nombre = nombre;
		this.cantidadCartones = cantidadCartones;
	}
	public int[][] getCartonJugador() {
		return cartonJugador;
	}
	public void setCartonJugador(int[][] cartonJugador) {
		this.cartonJugador = cartonJugador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadCartones() {
		return cantidadCartones;
	}
	public void setCantidadCartones(int cantidadCartones) {
		this.cantidadCartones = cantidadCartones;
	}
	@Override
	public String toString() {
		return "Jugador [cartonJugador=" + Arrays.toString(cartonJugador) + ", nombre=" + nombre + ", cantidadCartones="
				+ cantidadCartones + "]";
	}
	
	
}
