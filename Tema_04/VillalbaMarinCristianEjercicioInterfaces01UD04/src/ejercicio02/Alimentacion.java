package ejercicio02;

public class Alimentacion extends Producto {

	private boolean regrigerado;

	public Alimentacion(double precio, String nombre, boolean regrigerado) {
		super(precio, nombre);
		this.regrigerado = regrigerado;
	}

	public boolean isRegrigerado() {
		return regrigerado;
	}

	public void setRegrigerado(boolean regrigerado) {
		this.regrigerado = regrigerado;
	}

	@Override
	public String toString() {
		return "Alimentacion [regrigerado=" + regrigerado + "]";
	}

}
