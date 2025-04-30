package ejercicio06;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		Random rnd=new Random(System.nanoTime());
		
		int opcion=0, j1, j2, hasta, desde, num, numJ, resul, numLot, tam=15, opcPartido;
		String aux;
		
		String [] opcJugador=new String[tam];
		
		Generadora g=new Generadora();
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Elija a que quiere jugar.
					
					0. Para salir
					1. Quiniela.
					2. Pares o Nones.
					3. Jugar a los chinos.
					4. Lotería.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("A continuación rellene sus resultados");
					
					for (int i = 0; i < opcJugador.length; i++) {
						System.out.printf("""
								Elija una opción para el partido %d
								
								1. Para el uno
								0. Para la equis
								2. Para el dos\n
								""",(i+1));
						aux=sc.nextLine();
						opcPartido=Integer.parseInt(aux);
						if(opcPartido==1) {
							opcJugador[i]="1";
						}if(opcPartido==0) {
							opcJugador[i]="x";
						}if(opcPartido==2) {
							opcJugador[i]="2";
						}
						while(opcPartido<0 || opcPartido>2) {
							System.out.println("Error, opcion no válida");
							System.out.printf("""
									Elija una opción para el partido %d
									
									1. Para el uno
									0. Para la equis
									2. Para el dos\n
									""",(i+1));
							aux=sc.nextLine();
							opcPartido=Integer.parseInt(aux);
							if(opcPartido==1) {
								opcJugador[i]="1";
							}if(opcPartido==0) {
								opcJugador[i]="x";
							}if(opcPartido==2) {
								opcJugador[i]="2";
							}
						}
					}
					
					g.comprobarQuiniela(opcJugador);
					g.imprimirResulQuiniela(opcJugador);
					break;
					
				case 2:
					desde=0;
					hasta=10;
					j1=rnd.nextInt(hasta-desde+1)+desde;
					j2=rnd.nextInt(hasta-desde+1)+desde;
					num=j1+j2;
					
					System.out.println("Jugador 1: "+j1+"\t\tJugador 2: "+j2);
					g.generarParesNones(j1, j2);
					g.imprimirParesNones(num);
					System.out.println("""
							¿Desea volver a jugar?
							0 para confirmar, pulse cualquier otro número para salir.
							""");
					aux=sc.nextLine();
					opcion=Integer.parseInt(aux);
					while(opcion==0) {
						j1=rnd.nextInt(hasta-desde+1)+desde;
						j2=rnd.nextInt(hasta-desde+1)+desde;
						num=j1+j2;
						System.out.println("Jugador 1: "+j1+"\t\tJugador 2: "+j2);
						g.imprimirParesNones(num);
						System.out.println("""
								¿Desea volver a jugar?
								0 para confirmar, pulse cualquier otro número para salir.
								""");
						aux=sc.nextLine();
						opcion=Integer.parseInt(aux);
					}
					break;
					
				case 3:
					resul=0;
					numJ=0;
					
					System.out.println("¿Cuantos van a jugar?");
					aux=sc.nextLine();
					numJ=Integer.parseInt(aux);
					while(numJ<3) {
						System.out.println("Error, deben ser al menos 3 jugadores");
						System.out.println("¿Cuantos van a jugar?");
						aux=sc.nextLine();
						numJ=Integer.parseInt(aux);
					}
					resul=g.generarChinos(numJ);
					
					System.out.println("El resultado es "+resul);
					
					System.out.println("""
							¿Desea volver a jugar?
							0 para confirmar, pulse cualquier otro número para salir.
							""");
					aux=sc.nextLine();
					opcion=Integer.parseInt(aux);
					while(opcion==0) {
						resul=0;
						numJ=0;
						
						System.out.println("¿Cuantos van a jugar?");
						aux=sc.nextLine();
						numJ=Integer.parseInt(aux);
						while(numJ<3) {
							System.out.println("Error, deben ser al menos 3 jugadores");
							System.out.println("¿Cuantos van a jugar?");
							aux=sc.nextLine();
							numJ=Integer.parseInt(aux);
						}
						resul=g.generarChinos(numJ);
						
						System.out.println("El resultado es "+resul);
						
						System.out.println("""
								¿Desea volver a jugar?
								0 para confirmar, pulse cualquier otro número para salir.
								""");
						aux=sc.nextLine();
						opcion=Integer.parseInt(aux);
					}
					break;
					
				case 4:
					System.out.println("Diga desde donde empieza la lotería");
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Diga donde acaba la lotería");
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					System.out.println("Elija un número del " + desde + " al " + hasta );
					aux=sc.nextLine();
					numLot=Integer.parseInt(aux);
					
					while(numLot<desde || numLot>hasta) {
						System.out.println("Error, el número elejido no es válido");
						System.out.println("Elija un número del " + desde + " al " + hasta );
						aux=sc.nextLine();
						numLot=Integer.parseInt(aux);
					}
					
					resul=g.generarLoteria(hasta, desde);
					g.imprimirResultadoLoteria(numLot, resul);
					
					System.out.println("""
							¿Desea volver a jugar?
							0 para confirmar, pulse cualquier otro número para salir.
							""");
					aux=sc.nextLine();
					opcion=Integer.parseInt(aux);
					while(opcion==0) {
						System.out.println("Elija un número del " + desde + " al " + hasta );
						aux=sc.nextLine();
						numLot=Integer.parseInt(aux);
						
						while(numLot<desde || numLot>hasta) {
							System.out.println("Error, el número elejido no es válido");
							System.out.println("Elija un número del " + desde + " al " + hasta );
							aux=sc.nextLine();
							numLot=Integer.parseInt(aux);
						}
						
						resul=g.generarLoteria(hasta, desde);
						g.imprimirResultadoLoteria(numLot, resul);
						
						System.out.println("""
								¿Desea volver a jugar?
								0 para confirmar, pulse cualquier otro número para salir.
								""");
						aux=sc.nextLine();
						opcion=Integer.parseInt(aux);
					}
					break;
			}
						
		}while(opcion!=0);
		
		System.out.println("Adiós");

	}

}
