package ejercicio02Correcion;

public class Socio implements Comparable<Socio>{
	
	private String nombreYApelldio;
	private int ID;
	private String DNI;
	private boolean isMasculino;
	
	public Socio(String nombreYApelldio, int iD, String dNI, boolean isMasculino) {
		super();
		this.nombreYApelldio = nombreYApelldio;
		ID = iD;
		DNI = dNI;
		this.isMasculino = isMasculino;
	}

	public String getNombreYApelldio() {
		return nombreYApelldio;
	}

	public void setNombreYApelldio(String nombreYApelldio) {
		this.nombreYApelldio = nombreYApelldio;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public boolean isMasculino() {
		return isMasculino;
	}

	public void setMasculino(boolean isMasculino) {
		this.isMasculino = isMasculino;
	}

	@Override
	public String toString() {
		return "Socio [nombreYApelldio=" + nombreYApelldio + ", ID=" + ID + ", DNI=" + DNI + ", isMasculino="
				+ isMasculino + "]";
	}
	
	public int compareTo (Socio s) {
		if(this.ID > s.ID) {
			return 1;
		} else {
			if(this.ID < s.ID) {
				return -1;
			}
			return 0;
		}
	}
	
	
}
