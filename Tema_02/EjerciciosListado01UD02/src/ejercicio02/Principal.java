package ejercicio02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double num, den, cero=0, resul = 0;
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga el numerador");
		aux=sc.nextLine();
		num=Double.parseDouble(aux);
		
		System.out.println("Diga el denominador");
		aux=sc.nextLine();
		den=Double.parseDouble(aux);
		
		if(den==cero) {
			System.out.println("Eso no se puede melón");
		}else {
			
			resul=num/den;
			System.out.printf("\nEl resultado es %.2f", resul);
		}
		System.out.println("\nAdiós");	
	}

}
