package model;

public class Jugador {

	private Carton cartonDeJuego;
	private String nombre;
	private int codJugador;
	private boolean ganador;
	
	public Jugador(Carton cartonDeJuego, String nombre, int codJugador, boolean ganador) {
		super();
		this.cartonDeJuego = cartonDeJuego;
		this.nombre = nombre;
		this.codJugador = codJugador;
		this.ganador = ganador;
	}

	public Carton getCartonDeJuego() {
		return cartonDeJuego;
	}

	public void setCartonDeJuego(Carton cartonDeJuego) {
		this.cartonDeJuego = cartonDeJuego;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodJugador() {
		return codJugador;
	}

	public void setCodJugador(int codJugador) {
		this.codJugador = codJugador;
	}

	public boolean isGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", codJugador="
				+ codJugador + ", ganador=" + ganador + "]";
	}
	
}
