package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double radio, altura;
		String aux;
		Cilindro c=new Cilindro();
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga el radio del cilindro");
		aux=sc.nextLine();
		radio=Double.parseDouble(aux);
		
		System.out.println("Diga la altura del cilindro");
		aux=sc.nextLine();
		altura=Double.parseDouble(aux);
		
		System.out.printf("El volumen del cilindro es %.2fm^3\n", c.calcularVolCilindro(radio, altura));
		
		System.out.println("Adiós");
		
	}

}
