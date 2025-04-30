package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion;
		double saldo = 0.0, ingreso, retiro, valorDol=1.05;
		String nombre = "Cristian Villalba", aux;
		
		CuentaCorriente c=new CuentaCorriente(saldo, nombre);
		
		System.out.println("Bienvenido al control de su cuenta corriente");
		
		do {
			System.out.println("""
					¿Que desea hacer?
					
					0. Salir.
					1. Ingresar.
					2. Retirar.
					3. Convertir a dolares.
					4. Consultar saldo.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Diga cuanto quiere ingresar a la cuenta");
					aux=sc.nextLine();
					ingreso=Double.parseDouble(aux);
					
					c.ingresarDin(ingreso);
					System.out.println("Operación realizada.");
					break;
					
				case 2:
					System.out.println("Diga cuanto quiere retirar de la cuenta");
					aux=sc.nextLine();
					retiro=Double.parseDouble(aux);
					
					while(retiro>c.getSaldo()||retiro <=0) {
						if(retiro>c.getSaldo()) {
							System.out.println("Error, saldo insuficiente en la cuenta");
							System.out.println("Diga cuanto quiere retirar de la cuenta");
							aux=sc.nextLine();
							retiro=Double.parseDouble(aux);
						}if(retiro<=0) {
							System.out.println("Cantidad introducida no válida");
							System.out.println("Diga cuanto quiere retirar de la cuenta");
							aux=sc.nextLine();
							retiro=Double.parseDouble(aux);
						}
					}
					c.retirarDin(retiro);
					System.out.println("Operación realizada.");
					break;
					
				case 3:
					System.out.println("Realizando conversión...");
					System.out.printf("El valor de su saldo en dólares es: %.2f\n", c.calcularDolar(valorDol));
					break;
				case 4:
					c.imprimirSaldo();
					break;
					
					default:
						System.out.println("Opcion no válida");
			}
			
			
		}while(opcion!=0);
		
		System.out.println("Gracias por usar mi programa, adiós");
		
	}

}
