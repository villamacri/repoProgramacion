package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String aux;
		double radio = 0.0;
		
		Circulo c1 = new Circulo(radio);
		
		System.out.println("Bienvenido");
		System.out.println();
		System.out.println("Diga el radio en cm del circulo");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		c1.setRadio(radio);
		
		System.out.printf("El circulo tiene un área de %.2fcm^2\n", c1.calcularAreaCm());
		System.out.printf("Si se pasa a m^2 tendría un área de %.4fm^2\n", c1.calcularAreaM());
		
		System.out.println("Adiós");
	}

}
