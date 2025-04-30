package Model;

import Vista.ImprimirCarton;

public class Jugador {
	
	private int id;
	private String name;
	private Carton carton;
	private boolean bingoWin;
	private boolean lineWin;
	
	//Constructor
	public Jugador(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public Carton getCarton() {
		return carton;
	}
	
	public void setCarton(Carton carton) {
		this.carton=carton;
	}

	public boolean isBingoWin() {
		return bingoWin;
	}

	public void setBingoWin(boolean bingoWin) {
		this.bingoWin = bingoWin;
	}

	public boolean isLineWin() {
		return lineWin;
	}

	public void setLineWin(boolean lineWin) {
		this.lineWin = lineWin;
	}

	// Imprimir carton
	public void printCarton(){
		ImprimirCarton ic = new ImprimirCarton();
		System.out.println(this.getName());
		ic.printBoard(this.getCarton().getBoard());
	}
}
