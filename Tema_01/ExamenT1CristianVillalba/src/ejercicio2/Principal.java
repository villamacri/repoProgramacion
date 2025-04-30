package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		double pago, cambio, precioTotalTodo, todoMasIva, pagoCar, pagoTotalCar, pagoConElec, pagoTotalElec, pagoPers, pagoTotalPers, iva=21, pagoBar=182.50, descParo, cien=100;
		int cantDias, numPersonas;
		String aux;
		
		System.out.println("Bienvenido a mi programa de derroche en vacaciones 'Monstruos del Java'");
		
		System.out.println("Diga cuantos días se queda");
		aux=sc.nextLine();
		cantDias=Integer.parseInt(aux);
		
		System.out.println("Diga el pago por día de la caravana");
		aux=sc.nextLine();
		pagoCar=Double.parseDouble(aux);
		
		pagoTotalCar=pagoCar*cantDias;
		
		System.out.println("Diga el pago por día del servicio eléctrico");
		aux=sc.nextLine();
		pagoConElec=Double.parseDouble(aux);
		
		pagoTotalElec=pagoConElec*cantDias;
		
		System.out.println("Diga cuántas personas son");
		aux=sc.nextLine();
		numPersonas=Integer.parseInt(aux);
		
		System.out.println("Diga el pago por persona");
		aux=sc.nextLine();
		pagoPers=Double.parseDouble(aux);
		
		pagoTotalPers=pagoPers*numPersonas*cantDias;
		
		precioTotalTodo=pagoTotalCar+pagoTotalElec+pagoTotalPers+pagoBar;
		todoMasIva=precioTotalTodo+(precioTotalTodo*(iva/100));	
		
		System.out.println("**************************************************Ticket*************************************************");
		System.out.println("Nombre Servicio\t\tNúmero de Personas\t\tDías\tPrecio por Día\t\tPrecio Total");
		System.out.printf("\nServicio Caravana\t\t%d\t\t\t%d\t%.2f€\t\t\t%.2f€",numPersonas, cantDias, pagoCar, pagoTotalCar);
		System.out.printf("\nServicio Eléctrico\t\t%d\t\t\t%d\t%.2f€\t\t\t%.2f€", numPersonas, cantDias, pagoConElec, pagoTotalElec);
		System.out.printf("\nServicio Bar\t\t\t---\t\t\t---\t---\t\t\t%.2f€", pagoBar);
		System.out.printf("\n///////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.printf("\n\nPago por persona: %.2f€", pagoPers);
		System.out.printf("\n\nTotal: %.2f€", precioTotalTodo);
		System.out.printf("\nTotal I.V.A incluido: %.2f€", todoMasIva);
		System.out.printf("\n//////////////////////////////////////////////////////////////////////////////////////////////////////");
		
		System.out.println("\n\nDiga el porcentaje de descuento que se le aplica por no dar un palo al agua");
		aux=sc.nextLine();
		descParo=Double.parseDouble(aux);
		
		todoMasIva-=(todoMasIva*(descParo/cien));
		
		System.out.printf("\nTotal con descuento: %.2f€",todoMasIva);
		System.out.printf("\n-------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n\nIntroduzca el pago del recibo");
		aux=sc.nextLine();
		pago=Double.parseDouble(aux);
		
		cambio=pago-todoMasIva;
		
		System.out.printf("\nSu cambio es de %.2f€", cambio);
		System.out.println("\n\nGracias por usar mi programa :D");
	}

}
