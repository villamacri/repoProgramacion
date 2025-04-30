package ejercicio21;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		double divisor, dividendo, prod1, prod2, elem1, elem2, numP, resul, cero=0, uno=1;
		String aux;
		
		System.out.println("Bienvenido a mi calculadora");
		
		do {
			System.out.println("""
					¿Que quiere hacer?
					
					0. Salir
					1. Sumar
					2. Restar
					3. Multiplicar
					4. Dividir
					5. Comprobar si el número es par o impar
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Diga un número");
					aux=sc.nextLine();
					elem1=Double.parseDouble(aux);
					
					System.out.println("Diga otro número");
					aux=sc.nextLine();
					elem2=Double.parseDouble(aux);
					
					resul=elem1+elem2;
					
					System.out.printf("\nEl resultado de la suma es %.2f\n", resul);
					break;
					
				case 2:
					System.out.println("Diga un número");
					aux=sc.nextLine();
					elem1=Double.parseDouble(aux);
					
					System.out.println("Diga otro número");
					aux=sc.nextLine();
					elem2=Double.parseDouble(aux);
				
					resul=elem1-elem2;
					
					System.out.printf("\nEl resultado de la resta es %.2f\n", resul);
					break;
					
				case 3:
					System.out.println("Diga un número");
					aux=sc.nextLine();
					elem1=Double.parseDouble(aux);
					
					System.out.println("Diga otro número");
					aux=sc.nextLine();
					elem2=Double.parseDouble(aux);
					
					resul=elem1*elem2;
					
					System.out.printf("\nEl resultado de la multiplicación es %.2f\n", resul);
					break;
					
				case 4:
					System.out.println("Diga el divisor");
					aux=sc.nextLine();
					divisor=Double.parseDouble(aux);
					
					System.out.println("Diga el dividendo");
					aux=sc.nextLine();
					dividendo=Double.parseDouble(aux);
					
					if(dividendo!=cero) {
						resul=divisor/dividendo;
						
						System.out.printf("\nEl resultado de la división es %.2f\n", resul);
					}else {
						System.out.println("Error, el dividendo no puede ser 0");
					}
					break;
					
				case 5:
					System.out.println("Diga el número que quiere comprobar");
					aux=sc.nextLine();
					numP=Double.parseDouble(aux);
					
					resul=numP%2;
					
					if(resul==uno) {
						System.out.println("Es impar");
					}else {
						System.out.println("Es par");
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
