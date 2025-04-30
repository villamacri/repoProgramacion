package ejercicio08;

public class CuentaCorriente {

	private double saldo;
	private String titular;
	
	public CuentaCorriente(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double ingresarDin(double ingreso) {
		this.saldo+=ingreso;
		return this.saldo;
	}
	
	public double retirarDin(double retiro) {
		this.saldo-=retiro;
		return this.saldo;
	}
	
	public double calcularDolar(double valorDol) {
		double cambio;
		cambio=this.saldo*valorDol;
		return cambio;
	}
	
	public void imprimirSaldo() {
		System.out.printf("""
				Titular: %s
				Saldo: %.2f
				""", this.titular, this.saldo);
	}
	
}
