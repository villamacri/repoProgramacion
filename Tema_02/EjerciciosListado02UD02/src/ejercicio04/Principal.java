package ejercicio04;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		Random rnd = new Random();
		
		int tam = 10, valorAleat, buscado, hasta=99, desde=1, elementoL=0;
		double suma = 0, media = 0;
		String aux;
		int [] listadoNumeros = new int[tam];
		
		System.out.println("Bienvenido");
		System.out.println();
		
		for (int i = 0; i < tam; i++) {
			
			valorAleat=rnd.nextInt(hasta-desde+1)+desde;
			listadoNumeros[i]=valorAleat;
			suma+=listadoNumeros[i];
		}
		
		media=suma/listadoNumeros.length;
		
		do {
			
		for (int i = 0; i < tam; i++) {
			System.out.printf("Elemento "+(i+1)+"\t");
		}
		
		System.out.println();
		System.out.println();
		for (int i = 0; i < tam; i++) {
			System.out.printf("   %d\t\t", listadoNumeros[i]);
		}
		
		System.out.printf("\n\nLa media de la suma de todos los elementos de la lista es %.2f", media);
		
		System.out.println("\n\nDiga que posicion quiere revisar, 0 para salir");
		aux=sc.nextLine();
		buscado=Integer.parseInt(aux);
		

		
		for (int i = 0; i < tam; i++) {
			
			if(buscado==i+1) {
				
				System.out.println(listadoNumeros[i]);
				System.out.println("Diga nuevo elemento");
				aux=sc.nextLine();
				elementoL=Integer.parseInt(aux);
				
				listadoNumeros[i]= elementoL;
				
			}
		}
		
		}while(buscado!=0);
		
	}

}
