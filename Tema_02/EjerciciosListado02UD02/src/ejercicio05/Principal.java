package ejercicio05;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int tam = 0, mayor = 0, menor = 0, valorAleat, hasta, desde, suma = 0, elemP = 0, valorN = 0;
		
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga el tamaño del listado");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		int [] listadoEnteros = new int[tam];
		
		System.out.println("Diga desde donde quiere empezar el listado");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Diga hasta donde quiere llegar");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		for (int i = 0; i < tam; i++) {
			valorAleat=rnd.nextInt(hasta-desde+1)+desde;
			
			listadoEnteros[i]=valorAleat;
		}
		
		for (int i = 0; i < tam; i++) {
			System.out.printf("%d\t", listadoEnteros[i]);
		}
		
		for (int i = 0; i < tam; i++) {
			suma+=listadoEnteros[i];
		}
		System.out.println("\nLa suma de todos los elementos es " + suma);
		
		for (int i : listadoEnteros) {
			if(menor>i || menor==0) {
				menor=i;
			}if(mayor<i) {
				mayor=i;
			}
		}
		
		System.out.println("El elemento mayor es " + mayor + " y el menor es " + menor);
		
		System.out.println();
		
		for (int i = 0; i < tam; i++) {
			System.out.print("Elemento " + (i+1) + "\t");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < listadoEnteros.length; i++) {
			System.out.print("   " + listadoEnteros[i] + "\t\t");
		}
		System.out.println("\n¿Qué elemento quiere cambiar?");
		aux=sc.nextLine();
		elemP=Integer.parseInt(aux);
		
		while(elemP<1 || elemP>listadoEnteros.length) {
			System.out.println("Opción no válida, elija otro");
			aux=sc.nextLine();
			elemP=Integer.parseInt(aux);
		}
		
		System.out.println("Diga el nuevo valor\n");
		aux=sc.nextLine();
		valorN=Integer.parseInt(aux);
		
		listadoEnteros[elemP-1]=valorN;
		
		for (int i = 0; i < listadoEnteros.length; i++) {
			System.out.print(listadoEnteros[i] + "\t");
		}
	}

}
