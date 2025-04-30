package ejercicio17;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int  numAsig=6, asigSus=0, opcion=0;
		double nota, sumaNota=0, aprobado=5.0, media;
		String aux, alumno;
		
		System.out.println("Bienvenido a mi programa para calcular medias y suspensos");
		
		do {
		
			System.out.println("Diga nombre del alumno");
			alumno=sc.nextLine();
			
			for (int i = 0; i < numAsig; i++) {
				
				System.out.println("Diga una nota");
				aux=sc.nextLine();
				nota=Double.parseDouble(aux);
				
				if(nota<aprobado) {
					asigSus++;
				}
				
				sumaNota+=nota;
				
			}
			
			media=sumaNota/numAsig;
			
			System.out.printf("\nLa media del alumno %s es %.2f, con un total de %d suspensos", alumno, media, asigSus);
			
			System.out.println("""
					¿Desea continuar?
					
					Pulse 0 para confirmar.
					Pulse cualquier otro número para salir.  
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			
		}while(opcion==0);
		
	}

}

