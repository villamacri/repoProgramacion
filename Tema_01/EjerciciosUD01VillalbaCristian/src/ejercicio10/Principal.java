package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		double precioFinal, numProductos, precioProduc, desc, sumaPrecios, cien=100;
		String aux;
		
		System.out.println("Bienvenido a mi tienda de mie***");
		
		System.out.println();
		System.out.println("Diga el precio del producto");
		aux=sc.nextLine();
		precioProduc=Double.parseDouble(aux);
		
		System.out.println();
		System.out.println("Diga la cantidad de productos que se va a llevar");
		aux=sc.nextLine();
		numProductos=Double.parseDouble(aux);
		
		System.out.println();
		System.out.println("Diga el descuento que se le aplica");
		aux=sc.nextLine();
		desc=Double.parseDouble(aux);
		
		sumaPrecios = precioProduc*numProductos;
		precioFinal = sumaPrecios - (sumaPrecios*(desc/cien));
		
		System.out.println();
		System.out.printf("El precio de su compra con descuento es de %.2f€", precioFinal);
		System.out.println();
		System.out.println();
		System.out.println("Gracias por usar el programita :D");
		
	}

}
