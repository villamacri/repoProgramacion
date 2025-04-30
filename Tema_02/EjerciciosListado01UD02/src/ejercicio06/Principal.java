package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		double notaProg, notaBdd, notaLdm, notaMedia, numAsig=3, topeAprobado=5;
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga la nota de programación");
		aux=sc.nextLine();
		notaProg=Double.parseDouble(aux);
		
		System.out.println("Diga la nota de base de datos");
		aux=sc.nextLine();
		notaBdd=Double.parseDouble(aux);
		
		System.out.println("Diga la nota de lenguaje de marcas");
		aux=sc.nextLine();
		notaLdm=Double.parseDouble(aux);
		
		notaMedia=(notaProg+notaBdd+notaLdm)/numAsig;
		
		if(notaMedia>=topeAprobado) {
			System.out.printf("\nEnhorabuena, esta usted aprobado en DAM con una nota de %.2f máquina.", notaMedia);
		}else {
			System.out.printf("A recuperar este %.2f. Valiente truño.", notaMedia);
		}
		
		System.out.println("\nAdios.");
		
	}

}
