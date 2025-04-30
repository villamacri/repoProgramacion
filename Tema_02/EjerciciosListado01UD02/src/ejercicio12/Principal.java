package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double eqMerc=0.38, eqVen=0.91, eqTier=1.00, eqMart=0.38, eqJup=2.53, eqSat=1.06, eqUra=0.92, eqNep=1.2, peso;
		int opcion=0, opcion2=0;
		String aux;
		
		System.out.println("Bienvenido a mi programa de calcular pesos por ahí");
		
		do{	
			System.out.println("""
					Indique que desea hacer
					
					0. Salir
					1. Decir peso y empezar a jugar
					""");
			aux=sc.nextLine();
			opcion2=Integer.parseInt(aux);
			
			if(opcion2!=0) {
						System.out.println("Diga su peso");
						aux=sc.nextLine();
						peso=Double.parseDouble(aux);
						
				
					do {
						System.out.println("""
								\nElija un planeta
								
								0. Para salir
								1. Mercurio
								2. Venus
								3. Tierra
								4. Marte
								5. Júpiter
								6. Saturno
								7. Urano
								8. Neptuno
								""");
						aux=sc.nextLine();
						opcion=Integer.parseInt(aux);
						
						switch(opcion) {
							
							case 0:
								System.out.println("Saliendo...");
								break;
								
							case 1:
								peso*=eqMerc;
								System.out.printf("\nSu peso en Mercurio es %.2fKg\n", peso);
								break;
								
							case 2:
								peso*=eqVen;
								System.out.printf("\nSu peso en Venus es %.2fKg\n", peso);
								break;
								
							case 3:
								
								peso*=eqTier;
								System.out.printf("\nSu peso en La Tierra es %.2fKg\n", peso);
								break;
								
							case 4:					
								peso*=eqMart;
								System.out.printf("\nSu peso en Marte es %.2fKg\n", peso);
								break;
								
							case 5:
								peso*=eqJup;
								System.out.printf("\nSu peso en Júpiter es %.2fKg\n", peso);
								break;
								
							case 6:
								peso*=eqSat;
								System.out.printf("\nSu peso en Saturno es %.2fKg\n", peso);
								break;
								
							case 7:
								peso*=eqUra;
								System.out.printf("\nSu peso en Urano es %.2fKg\n", peso);
								break;
								
							case 8:
								peso*=eqNep;
								System.out.printf("\nSu peso en Mercurio es %.2fKg\n", peso);
								break;
								
							default:
								System.out.println("Opcion no válida, elija de nuevo");
								break;
								
							}
							
						}while(opcion!=0);
						
			}
			}while(opcion2!=0);
		
		System.out.println("\nAdiós");
		
					
	}

}
