package ejercicio04;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int tam=20, opcion=0, codLeido;
		String aux;
		
		Cliente [] listado=new Cliente[tam];
		
		Cliente c1=new Cliente(001, "X4171123G", "Cristian", "Villalba Marín", true, 85.00, 1.84 );
		Cliente c2=new Cliente(002, "12345678Y", "Jaime", "Alemany", false, 70.00, 1.83 );
		
		Gimnasio g=new Gimnasio(listado, 2);
		
		listado[0]=c1;
		listado[1]=c2;
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Elija una opción
						
					0. Para salir.
					1. Calcular IMC de un cliente.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Introduzca el código de un cliente");
					aux=sc.nextLine();
					codLeido=Integer.parseInt(aux);
					
					
			
			}
		}while(opcion!=0);
				
		
	}

}
