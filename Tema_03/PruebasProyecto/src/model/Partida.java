package model;

import java.util.Arrays;

public class Partida {

	private Jugador [] listadoJugadores;
	
	public Partida(Jugador[] listadoJugadores) {
		super();
		this.listadoJugadores = listadoJugadores;
	}

	public Jugador[] getListadoJugadores() {
		return listadoJugadores;
	}

	public void setListadoJugadores(Jugador[] listadoJugadores) {
		this.listadoJugadores = listadoJugadores;
	}

	@Override
	public String toString() {
		return "Partida [listadoJugadores=" + Arrays.toString(listadoJugadores)
				+ "]";
	}
	
	
	
}
