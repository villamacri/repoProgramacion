package ejemploconstructor;

public class Producto {

	//Atributos
	private int id;
	private String nombre;
	private double precioBase;
	
	//Constructores
	public Producto(int id, String nombre, double precioBase) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioBase = precioBase;
	}

	public Producto(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public Producto() {
		super();
	}

	//Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	//To string
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", precioBase=" + precioBase + "]";
	}
	
	//Métodos propios
	public double calcularPVP(double porc) {
		double cien=100;
		return precioBase+(precioBase*(porc/cien));
	}
	
	
}
