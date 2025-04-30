package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int eleccion, opcion;
		String aux;
		
		Moneda m=new Moneda();
		
		System.out.println("Bienvenido al juego de cara o cruz");
		
		do {
			System.out.println("""
					Elija cara o cruz
					
					1. Para cara
					2. Para cruz
					""");
			aux=sc.nextLine();
			eleccion=Integer.parseInt(aux);
			while(eleccion<1||eleccion>2) {
				System.out.println("Opción no válida");
				System.out.println("""
						Elija cara o cruz
						
						1. Para cara
						2. Para cruz
						""");
				aux=sc.nextLine();
				eleccion=Integer.parseInt(aux);
			}
			System.out.println("Tirando moneda...");
			m.lanzarMoneda();
			System.out.println("Comprobando resultado...");
			m.imprimirResultado(m.comprobarResultado(eleccion));
			System.out.println();
			System.out.println("""
					¿Desea jugar de nuevo?
					
					0. Para salir.
					1. Para confirmar.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			while(opcion<0 || opcion>1) {
				System.out.println("Opción no válida");
				System.out.println("""
						¿Desea jugar de nuevo?
						
						0. Para salir.
						1. Para confirmar.
						""");
				aux=sc.nextLine();
				opcion=Integer.parseInt(aux);
			}
		}while(opcion!=0);
		
		System.out.println("Gracias por jugar, adiós");
		
	}

}
