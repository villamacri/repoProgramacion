package ejercicio02;

public class Habitacion {

	private int numHab;
	private double price;
	private int numDays;
	private String nameClient;
	private boolean isClear;
	private boolean isBusy;

	public Habitacion(int numHab, double price, int numDays, String nameClient, boolean isClear, boolean isBusy) {
		this.numHab = numHab;
		this.price = price;
		this.numDays = numDays;
		this.nameClient = nameClient;
		this.isClear = isClear;
		this.isBusy = isBusy;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNumDays() {
		return numDays;
	}

	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}

	public String getNameClient() {
		return nameClient;
	}

	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}

	public boolean isClear() {
		return isClear;
	}

	public void setClear(boolean isClear) {
		this.isClear = isClear;
	}

	public boolean isBusy() {
		return isBusy;
	}

	public void setBusy(boolean isBusy) {
		this.isBusy = isBusy;
	}

	@Override
	public String toString() {
		return "Habitacion\n[Number Room=" + numHab + "\n Price=" + price + "\n Number Days=" + numDays + "\n Name Client="
				+ nameClient+"]";
	}

}
