package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double ladoCuadr, areaCuadr, alturaRec, baseRec, areaRec, diagMayorRom, diagMenorRom, areaRom, dos=2, alturaRomde, baseRomde, areaRomde;
		String aux;
		int opcion = 0;
		
		System.out.println("Bienvenido a mi programa para calcular áreas");
		
		do {
		System.out.println("""
							Elija que tipo de área quiere calcular
							
							0. Salir
							1. Cuadrado
							2. Rectángulo
							3. Rombo
							4. Romboide
							""");
		aux=sc.nextLine();
		opcion=Integer.parseInt(aux);
		
		switch(opcion) {
		
			case 0:
				System.out.println("Saliendo...");
				break;
				
			case 1:
				System.out.println("Diga cuantos metros mide el lado cuadrado");
				aux=sc.nextLine();
				ladoCuadr=Double.parseDouble(aux);
				
				areaCuadr=ladoCuadr*ladoCuadr;
				
				System.out.printf("\nEl cuadrado tiene un área de %.2fm^2\n\n", areaCuadr);
				break;
				
			case 2:
				System.out.println("Diga cuánto mide la altura del rectángulo");
				aux=sc.nextLine();
				alturaRec=Double.parseDouble(aux);
				
				System.out.println("Diga cuánto mide la base del rectángulo");
				aux=sc.nextLine();
				baseRec=Double.parseDouble(aux);
				
				areaRec=alturaRec*baseRec;
				
				System.out.printf("\nEl rectángulo tiene un área de %.2fm^2\n\n", areaRec);
				break;
				
			case 3:
				System.out.println("Diga la longitud de la diagonal mayor");
				aux=sc.nextLine();
				diagMayorRom=Double.parseDouble(aux);
				
				System.out.println("Diga la longitud de la diagonal menor");
				aux=sc.nextLine();
				diagMenorRom=Double.parseDouble(aux);
				
				areaRom=(diagMayorRom*diagMenorRom)/dos;
				
				System.out.printf("\nEl area del rombo es %.2fm^2\n\n", areaRom);
				break;
				
			case 4:
				System.out.println("Diga la longitud de la base del romboide");
				aux=sc.nextLine();
				baseRomde=Double.parseDouble(aux);
				
				System.out.println("Diga la altura del romboide");
				aux=sc.nextLine();
				alturaRomde=Double.parseDouble(aux);
				
				areaRomde=baseRomde*alturaRomde;
				
				System.out.printf("\nEl area del romboide es %.2fm^2\n\n", areaRomde);
				break;
			
				default:
					System.out.println("Opción no válida, por favor repita la operación");
		
		}
		
		}while(opcion!=0);
		
	}

}
