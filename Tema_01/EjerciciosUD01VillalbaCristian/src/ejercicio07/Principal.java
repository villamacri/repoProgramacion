package ejercicio07;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double kmRecorridos, precioLitro = 1.653, consumoKm = 0.075, precioTotalViaje;
		String aux;
		
		System.out.println("Bienvenido a mi programa de calculeo");
		System.out.println();
		
		System.out.println("Diga la cantidad de kilometros recorridos");
		aux=sc.nextLine();
		kmRecorridos=Double.parseDouble(aux);
		
		precioTotalViaje = (kmRecorridos * consumoKm)*precioLitro;
		
		System.out.println();
		System.out.printf("El coste del viaje ha sido de %.2f euros, gracias por usar mi programita :)", precioTotalViaje);
		
	}

}
