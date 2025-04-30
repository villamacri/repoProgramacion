package ejercicio20;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0, cantidadEntradas;
		double saldo=3000.00, pago, retirar, ingresar, precioEntrada, precioTotal, cero=0;
		String aux;
		
		System.out.println("Bienvenido al Banco de Hierro");
		
		do {
			System.out.println("""
					Elija que desea hacer
					
					0. Para salir
					1. Para ver saldo
					2. Retirar dinero
					3. Comprar entradas
					4. Ingresar dinero
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.printf("\nSu saldo actual es de %.2f€\n", saldo);
					break;
					
				case 2:
					System.out.println("Diga cuanto dinero quiere retirar");
					aux=sc.nextLine();
					retirar=Double.parseDouble(aux);
					
					if(retirar>saldo || retirar<=0) {
						System.out.println("Operación no válida");
					}else {
						saldo-=retirar;
					}
					break;
					
				case 3:
					System.out.println("Diga cuantas entradas quiere");
					aux=sc.nextLine();
					cantidadEntradas=Integer.parseInt(aux);
					
					System.out.println("Diga precio de la entrada");
					aux=sc.nextLine();
					precioEntrada=Double.parseDouble(aux);
					
					precioTotal=precioEntrada*cantidadEntradas;
					
					System.out.printf("""
							\nPrecio Entrada		Cantidad	Precio Total
							   %.2f€		   %d		   %.2f€
							\n""", precioEntrada, cantidadEntradas, precioTotal);
					
					if(precioTotal<=saldo && precioTotal>cero) {
						saldo-=precioTotal;
					}else {
						System.out.println("Operación no válida");
					}
					break;
					
				case 4:
					System.out.println("Diga cuánto quiere ingresar");
					aux=sc.nextLine();
					ingresar=Double.parseDouble(aux);
					
					saldo+=ingresar;
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Adiós");
		
	}

}
