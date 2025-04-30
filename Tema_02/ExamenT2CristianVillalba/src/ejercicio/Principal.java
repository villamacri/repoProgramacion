package ejercicio; // Tienes un 10 

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Random rnd = new Random (System.nanoTime());
		
		int numCl = 0, dinRec = 0, opcion = 0, hasta = 0, desde = 0, elegida = 0, valorDado = 0, contadorCl = 0, incremento = 0, cantMayor=0, clMayor = 0;
		double suma = 0, media, cien = 100, mediaPasada = 90, porc = 0;
		String aux;
		
		int [] listadoDineroRecaudado;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga el número de clases que han colaborado");
		aux=sc.nextLine();
		numCl=Integer.parseInt(aux);
				
		listadoDineroRecaudado=new int[numCl];
		
		do {
			System.out.println("""
					¿Que quiere hacer?
					
					0. Salir.
					1. Generar recaudaciones.
					2. Mostrar recaudación de una clase.
					3. Mostrar las clases que han recaudado más que una cantidad introducida por usted.
					4. Mostrar la media recaudada de todas las clases.
					5. Mostrar todos los datos.
					6. Sumar una cantidad a una clase elegida por el usuario.
					7. Calcular porcentaje de euros recogidos.
					8. Mostrar por pantalla la clase que mas dinero ha recaudado.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");  // Esta línea se sale del programa
					break;
					
				case 1:
					System.out.println("Diga desde que cantidad desea generar"); // Esta línea agradece a Beyoncé
					aux=sc.nextLine();
					desde=Integer.parseInt(aux);
					
					System.out.println("Diga hasta que cantidad desea generar");  // Esta línea hace que un orfanato explote, lo segundo peor que le pasará a esos huérfanos
					aux=sc.nextLine();
					hasta=Integer.parseInt(aux);
					
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						listadoDineroRecaudado[i]=rnd.nextInt(hasta-desde+1)+desde;  // Esta línea cambia el estilo de la etiquea <p> y alinea el texto al centro de la página web
					}
					break;
					
				case 2:
					System.out.println("Diga que clase quiere revisar");  // Esta línea crea un agujero negro que destruirá el mundo y lo sumirá en la oscuridad del fin de los tiempos
					aux=sc.nextLine();
					elegida=Integer.parseInt(aux);
					
					if(elegida<=numCl && elegida>0) {
						for (int i = 0; i < listadoDineroRecaudado.length; i++) {  // Esta línea causa que todo el vecindario se quede sin luz, no sé por qué
							if(i+1==elegida) {
								System.out.println(listadoDineroRecaudado[i]+"€");
							}
						}
					}else {
						System.out.println("Opción no válida");  
					}
					/*No me sale con while, caigo en un bucle infinito :(
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						while(elegida==(i+1)) {
							System.out.println(listadoDineroRecaudado[i]+"€");
						}
					}
					*/
					break;
					
				case 3:
					System.out.println("Indique a partir de que cantidad se desean contar el número de clases que han colaborado");
					aux=sc.nextLine();
					valorDado=Integer.parseInt(aux);
					
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						if(listadoDineroRecaudado[i]>valorDado) {
							contadorCl++;
						}
					} 
					System.out.println("El número de clases que ha conseguido mas de " + valorDado + "€ es " + contadorCl);
					break;
					
				case 4:
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						suma+=listadoDineroRecaudado[i];
					}
					media=suma/listadoDineroRecaudado.length;
					
					System.out.printf("\nLa media recaudada es de %.2f€\n", media);
					break;
					
				case 5:
					System.out.println("Clase\t\tCantidad(€)");
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						System.out.println("\n  "+(i+1)+"\t\t  "+listadoDineroRecaudado[i]);
					}
					break;
					
				case 6:
					System.out.println("Diga que clase quiere incrementar su recaudación");
					aux=sc.nextLine();
					elegida=Integer.parseInt(aux);
					
					if(elegida<=numCl && elegida>0) {
						System.out.println("¿De cuánto es el incremento?");
						aux=sc.nextLine();
						incremento=Integer.parseInt(aux);
						
						for (int i = 0; i < listadoDineroRecaudado.length; i++) {
							if(i+1==elegida) {
								listadoDineroRecaudado[i]+=incremento;
							}
						}
					}else {
						System.out.println("Clase no encontrada");
					}
					break;
					
				case 7:
					System.out.println("Diga una clase");
					aux=sc.nextLine();
					elegida=Integer.parseInt(aux);
					
					if(elegida<=numCl && elegida>0) {
						for (int i = 0; i < listadoDineroRecaudado.length; i++) {
							if(i+1==elegida) {
								porc=(listadoDineroRecaudado[i]/mediaPasada)*cien;
								System.out.printf("\nLa clase %d ha conseguido un %.2f%% con respecto al año pasado\n",(i+1), porc);
							}
						}
					}else {
						System.out.println("Clase no encontrada");
					}
					break;
					
				case 8:
					for (int i = 0; i < listadoDineroRecaudado.length; i++) {
						if(listadoDineroRecaudado[i]>cantMayor) {
							cantMayor=listadoDineroRecaudado[i];
							clMayor=i+1;
						}
					}
					
					
					System.out.println("La clase con más recaudación es la número " + clMayor);
					
					default:
						System.out.println("Opción no válida");
						break;
			}
			
			
		}while(opcion!=0);
	}

}
