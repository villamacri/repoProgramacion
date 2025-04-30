package ejercicio03;

public class Movil {

	private String marca;
	private String codigo;
	private String modelo;
	private boolean vendido;
	private boolean segundaMano;
	private double precioUnitario;
	
	public Movil(String marca, String codigo, String modelo, boolean vendido, boolean segundaMano, double precioUnitario) {
		super();
		this.marca = marca;
		this.codigo=codigo;
		this.modelo = modelo;
		this.vendido = vendido;
		this.segundaMano = segundaMano;
		this.precioUnitario = precioUnitario;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isVendido() {
		return vendido;
	}

	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}

	public boolean isSegundaMano() {
		return segundaMano;
	}

	public void setSegundaMano(boolean segundaMano) {
		this.segundaMano = segundaMano;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", codigo=" + codigo + ", modelo=" + modelo + ", vendido=" + vendido + ", segundaMano=" + segundaMano
				+ ", precioUnitario=" + precioUnitario + "]";
	}
	
	
	
}
