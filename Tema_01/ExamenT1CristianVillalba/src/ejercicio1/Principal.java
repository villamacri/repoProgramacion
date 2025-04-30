package ejercicio1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		
		double dinPed, cuotMens, inter = 3.5, cien=100, tipoInter, dos=2, dinDev;
		int numAnios, doce=12, cuotTotales;
		String aux, nombre;
		
		System.out.println("Bienvenido a mi programa de calculo de hipoteca");
		
		System.out.println("\nDiga la cantidad de dinero que desea pedir prestado");
		aux=sc.nextLine();
		dinPed=Double.parseDouble(aux);
		
		System.out.println("Diga a cuantos años desea pagar la hipoteca");
		aux=sc.nextLine();
		numAnios=Integer.parseInt(aux);
		
		tipoInter= dinPed * (inter/cien);
		
		dinDev=dinPed+tipoInter;
		
		cuotTotales= numAnios*doce;
		
		cuotMens=(dinPed*inter)/(cuotTotales*dos);
		
		System.out.println("Ingrese su nombre y apellidos completo");
		nombre=sc.nextLine();
		
		System.out.println("***************************Ticket de la hipoteca***************************");
		System.out.println("Nombre completo: " + nombre+".");
		System.out.printf("\nDinero préstamo: %.2f€", dinPed);
		System.out.printf("\nNúmero de cuotas: %d", cuotTotales);
		System.out.printf("\nInterés: %.1f%%", inter);
		System.out.printf("\nDinero a devolver: %.2f€", dinDev);
		System.out.printf("\nPago mensual: %.2f€", cuotMens);
		System.out.println("\n***************************************************************************");
		System.out.println("Adiós, gracias por usar mi programa.");
	}

}
