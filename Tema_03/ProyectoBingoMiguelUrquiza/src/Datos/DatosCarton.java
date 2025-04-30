package Datos;

import Model.Carton;
import Utils.Utils;

public class DatosCarton {

	
	private Carton[] boards;
	
	public DatosCarton (int size) {
		this.boards = new Carton[size];
	}
	
	public Carton insert(Carton carton) {
		int size = Utils.size(boards);
		carton.setId(size+1);
		
		Utils.add(this.boards, carton);
		return carton;
	}
	
}
