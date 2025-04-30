package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double num, exp, cero=0, result, uno=1;
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga número");
		aux=sc.nextLine();
		num=Double.parseDouble(aux);
		
		System.out.println("Diga el exponente");
		aux=sc.nextLine();
		exp=Double.parseDouble(aux);
		
		if(exp>=cero) {
			result=Math.pow(num, exp);
			
			System.out.printf("\nEl resultado es %.2f", result);
		}
		if(exp<cero) {
			result=uno/Math.pow(num, -exp);
			System.out.printf("\nEl resultado es %.2f", result);
		}
		System.out.println("\nAdiós");
		
	}

}
