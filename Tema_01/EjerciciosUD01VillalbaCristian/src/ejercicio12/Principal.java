package ejercicio12;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String empleado="John Snow", aux;
		double precioCoca, precioPipas, precioEspada, dinPago, sumaPrecio, devol;
		int cantCoca, cantPipas, cantEspada; 
		
		System.out.println("Bienvenido");
		System.out.println();
		
		//Coca
		System.out.println("Diga precio de la coca-cola");
		aux=sc.nextLine();
		precioCoca=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad");
		aux=sc.nextLine();
		cantCoca=Integer.parseInt(aux);
		
		sumaPrecio = precioCoca * cantCoca;
		
		//Pipas
		System.out.println("Diga precio de las pipas");
		aux=sc.nextLine();
		precioPipas=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad");
		aux=sc.nextLine();
		cantPipas=Integer.parseInt(aux);
		
		sumaPrecio += precioPipas * cantPipas;
		
		//Espada
		System.out.println("Diga precio espada 'Garra'");
		aux=sc.nextLine();
		precioEspada=Double.parseDouble(aux);
		
		System.out.println("Diga la cantidad");
		aux=sc.nextLine();
		cantEspada=Integer.parseInt(aux);
		
		sumaPrecio += precioEspada * cantEspada;
		
		
		System.out.println();
		
		//Usar /t para tabular y /n para salto de linea
		
		System.out.println("**********************TICKET**********************");
		System.out.println();
		System.out.println("Producto\tPrecio\t\tCantidad");
		System.out.printf("\nCoca-Cola\t%.2f€\t\t%d", precioCoca, cantCoca);
		System.out.printf("\n\nPipas\t\t%.2f€\t\t%d", precioPipas, cantPipas);
		System.out.printf("\n\nEspada 'Garra'\t%.2f€\t\t%d", precioEspada, cantEspada);
		System.out.printf("\n--------------------------------------------------");
		System.out.printf("\nTotal: %.2f€", sumaPrecio);
		System.out.println();
		
		System.out.println();
		System.out.println("Diga cantidad con la que va a pagar");
		aux=sc.nextLine();
		dinPago=Double.parseDouble(aux);
		
		devol=dinPago-sumaPrecio;
		/*System.out.printf("""
							Producto		Precio		Cantidad
							
							Coca-cola		%.2f€		%d		
							
							Pipas			%.2f€		%d
							
							Espada 'Garra'		%.2f€		%d
							--------------------------------------------------
							Total: %.2f€
							""", precioCoca, cantCoca, precioPipas, cantPipas, precioEspada, cantEspada, sumaPrecio);*/
		System.out.println();
		System.out.printf("Su cambio es de %.2f€\n", devol);
		System.out.println("Fue atendido por " + empleado + ", gracias por su compra :)");
	}

}
