package ejemplollamadas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int num1=0;
		double num2=0.0, suma=0.0;
		String aux;
		
		Numero n = new Numero();
		
		System.out.println("Diga el primer número a sumar");
		aux=sc.nextLine();
		num1=Integer.parseInt(aux);
		
		System.out.println("Diga el segundo número");
		aux=sc.nextLine();
		num2=Double.parseDouble(aux);
		
		suma=n.sumar(num1, num2);
		
		System.out.println("El resultado es: "+suma);
		
	}

}
