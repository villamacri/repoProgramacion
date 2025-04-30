package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion hab[];

	public Hotel(Habitacion[] hab) {
		this.hab = hab;
	}

	public Habitacion[] getHab() {
		return hab;
	}

	public void setHab(Habitacion[] hab) {
		this.hab = hab;
	}

	@Override
	public String toString() {
		return "Hotel [hab=" + Arrays.toString(hab) + "]";
	}

	public void addRoom(int acc, Habitacion newhab) {
		hab[acc] = newhab;
	}

	public void listAll(int accountant) {
		for (int i = 0; i < accountant; i++) {

				System.out.println(hab[i].toString());
			

		}
	}

	public int findRoom(int numHab, int accountant) {
		boolean found = false;
		int index = 0;
		for (int i = 0; i < accountant && !found; i++) {
			
			if (hab[i].getNumHab() == numHab) {
				found = true;
				index = i;
			}
		}
		if (found) {
			return index;
		} else {
			return -1;
		}
	}
	
	public boolean roomBusy (int index) {
		boolean isBusy=false;
		
		if (hab[index].isBusy()) {
			isBusy=true;
		}
		
		return isBusy;
	}
	
	public double CalculateFinalPrice (int accountant) {
		int days=0;
		double priceTotal=0;
		
		
		days=hab[accountant].getNumDays();
		priceTotal=hab[accountant].getPrice();
		
		return days*priceTotal;
		
	}
}