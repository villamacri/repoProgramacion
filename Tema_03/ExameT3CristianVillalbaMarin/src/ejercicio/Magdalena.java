package ejercicio;

public class Magdalena {
	
	private String codProduct;
	private int id;
	private String sabor;
	private boolean cupcake;
	private double volMasa;
	
	public Magdalena(String codProduct, int id, String sabor, boolean cupcake, double volMasa) {
		super();
		this.codProduct = codProduct;
		this.id = id;
		this.sabor = sabor;
		this.cupcake = cupcake;
		this.volMasa = volMasa;
	}

	public String getCodProduct() {
		return codProduct;
	}

	public void setCodProduct(String codProduct) {
		this.codProduct = codProduct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public boolean isCupcake() {
		return cupcake;
	}

	public void setCupcake(boolean cupcake) {
		this.cupcake = cupcake;
	}

	public double getVolMasa() {
		return volMasa;
	}

	public void setVolMasa(double volMasa) {
		this.volMasa = volMasa;
	}

	@Override
	public String toString() {
		return "Magdalena [codProduct=" + codProduct + ", id=" + id + ", sabor=" + sabor + ", cupcake=" + cupcake
				+ ", volMasa=" + volMasa + "]";
	}
	
}
