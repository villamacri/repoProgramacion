package ejercicio06;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		double sueldo, precioHoraNormal, precioHoraExtr;
		int horasTrab, horasExtr; //yo había usado double para las horas por que alomejor un dia no trabajas un número de horas exactas
		String aux;
		
		System.out.println("Bienvenido a mi programa de cálculo de nómina");
		System.out.println();
	
		System.out.println("Diga horas trabajadas");
		aux=sc.nextLine();
		horasTrab=Integer.parseInt(aux);
		
		System.out.println("Diga el pago de la hora");
		aux=sc.nextLine();
		precioHoraNormal=Double.parseDouble(aux);
		

		
		System.out.println("Diga cantidad de horas extras, escriba 0 si no tiene");
		aux=sc.nextLine();
		horasExtr=Integer.parseInt(aux);
		
		System.out.println("Diga precio de la hora extra");
		aux=sc.nextLine();
		precioHoraExtr=Double.parseDouble(aux);
		
		sueldo=(precioHoraNormal*horasTrab)+(precioHoraExtr*horasExtr);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.printf("Horas Trabajadas\tPrecio Hora Normal\tHoras Extras\tPrecio Hora Extra\tTotal\n");
		System.out.printf("\n%dh\t\t\t%.2f€\t\t\t%dh\t\t%.2f€\t\t\t%.2f€\n", horasTrab, precioHoraNormal, horasExtr, precioHoraExtr, sueldo);
		System.out.println("----------------------------------------------------------------------------------------------------------------");
		System.out.println();
		
		System.out.printf("\nSu nómina es de %.2f€, gracias por usar mi programa :)", sueldo);
		
		/*
		 * 				Toñete		Yo
		 *Variables		6.5			9
		 *Operaciones	10			10
		 *Impresiones	7			8
		 * */
	}

}
