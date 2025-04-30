package ejercicio02;

public class Circulo {

	//Atributos
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularAreaCm() {
		double area, exp=2;
		area=Math.PI*Math.pow(radio, exp);
		return area;
	}
	
	public double calcularAreaM() {
		double area, conv=10000, exp=2;
		area=Math.PI*Math.pow(radio, exp)/conv;
		return area;
	}
}
