package CRUD;

import Datos.DatosJugador;
import Model.Jugador;
import Utils.Utils;
import Vista.ImprimirCarton;

public class CrudJugador {

	private DatosJugador connection;
	
	public CrudJugador(int size) {
		this.connection = new DatosJugador(size);
	}
	
	public Jugador create(String name) {
		Jugador[] jugadores = connection.selectAll();
		Jugador newJugador = null;

		if(Utils.size(jugadores) < jugadores.length) {

			Jugador j = new Jugador(name);

			newJugador = connection.insert(j);
		}

		return newJugador;
	}

	public Jugador[] getAll() {
		return connection.selectAll();
	}
}
