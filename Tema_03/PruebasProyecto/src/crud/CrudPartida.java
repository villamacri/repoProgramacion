package crud;

import model.Jugador;
import model.Partida;

public class CrudPartida {
	
	private int numJugadores;
	private int contador=0;

	public CrudPartida(int numJugadores) {
		super();
		this.numJugadores = numJugadores;
	}

	public int getNumJugadores() {
		return numJugadores;
	}

	public void setNumJugadores(int numJugadores) {
		this.numJugadores = numJugadores;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "CrudPartida [numJugadores=" + numJugadores + "contador=" + contador + "]";
	}

	public void agregarJugador(Jugador j, Partida p) {
		p.getListadoJugadores()[contador]=j;
		contador++;
	}
	
	public void imprimirListadoJug(Partida p) {
		for (int i = 0; i < p.getListadoJugadores().length; i++) {
			if(p.getListadoJugadores()[i]!=null) {
				System.out.println(p.getListadoJugadores()[i]);
			}
		}
	}
	
}
