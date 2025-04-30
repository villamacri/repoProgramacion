package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double espRecor, velC = 3.2, tiempo, espIni=0;
		String aux;
		
		System.out.println("Bienvenido a mi programa de calculeo para una chancla");
		
		System.out.println("\nDiga el tiempo del recorrido que desea saber en segundos");
		aux=sc.nextLine();
		tiempo=Double.parseDouble(aux);
		
		espRecor=espIni+velC*tiempo;
		
		System.out.println("El espacio recorrido en " + tiempo + "s es de " + espRecor + "m");
		System.out.println("\nGracias por usar mi programa, hasta otra.");
		
	}

}
