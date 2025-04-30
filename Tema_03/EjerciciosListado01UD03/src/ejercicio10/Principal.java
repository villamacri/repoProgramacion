package ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double precioTick = 1.35, recaudacion = 0.0, pago = 0, precioAct;
		int opcion, opcion2, cant=0, intentos;
		String aux, contr="pepe1234", contrLeida;
		
		Ticket t = new Ticket(precioTick);
		Maquina m = new Maquina(recaudacion);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Elija una opción
					
					0. Salir
					1. Comprar tickets
					2. Imprimir ticket
					3. Acceder a opciones de operario
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					cant=0;
					System.out.println("Diga cuántos tickets desea.");
					aux=sc.nextLine();
					cant=Integer.parseInt(aux);
					while(cant<=0) {
						System.out.println("Error, cantidad no válida.");
						System.out.println("Diga cuántos tickets desea.");
						aux=sc.nextLine();
						cant=Integer.parseInt(aux);
					}
					m.actualizarRecaudacion(m.comprarBilletes(t, cant));
					
					System.out.printf("Importe de los tickets: %.2f\n", m.comprarBilletes(t, cant));
					System.out.println("Introduzca el pago a efectuar.");
					aux=sc.nextLine();
					pago=Double.parseDouble(aux);
					while(pago<m.comprarBilletes(t, cant)) {
						System.out.println("Error, cantidad introducida insuficiente");
						System.out.printf("Importe de los ticket: %.2f€\n", m.comprarBilletes(t, cant));
						System.out.println("Introduzca el pago a efectuar");
						aux=sc.nextLine();
						pago=Double.parseDouble(aux);
					}
					System.out.println("Operación realizada");
					break;
					
				case 2:
					m.imprimirBillete(t, cant, pago);
					break;
					
				case 3:
					intentos=2;
					System.out.println("Opciones de operario, introduzca contraseña para acceder.");
					contrLeida=sc.nextLine();
					if(m.comprobarContra(contr, contrLeida)) {
						System.out.println("Acceso concedido");
						do {
							System.out.println("""
									Elija una opción
									
									0. Salir
									1. Mostrar recaudación
									2. Reiniciar recaudación
									3. Cambiar precio del ticket
									""");
							aux=sc.nextLine();
							opcion2=Integer.parseInt(aux);
							switch(opcion2) {
								case 0:
									System.out.println("Saliendo...");
									break;
									
								case 1:
									m.mostrarRecaudacion();
									break;
									
								case 2:
									m.setRecaudacionBilletes(0.0);
									System.out.println("Recaudación reiniciada.");
									break;
									
								case 3:
									System.out.println("Diga el nuevo precio del billete.");
									aux=sc.nextLine();
									precioAct=Double.parseDouble(aux);
									t.setPrecio(precioAct);
									System.out.println("Precio actualizado");
									break;
									
									default:
										System.out.println("Opción no válida");
										break;
							}
							
						}while(opcion2!=0);
					}else {
						while(!contrLeida.equals(contr) && intentos > 0) {
							System.out.println("Contraseña incorrecta, intentos restantes: " + intentos);
							System.out.println("Opciones de operario, introduzca contraseña para acceder.");
							contrLeida=sc.nextLine();
							
							intentos--;
						}
						if(m.comprobarContra(contr, contrLeida)) {
							System.out.println("Acceso concedido");
							do {
								System.out.println("""
										Elija una opción
										
										0. Salir
										1. Mostrar recaudación
										2. Reiniciar recaudación
										3. Cambiar precio del ticket
										""");
								aux=sc.nextLine();
								opcion2=Integer.parseInt(aux);
								switch(opcion2) {
									case 0:
										System.out.println("Saliendo...");
										break;
										
									case 1:
										m.mostrarRecaudacion();
										break;
										
									case 2:
										m.setRecaudacionBilletes(0.0);
										System.out.println("Recaudación reiniciada.");
										break;
										
									case 3:
										System.out.println("Diga el nuevo precio del billete");
										aux=sc.nextLine();
										precioAct=Double.parseDouble(aux);
										t.setPrecio(precioAct);
										System.out.println("Precio actualizado");
										break;
										
										default:
											System.out.println("Opción no válida");
											break;
								}
								
							}while(opcion2!=0);
						}if(intentos==0) {
							System.out.println("Acceso denegado");
						}
					}
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
					
			}
			
		}while(opcion!=0);
		
		System.out.println("Gracias por usar mi programa, adiós");
		
	}

}
