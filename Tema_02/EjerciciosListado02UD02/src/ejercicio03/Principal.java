package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int tam=8, contCero = 0, numLec, cero = 0;
		double suma = 0, media = 0;
		String aux;
		int [] listadoNumeros = new int[tam];
		
		System.out.println("Bienvenido");
		
		for (int i = 0; i < tam; i++) {
			System.out.println("Diga el número "+(i+1)+": ");
			aux=sc.nextLine();
			numLec=Integer.parseInt(aux);
			
			suma+=numLec;
			if(numLec==cero) {
				contCero++;
			}
		}
		media=suma/listadoNumeros.length;
		
		System.out.printf("\nLa media de todos los elementos es %.2f y la cantidad de ceros introducidos es %d", media, contCero);
		System.out.println("\nAdiós");
		
	}

}
