package ejercicio09;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int boletoComp = 0, opcion, numPrem = 0;
		boolean resul;
		String aux;
		
		Sorteo s = new Sorteo();
		
		System.out.println("Bienvenido al sorteo de la lotería de Navidad");
		
		do {
			System.out.println("""
					¿Qué desea hacer?
					
					0. Para salir.
					1. Para comprar un boleto elegido.
					2. Para comprar un boleto aleatorio.
					3. Jugar sorteo
					4. Comprobar si el boleto está premiado.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Diga que boleto desea");
					aux=sc.nextLine();
					boletoComp=Integer.parseInt(aux);
					while(boletoComp<=0 || boletoComp>99999) {
						System.out.println("Error, número no válido");
						System.out.println("Diga que boleto desea");
						aux=sc.nextLine();
						boletoComp=Integer.parseInt(aux);
					}
					System.out.println("Compra realizada.");
					break;
					
				case 2:
					System.out.println("Generando boleto...");
					boletoComp=s.generarBoleto();
					System.out.println("Su boleto lleva el número: " + boletoComp);
					break;
					
				case 3:
					numPrem=s.generarBoletPremiado();
					System.out.println("El número premiado es: " + numPrem);
					break;
					
				case 4:
					resul=s.comprobarPremio(boletoComp, numPrem);
					s.mostrarGanador(resul);
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
			}
			
		}while(opcion!=0);
		
		System.out.println("Gracias por jugar el sorteo, adiós");
		
	}

}
