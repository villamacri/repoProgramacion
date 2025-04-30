package ejercicio02;

public class Producto implements IImpuestoProd{

	private double precio;
	private String nombre;
	
	public Producto(double precio, String nombre) {
		super();
		this.precio = precio;
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Producto [precio=" + precio + ", nombre=" + nombre + "]";
	}

	@Override
	public double calculoIva(int iva) {
		// TODO Auto-generated method stub
		double cien=100;
		return precio*(iva/cien);
	}
	
	public double calcularPVP(int iva) {
		double precioPvp;
		precioPvp=precio+calculoIva(iva);
		return precioPvp;
	}

}
