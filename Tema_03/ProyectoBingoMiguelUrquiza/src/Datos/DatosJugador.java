package Datos;

import Model.Jugador;
import Utils.Utils;

public class DatosJugador {

	private Jugador[]jugadores;
	
	public DatosJugador(int size) {
		this.jugadores =  new Jugador[size];
	}
	
	public Jugador[] selectAll() {
		return jugadores;
	}
	
	public Jugador insert(Jugador newPlayer) {
		int size= Utils.size(this.jugadores);
		
		newPlayer.setId(size+1);
		
		if(jugadores.length ==size) {
			Jugador[]tempJugadores = (Jugador[])Utils.cloneArray(jugadores);
			
			jugadores = new Jugador[jugadores.length+1];
			
			for (int i = 0; i < tempJugadores.length; i++) {
				jugadores [i]=tempJugadores[i];
			}
			
			
		}
		
		Utils.add(jugadores, newPlayer);
		
		return newPlayer;
	}
	
}
