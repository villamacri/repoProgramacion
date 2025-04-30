package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String nombreAsig = null, fecha = null, aux;
		int numAula = 0;
		Cabecera c = new Cabecera(nombreAsig, numAula, fecha);
		
		System.out.println("Diga el nombre de la asignatura");
		nombreAsig=sc.nextLine();
		c.setNombreAsig(nombreAsig);
					
		System.out.println("Diga el número de la clase");
		aux=sc.nextLine();
		numAula=Integer.parseInt(aux);
		c.setNumAula(numAula);
					
		System.out.println("Diga la fecha de hoy");
		fecha=sc.nextLine();
		c.setFecha(fecha);
					
		System.out.println();
		c.imprimirCabecera();
		
	}

}
