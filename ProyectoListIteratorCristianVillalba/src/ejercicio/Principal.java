package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Nos han pedido que desarrollemos un reproductor de música
		 * que nos permita avanzar, retroceder, agregar una canción a
		 * la playlist y eliminar la canción que se este reproduciendo.
		 * Para ello debemos utilizar una colección List que se vaya
		 * iterando con ListIterator. Habrá que crear una clase Canción,
		 * otra llamada Reproductor y una clase Principal.
		 * 
		 * Las características de una canción son título, duración y
		 * autor.
		 */
		
		Scanner sc =new Scanner(System.in);
		
		int opcion=0;
		double duracion;
		String titulo, autor, aux;
		
		List<Cancion>playlist=new ArrayList<Cancion>();
		
		Cancion c1=new Cancion("Thriller", "Michael Jackson", 5.58);
		Cancion c2=new Cancion("Nookie", "Limp Bizkit", 4.29);
		Cancion c3=new Cancion("Give Me the Kush", "Cráneo ft. Bejo", 2.55);
		Cancion c4=new Cancion("Abre la puerta", "Triana", 9.51);
		
		playlist.add(c1);
		playlist.add(c2);
		playlist.add(c3);
		playlist.add(c4);
		
		ListIterator<Cancion>it=playlist.listIterator();		

		Reproductor r=new Reproductor(it);

		
		System.out.println("Bienvenido, iniciando reproductor...");
		
		r.mostrarCancionActual(playlist);
		do {
			System.out.println("""
					Elija una opción
					
					0. Para salir del reproductor.
					1. Para pasar de canción.
					2. Para retroceder de canción
					3. Para agregar una nueva canción.
					4. Eliminar la canción actual.
					5. Mostrar playlist.
					6. Mostrar detalles de la canción actual.
					7. Para reemplazar canción actual.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					r.mostrarSiguiente();
					break;
					
				case 2:
					r.mostrarAnterior();
					break;
					
				case 3:
					System.out.println("Diga el título de la canción");
					titulo=sc.nextLine();
					
					System.out.println("Diga el autor de la canción");
					autor=sc.nextLine();
					
					System.out.println("Diga la duración de la canción");
					aux=sc.nextLine();
					duracion=Double.parseDouble(aux);
					
					r.agregarCancion(new Cancion(titulo, autor, duracion));
					System.out.println("Canción agregada");
					break;
					
				case 4:
					r.confirmarEliminar();
					break;
					
				case 5:
					r.mostrarPlaylist(playlist);
					break;
					
				case 6:
					r.mostrarDetallesCancion(playlist);
					break;
					
				case 7:
					System.out.println("Diga el título de la canción");
					titulo=sc.nextLine();
					
					System.out.println("Diga el autor de la canción");
					autor=sc.nextLine();
					
					System.out.println("Diga la duración de la canción");
					aux=sc.nextLine();
					duracion=Double.parseDouble(aux);
					
					r.reemplazarActual(new Cancion(titulo, autor, duracion));
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
					
			}
		}while(opcion!=0);
		
		System.out.println("Adiós");
	}

}
