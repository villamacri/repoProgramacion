package ejercicio13;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int opcion=0, lun=1, mar=2, mier=3, jue=4, vie=5, sab=6, dom=7;
		String aux;
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("\nElija un número del 1 al 7, 0 para salir");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Lunes");
					break;
					
				case 2:
					System.out.println("Martes");
					break;
					
				case 3:
					System.out.println("Miércoles");
					break;
					
				case 4:
					System.out.println("Jueves");
					break;
					
				case 5:
					System.out.println("Viernes");
					break;
					
				case 6:
					System.out.println("Sábado");
					break;
					
				case 7:
					System.out.println("Domingo");
					break;
					
				default:
					System.out.println("Del 1 al 7 melón");
					break;
			
			}
			
		}while(opcion!=0);
		System.out.println("\nAdiós");
		
	}

}
