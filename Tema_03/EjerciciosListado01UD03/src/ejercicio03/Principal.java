package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		int num, opcion = 0;
		String aux;
		boolean paridad, estado;
		Operaciones o=new Operaciones();
		
		System.out.println("Bienvenido");
		do {
			System.out.println("Diga un número entero");
			aux=sc.nextLine();
			num=Integer.parseInt(aux);
		
			System.out.println("""
					¿Qué desea hacer?
					
					0. Para salir.
					1. Para comprobar si es positivo o negativo.
					2. Para comprobar la paridad.
					""");
			aux= sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion){
				
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					estado=o.positivoNegativo(num);
					o.imprimirResul(estado);
					break;
					
				case 2:
					paridad = o.comprobarParidad(num);
					o.imprimirParidad(paridad);
					break;
					
					default:
						System.out.println("Opción no válida");
				
			}
		
		}while(opcion!=0);
		
		System.out.println("Adiós");
		
	}

}
