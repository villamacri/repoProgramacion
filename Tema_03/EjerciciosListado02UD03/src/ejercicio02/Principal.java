package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numHabs = 4, accountant=0;
		
		int numberHab=0, days=0, opcion=0;
		double price=0.0;
		int clear=0;
		boolean isClear=false;
		boolean isBusy=false;
		int busy=0;
		int index=0;
		String name, aux;
		Habitacion[] hab = new Habitacion [numHabs]; 
		Hotel h=new Hotel (hab);
		
		System.out.println("¡Welcome to hotel San Jesús!");
		
		do {
			System.out.println("Select:\n 0.To leave the app\n 1.To add new room\n 2.Check availability\n 3.To calculate final price\n 4.To show invoices\n");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 0:
					System.out.println("Leaving...");
					break;
				case 1:
					isClear=false;
					isBusy=false;
					
					System.out.println("¿What is the room number?");
					aux=sc.nextLine();
					numberHab=Integer.parseInt(aux); 
					
					System.out.println("¿What is the price of the room?");
					aux=sc.nextLine();
					price=Double.parseDouble(aux);
					
					System.out.println("¿When will you be here?");
					aux=sc.nextLine();
					days=Integer.parseInt(aux);
					
					System.out.println("¿What is the name of the client?");
					name=sc.nextLine();
					
					System.out.println("¿The room is clean? (0. NO, 1. YES)");
					aux=sc.nextLine();
					clear=Integer.parseInt(aux);
					if(clear==1) {
						isClear=true;
					}
					System.out.println("Is she busy? (0. NO, 1. YES)");
					aux=sc.nextLine();
					busy=Integer.parseInt(aux);
					if(busy==1) {
						isBusy=true;
					}
					hab[accountant] = new Habitacion (numberHab,price,days,name,isClear, isBusy);
					h.addRoom(accountant, hab[accountant]);
					accountant++;
					break;
				case 2:
					System.out.println("Tell me the room number to check");
					aux=sc.nextLine();
					numberHab=Integer.parseInt(aux);
					
					index = h.findRoom(numberHab, accountant);
					
					if(h.roomBusy(index)) {
						System.out.println("La habitación esta ocupada");
					} else {
						System.out.println("La habitación esta libre");
					}
					
					break;
				case 3:
					System.out.println("Tell us which is your room");
					aux=sc.nextLine();
					numberHab=Integer.parseInt(aux);
					
					index = h.findRoom(numberHab, accountant);
					System.out.println("The final price is: "+h.CalculateFinalPrice(index)+"€");
					break;
				case 4:
					h.listAll(accountant);
					
			}
			
			
			
		} while (opcion!=0);
		
	}

}