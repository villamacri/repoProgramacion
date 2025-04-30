package ejemplooperacionesarrays;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tam = 0, opcion, nuevoValor, elegida;
		String aux;
		int [] listadoNumeros;
		
		//Pedimos tamaño
		System.out.println("Diga tamaño del listado");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		listadoNumeros=new int[tam];
		
		//Rellenamos el array pidiendo por teclado
		for (int i = 0; i < listadoNumeros.length; i++) {
			System.out.println("Diga un número");
			aux=sc.nextLine();
			listadoNumeros[i]=Integer.parseInt(aux);
		}
		
		//Mostramos
		for (int i = 0; i < listadoNumeros.length; i++) {
			System.out.print(listadoNumeros[i] + "\t");
		}
		
		//Modificar elemento buscado
		/*
		System.out.println("\nDiga el elemento a modificar");
		aux=sc.nextLine();
		elegida=Integer.parseInt(aux);
		
		System.out.println("Diga nuevo valor");
		aux=sc.nextLine();
		nuevoValor=Integer.parseInt(aux);
		
		listadoNumeros[elegida-1]=nuevoValor;
		
		for (int i = 0; i < listadoNumeros.length; i++) {
			System.out.print(listadoNumeros[i] + "\t");
		}
		*/
		
		//Modificar comprobando do while
		do {
			System.out.println("\nDiga el elemento a modificar");
			aux=sc.nextLine();
			elegida=Integer.parseInt(aux);
			
		}while(elegida>listadoNumeros.length || elegida<=0);
		
		System.out.println("Diga nuevo valor");
		aux=sc.nextLine();
		nuevoValor=Integer.parseInt(aux);
		
		listadoNumeros[elegida-1]=nuevoValor;
		
		for (int i = 0; i < listadoNumeros.length; i++) {
			System.out.print(listadoNumeros[i] + "\t");
		}
		
		
		//Modificar comprobando con while
		System.out.println("\nDiga el elemento a modificar");
		aux=sc.nextLine();
		elegida=Integer.parseInt(aux);
		
		while(elegida<1 || elegida>listadoNumeros.length) {
			System.out.println("Inválido, otro");
			aux=sc.nextLine();
			elegida=Integer.parseInt(aux);
		}
		System.out.println("Diga nuevo valor");
		aux=sc.nextLine();
		nuevoValor=Integer.parseInt(aux);
		
		listadoNumeros[elegida-1]=nuevoValor;
		
		for (int i = 0; i < listadoNumeros.length; i++) {
			System.out.print(listadoNumeros[i] + "\t");
		}
		
	}

}
