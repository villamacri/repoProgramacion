package ejercicio19;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double sueldoF=1000, dineroVentas, dinExtra, porcVentas = 20, cien=100;
		int opcion = 0;
		String aux;
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					¿Qué desea hacer?
					
					0. Para salir
					Pulse cualquier número para continuar
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			if(opcion==0) {
				System.out.println("Saliendo...");
			}else {
				System.out.println("Diga cuanto ha vendido este mes");
				aux=sc.nextLine();
				dineroVentas=Double.parseDouble(aux);
				
				dinExtra=dineroVentas*(porcVentas/cien);
				sueldoF+=dinExtra;
				
				System.out.printf("\nSu sueldo este mes es de %.2f€\n", sueldoF);
			}
			
		}while(opcion!=0);
		System.out.println("Adiós");
		
	}

}
