package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double sumaTotal, costeFabr, porcGan, impEst, cien=100, ganancia, impuestos;
		String aux;
		
		System.out.println("Bienvenido a mi programa de cálculo para automóviles");
		System.out.println();
		
		System.out.println("Diga el coste de fabricación");
		aux=sc.nextLine();
		costeFabr=Double.parseDouble(aux);
		
		System.out.println("Diga el porcentaje de ganancia que desea");
		aux=sc.nextLine();
		porcGan=Double.parseDouble(aux);
		
		System.out.println("Diga el porcentaje de impuestos estatales aplicables");
		aux=sc.nextLine();
		impEst=Double.parseDouble(aux);
		
		
		//Para el examen hay que guardar os resultados en nuevas variables.
		ganancia=costeFabr*(porcGan/cien);
		impuestos=costeFabr*(impEst/cien);
		sumaTotal=costeFabr + ganancia + impuestos;
		
		System.out.println("Resultados de los cálculos");
		
		System.out.println("\nCoste de fabricación\t\tPorcentaje de ganancia\t\tImpuestos estatales");
		System.out.printf("%.2f€\t\t\t%.2f€\t\t\t%.2f€", costeFabr, ganancia, impuestos);
		System.out.printf("\n\nPrecio de venta: %.2f€",sumaTotal);
		
		System.out.println("\n-----------------------------------------------------------------------------------");
		System.out.println("\nGracias por usar mi programa :D");
				
		
		
	}

}
