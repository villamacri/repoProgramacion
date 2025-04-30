package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		double radio, longitud, area, dos=2;
		String aux;
		
		System.out.println("Bienvenido a mi programa para calcular cosas");
		System.out.println();
		System.out.println("Diga el radio de la circunferencia");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		longitud = (dos*radio)*Math.PI;
		area = Math.PI*Math.pow(radio, dos);
		
		System.out.println();
		System.out.printf("La longitud de la circunferencia es %.2f m y el area es %.2f m^2, gracias por utilizar mi programita :)", longitud, area);
	}

}
