package ejercicio15;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int numL, tope = 10, opcion = 0;
		String aux;
		
		System.out.println("Bienvenido a mi programa de mostrar tablas de un entero");
		
		do {
			
			System.out.println("""
					Diga que quiere hacer
					
					0. Salir
					1. Iniciar muestra de tablas
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				System.out.println("Diga un número entero");
				aux=sc.nextLine();
				numL=Integer.parseInt(aux);
				
				for (int i = 0; i <= tope ; i++) {
					
					System.out.println(numL +"*"+ i + "=" + (numL*i));
				}
				break;
				
				default:
					System.out.println("Opción no válida");
					break;
					
			}
		
		}while(opcion!=0);
		
		System.out.println("Adiós");
		
	}

}
