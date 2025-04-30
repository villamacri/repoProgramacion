package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Variables
		
		double precioInicial, desc, precioFinal = 0, cien = 100;
		String aux;
		
		//Lectura por teclado
		
		System.out.println("Bienvenido a mi tienda");
		
		System.out.println();
		
		System.out.println("Diga precio del producto");
		aux=sc.nextLine();
		precioInicial=Double.parseDouble(aux);
		
		System.out.println();
		
		System.out.println("Diga el porcentaje de descuento");
		aux=sc.nextLine();
		desc=Double.parseDouble(aux);
		
		//Operacion
		
		precioFinal = precioInicial - (precioInicial * (desc/cien));
		
		
		//Imprimir en pantalla
		
		System.out.println();
		System.out.printf("El precio del producto con el descuento es %.2f euros", precioFinal);
		System.out.println();
		System.out.println("///////////////////////////////////");
		System.out.println("Gracias por utilizar mi programa :)");
		System.out.println("///////////////////////////////////");
		
		
		
	}

}
