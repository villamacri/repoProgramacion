package ejemplopolimorfismo;

public class Circulo extends Figura{

	private double radio;

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radio;
	}
	
	public void mostrarRadianes() {
		System.out.println("Solo estoy en la clase Círculo, porque los demás no pueden tener randianes en concreto tengo 2 pi radianes");
	}
	
}
