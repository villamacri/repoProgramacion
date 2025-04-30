package Model;

public class Carton {
	
	public Carton (int filas,int columnas) {
		this.setBoard(new String[filas][columnas]);
	}

	private int id;
	private String [][] board;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	
	public String[][] getBoard(){
		return board;
	}
	
	public void setBoard(String [][] board) {
		this.board= board;
	}
	
	
	

}
