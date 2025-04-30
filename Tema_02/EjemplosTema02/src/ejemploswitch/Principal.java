package ejemploswitch;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		String aux;
		
		System.out.println("Bienvenido a mi selección de módulos para convalidar.");
		
		
		do {
		System.out.println("""
							Elija la asignatura que quiere convalidar
							
							0. Salir
							1. Base de datos
							2. Lenguaje de marcas
							3. Programación
							4. Entornos
							""");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
			switch(opcion) {
		
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Entendido, adiós JL");
					break;
					
				case 2:
					System.out.println("Menos mal, Rafa está bien pero muy zzz a veces");
					break;
					
				case 3:
					System.out.println("Ángel mola tío...");
					break;
					
				case 4:
					System.out.println("No es difícil, pero con Luismi la cosa cambia");
					break;
					
					default:
						System.out.println("Inútil hasta para elegir, repita anda...");
						break;
			
		
		}
		
		}while(opcion!=0);
		
	}

}
