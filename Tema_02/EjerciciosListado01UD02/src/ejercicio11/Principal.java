package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double precioVip = 15.00, precio3d = 12.00, precioNormal = 8.50, precioInf = 4.50, precioTotal;
		int opcion = 0, cantEntr;
		String aux, peli1="Oppenheimer", peli2="Avatar: El Sentido Del Agua", peli3="El Señor De los Anillos: Las Dos Torres", peli4="Del Revés 2";
	
		System.out.println("Bienvenido a mi humilde cine\n");
		
			System.out.println("""
							Elija la sala que desea.
								
							0. Salir del menú
							1. Sala Vip
							2. Sala 3D
							3. Sala Estándar
							4. Sala Infantil
							""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					
				case 1:
					System.out.println("Sala Vip, " + peli1);
					System.out.println("Precio entrada: " + precioVip + "€");
					
					System.out.println("Diga cuantas entradas desea.");
					aux=sc.nextLine();
					cantEntr=Integer.parseInt(aux);
					
					precioTotal=cantEntr*precioVip;
					
					System.out.printf("\nImporte total de %.2f€\n", precioTotal);
					break;
					
				case 2:
					System.out.println("Sala 3D, " + peli2);
					System.out.println("Precio entrada: " + precio3d + "€");
					
					System.out.println("Diga cuantas entradas desea.");
					aux=sc.nextLine();
					cantEntr=Integer.parseInt(aux);
					
					precioTotal=cantEntr*precio3d;
					
					System.out.printf("\nImporte total de %.2f€\n", precioTotal);
					break;
					
				case 3:
					System.out.println("Sala Estándar, " + peli3);
					System.out.println("Precio entrada: " + precioNormal + "€");
					
					System.out.println("Diga cuantas entradas desea.");
					aux=sc.nextLine();
					cantEntr=Integer.parseInt(aux);
					
					precioTotal=cantEntr*precioNormal;
					
					System.out.printf("\nImporte total de %.2f€\n", precioTotal);
					break;
					
				case 4:
					System.out.println("Sala Infantil, " + peli4);
					System.out.println("Precio entrada: " + precioInf + "€");
					
					System.out.println("Diga cuantas entradas desea.");
					aux=sc.nextLine();
					cantEntr=Integer.parseInt(aux);
					
					precioTotal=cantEntr*precioInf;
					
					System.out.printf("\nImporte total de %.2f€\n", precioTotal);
					break;
					
					default:
						System.out.println("Opción no válida.");
			
			}
		
			System.out.println("\nAdiós");
	}

}
