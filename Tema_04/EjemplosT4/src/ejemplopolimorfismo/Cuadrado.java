package ejemplopolimorfismo;

public class Cuadrado extends Figura{

	private double lado;

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public Cuadrado(String nombre, String color) {
		super(nombre, color);
	}

	public Cuadrado() {
		super();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return super.toString()+"Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado*4;
	}
	
	public void mostarLado() {
		System.out.println("Solo estoy en la case Cuadrado\nporque los demás no tienen lados,\nen concreto tengo 4 lados");
	}
	
}
