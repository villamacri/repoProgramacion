package crud;

import model.Carton;
import model.Jugador;
import controller.ControllerJugador;

public class CrudJugador {

	public void agregarCarton(String [][] carton, Carton c) {
		ControllerJugador cp=new ControllerJugador();
		c.setCartonRelleno(carton);
	}
	
}
