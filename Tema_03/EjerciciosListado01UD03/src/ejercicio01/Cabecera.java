package ejercicio01;

public class Cabecera {

	//Atributos
	private String nombreAsig;
	private int numAula;
	private String fecha;
	
	//Constructores

	public Cabecera(String nombreAsig, int numAula, String fecha) {
		super();
		this.nombreAsig = nombreAsig;
		this.numAula = numAula;
		this.fecha = fecha;
	}

	//Métodos
	public String getNombreAsig() {
		return nombreAsig;
	}

	public void setNombreAsig(String nombreAsig) {
		this.nombreAsig = nombreAsig;
	}

	public int getNumAula() {
		return numAula;
	}

	public void setNumAula(int numAula) {
		this.numAula = numAula;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public void imprimirCabecera() {
		System.out.println(nombreAsig + "\t\tNúmero de clase: " + numAula + "\t\t" + fecha);
	}




}
