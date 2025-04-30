package ejercicio16;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int num = 0, tope = 10, suma = 0, opcion = 0, producto = 1;
		String aux;
		
		System.out.println("Bienvenido");
		
		do {
		
			System.out.println("""
					\nIndique que desea hacer
					
					0. Salir
					1. Arrancar programa
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				for (int i = 0; i < tope; i++) {
					
					System.out.println("Diga un número");
					aux=sc.nextLine();
					num=Integer.parseInt(aux);
					
					suma+=num;
					producto*=num;
				}
				
				System.out.println("La suma de los números es " + suma);
				System.out.println("El producto total de los 10 números es " + producto);
				break;
				
				default:
					System.out.println("Opción no válida");
					break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Adiós");
	}

}
