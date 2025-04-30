package ejerciciolectura;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		short edad;
		double precio;
		String nombre, aux;
		
		System.out.println("Hola, leemos datos");
		System.out.println("Introduzca su nombre");
		nombre=sc.nextLine();
		
		System.out.println("¿Cuál es su edad?");
		aux=sc.nextLine();
		edad=Short.parseShort(aux);
		
		System.out.println("Diga el precio de su tilín");
		aux=sc.nextLine();
		precio=Double.parseDouble(aux);
		
		System.out.println();
		System.out.println();
		System.out.printf("Su tilín vale %.2f€",precio);
		System.out.println();
		System.out.println("Su nombre es " + nombre + ", su edad es " + edad + ", gracias por usar el programita");
		
		
		
		
	}

}
