package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double saldoI, saldoF, manten, inter, cien=100;
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga su saldo inicial");
		aux=sc.nextLine();
		saldoI=Double.parseDouble(aux);
		
		System.out.println("Diga el porcentaje de mantenimiento");
		aux=sc.nextLine();
		manten=Double.parseDouble(aux);
		
		saldoF=saldoI-(saldoI*(manten/cien));
		
		System.out.println("Diga el porcentaje de intereses");
		aux=sc.nextLine();
		inter=Double.parseDouble(aux);
		
		saldoF+=(saldoI*(inter/cien));
		
		System.out.println();
		System.out.printf("Saldo Inicial\tIntereses\tMantenimiento\tSaldo Final");
		System.out.printf("\n%.2f€\t\t%.2f%%\t\t%.2f%%\t\t%.2f€", saldoI, inter, manten, saldoF);
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("\nAdiós, gracias por usar mi programa.");
		
	}

}
