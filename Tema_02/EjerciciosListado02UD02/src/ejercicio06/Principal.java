package ejercicio06;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rnd = new Random(System.nanoTime());
		
		int tam = 12;
		double desde=800.00, hasta=2000.00;
		
		double [] listadoPrecios;
		String [] listadoMeses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		
		listadoPrecios = new double[tam];
		
		System.out.println("Bienvenido");
		
		for (int i = 0; i < listadoMeses.length; i++) {
			System.out.print(listadoMeses[i] + "\t\t");
		}
		System.out.println();
		System.out.println();
		for (int i = 0; i < listadoPrecios.length; i++) {
			
			listadoPrecios[i]=rnd.nextDouble(hasta-desde+1)+desde;
			
			System.out.printf("%.2f€\t\t", listadoPrecios[i]);
		}
		
		System.out.println("\n\nAdiós");
	}

}
