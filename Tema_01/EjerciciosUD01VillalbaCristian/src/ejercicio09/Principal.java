package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int habNavas;
		double  navas, aforoCampNou = 99354, estadioOliU2 = 65000, localTeatro = 600;
		String aux;
		
		System.out.println("Bienvenido a mi programa de navas");
		System.out.println();
		System.out.println("Diga los habitantes actuales del pueblo Las Navas");
		aux=sc.nextLine();
		habNavas=Integer.parseInt(aux);
		
		navas = aforoCampNou/habNavas;
		System.out.println();
		System.out.printf("El Camp Nou tiene %.2f navas", navas);
		
		navas = estadioOliU2/habNavas;
		System.out.println();
		System.out.printf("El estadio olímpico tiene %.2f navas", navas);
		
		navas = localTeatro/habNavas;
		System.out.println();
		System.out.printf("El teatro tiene %.2f navas", navas);
		
		System.out.println();
		System.out.println();
		System.out.println("Gracias por utilizar mi programa :)");
	}

}
