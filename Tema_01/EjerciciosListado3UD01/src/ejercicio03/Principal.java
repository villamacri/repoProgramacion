package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double sumaTotal, sumaPrecioHam, precioHam, sumaPrecioPat, precioPat, sumaPrecioRefr, precioRefr;
		int cantHamb, cantPat, cantRefr;
		String aux, fecha, empleado="Cristian", prod1="Hamburguesas", prod2="Patatas", prod3="Refrescos";
		
		System.out.println("Bienvenido a mi programa de ticket Mcdonald's");
		
		System.out.println("Diga la fecha del pedido");
		fecha=sc.nextLine();
		
		//Hamburguesas
		System.out.println("Diga precio de la hamburguesa");
		aux=sc.nextLine();
		precioHam=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad de hamburguesas");
		aux=sc.nextLine();
		cantHamb=Integer.parseInt(aux);
		
		sumaPrecioHam= precioHam*cantHamb;
		
		//Patatas
		System.out.println("Diga precio de las patatas");
		aux=sc.nextLine();
		precioPat=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad de patatas");
		aux=sc.nextLine();
		cantPat=Integer.parseInt(aux);
		
		sumaPrecioPat=precioPat*cantPat;
		
		//Refrescos
		System.out.println("Diga el precio de los refrescos");
		aux=sc.nextLine();
		precioRefr=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad de refrescos");
		aux=sc.nextLine();
		cantRefr=Integer.parseInt(aux);
		
		sumaPrecioRefr=precioRefr*cantRefr;
		
		//Operacion de la suma total
		
		sumaTotal=sumaPrecioHam+sumaPrecioPat+sumaPrecioRefr;
		
		System.out.println("**********************************Ticket**********************************");
		System.out.println("Ingresó como "+empleado+" a la fecha de "+fecha+".\n");
		System.out.println("Producto\tPrecio ud.\tCantidad\tPrecio Unitario");
		System.out.printf("\n"+prod1+" \t%.2f€\t\t%d ud.\t\t%.2f€", precioHam, cantHamb, sumaPrecioHam);
		System.out.printf("\n\n"+prod2+"\t\t%.2f€\t\t%d ud.\t\t%.2f€", precioPat, cantPat, sumaPrecioPat);
		System.out.printf("\n\n"+prod3+"\t%.2f€\t\t%d ud.\t\t%.2f€", precioRefr, cantRefr, sumaPrecioRefr);
		System.out.println("\n-------------------------------------------------------------------------");
		System.out.printf("\nTotal: %.2f€", sumaTotal);
		System.out.println("\nGracias por usar mi programa.");
	}

}
