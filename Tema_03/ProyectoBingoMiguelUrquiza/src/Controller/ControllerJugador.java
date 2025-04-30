package Controller;

import CRUD.CrudCarton;
import CRUD.CrudJugador;
import Model.Carton;
import Model.Jugador;
import Utils.Utils;
import Vista.ImprimirCarton;
import Vista.Menu;

public class ControllerJugador {

	CrudJugador crudJugador;
	CrudCarton crudCarton;
	
	private int filas;
	private int columnas;
	private String[] checkedNumbers = new String[90];
	private boolean lineWinned = false;
	
	public ControllerJugador(int size, int filas,int columnas) {
		this.crudJugador = new CrudJugador(size);
		this.crudCarton = new CrudCarton(size);
		this.filas=filas;
		this.columnas=columnas;
	}
	
	public Jugador createPlayer(String name) {
		Jugador jugador;
		Carton carton;

		//Creamos al jugador
		jugador = crudJugador.create(name);

		if(jugador != null) {
			//Creamos cartón y lo asignamos al jugador
			carton = crudCarton.create(filas, columnas);
			jugador.setCarton(carton);
		}

		return jugador;
	}
	
	public boolean enoughPlayers() {
		Jugador[]jugadores = crudJugador.getAll();
		
		return Utils.size(jugadores)>=1;

	}
	
	public Jugador[] playRound() {
		boolean existing = true;
		Jugador[] jugadores = crudJugador.getAll();
		boolean isBingo=false;
		String number="";
		while(existing) {
			//Comprobamos si el número generado existe.
			number=Integer.toString(Utils.randomNumberGenerator(1,columnas*10));
			existing = Utils.find(checkedNumbers, number);
			
		}
		Utils.add(checkedNumbers, number);
		Menu.printGeneratedNumber(Integer.parseInt(number));

		for (Jugador j : crudJugador.getAll()) {
			if(j!=null) {
				String[][] carton = j.getCarton().getBoard();
				
				for (int i = 0; i < carton.length; i++) {
					if(Utils.find(carton[i], number)) {
						int posicion = Utils.findPosition(carton[i], number);
						
						carton[i][posicion]="X";
					}
				}
				
				//Comprobamos línea 
				if(!lineWinned) {
					lineWinned=this.checkLine(carton);
					j.setLineWin(lineWinned);
				}
				
				//Comprobamos Bingo
				isBingo = checkBingo(carton);
				j.setBingoWin(isBingo);
			}
		}
		
		return jugadores;
	}

	public Jugador findBingoPlayer() {
		Jugador winner = null;
		Jugador[] jugadores = crudJugador.getAll();
		for (Jugador jugador : jugadores) {
			if (jugador != null && jugador.isBingoWin()) {
				winner = jugador;
			}
		}

		return winner;

	}

	public Jugador findLinePlayer() {
		Jugador winner = null;
		Jugador[] jugadores = crudJugador.getAll();
		for (Jugador a : jugadores) {
			if (a != null && a.isLineWin()) {
				winner = a;
			}
		}
		return winner;
	}

	//Comprobar linea
	public boolean checkLine(String[][] carton) {
		boolean line= false;
		
		for (String[] strings : carton) {
			if(checkRow(strings)) {
				line = true;
			}
		}
		
		return line;
	}
	
	
	//Comprobamos bingo
	public boolean checkBingo(String[][] carton) {
		boolean bingo = true;
		for (String[] strings : carton) {
			if(!checkRow(strings)) {
				bingo = false;
			}
		}
		return bingo;
	}
	
	//Comprobamos Columnna
	public boolean checkRow(String[] row) {
		boolean bingoRow = true;
		for (String string : row) {
			if(!string.equalsIgnoreCase("X")) {
				bingoRow = false;
			}
		}
		
		return bingoRow;
	}
	
}
