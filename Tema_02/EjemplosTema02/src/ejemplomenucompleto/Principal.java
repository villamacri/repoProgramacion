package ejemplomenucompleto;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int opcion = 0;
		String aux;
		
		System.out.println("Hola, ejemplo menú completo");
		System.out.println("\nIntroduzca un número según la opción deseada\n");
		
		do {
			
			System.out.println("""
					0. Para salir
					1. Refranes
					2. Titulos de canciones
					3. Frases hechas
					""");
			
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Estos son refranes");
					break;
					
				case 2:
					System.out.println("Estos son titulos");
					break;
					
				case 3:
					System.out.println("Esto son frases hechas");
					break;
					
				default:
					System.out.println("Opción no válida, elija de nuevo");
					break;
			}
			
			
		}while(opcion!=0);
		
	}

}
