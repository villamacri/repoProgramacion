package CRUD;

import Datos.DatosCarton;
import Model.Carton;
import Utils.Utils;

public class CrudCarton {

	private DatosCarton connection;
	
	public CrudCarton(int size) {
		this.connection = new DatosCarton(size);
	}
	
	public Carton create(int filas,int columnas) {
		Carton carton = new Carton(filas,columnas);
		this.populateBoard(carton.getBoard());
		return connection.insert(carton);
	}

	public void populateBoard(String[][]board) {
		int randomRow;
		boolean existing;
		String insertValue;
		String[] colValues;

		for (int j = 0; j < board.length; j++) {
			for (int i = 0; i < board[j].length; i++) {
				do {
					randomRow = Utils.randomNumberGenerator(0, 9);
					insertValue = Utils.numerosBingo()[i][randomRow];
					colValues = new String[board.length];

					for (int k = 0; k < board.length; k++){
						colValues[k] = board[k][i];
					}
					existing = Utils.find(colValues, insertValue);
				}while (existing);
				board[j][i]=insertValue;
			}
		}
	}
}
