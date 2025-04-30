package principal;

import java.util.Scanner;

import controller.ControllerJugador;
import controller.controllerPartida;
import crud.CrudPartida;
import model.Carton;
import model.Jugador;
import model.Partida;
import vistas.Vista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String[][] carton = ControllerJugador.generarEquis(3, 3);
		Jugador [] listadoJug;
		
		int opcion=0, numJug=0, cont, codJug, numFilas=3, numCol=3, contHuecos=0;
		String numero, aux, nombreJug;
		boolean estado=false;
		
		Partida p;
		ControllerJugador cj = new ControllerJugador();
		CrudPartida crp=new CrudPartida(numJug);
		
		Vista v = new Vista();
		
		v.imprimirCarton(carton);
		
		System.out.println("Introduzca un número");
		numero = sc.nextLine();
		carton = cj.rellenarCartón(carton,numero);
		
		v.imprimirCarton(carton);
		/*
		do {
			System.out.println("""
						Menú
					0. Salir.
					1. Empezar nueva partida.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Introduzca el número de jugadores, deben ser entre 2 y 10 jugadores");
					aux=sc.nextLine();
					numJug=Integer.parseInt(aux);
					
					while(numJug<2 || numJug>10) {
						System.out.println("Error, número de jugadores no válidos");
						System.out.println("Introduzca el número de jugadores, deben ser entre 2 y 10 jugadores");
						aux=sc.nextLine();
						numJug=Integer.parseInt(aux);
					}
					listadoJug=new Jugador[numJug];
					
					p=new Partida(listadoJug);

					crp.setNumJugadores(numJug);
					cont=1;
					while(cont<=numJug) {
						System.out.println("Introduzca el nombre del jugador "+cont+".");
						nombreJug=sc.nextLine();
						
						codJug=cont;
						Carton cartonJug=new Carton(carton, numFilas, numCol, contHuecos);
						Jugador j=new Jugador(cartonJug, nombreJug, codJug, estado);
						listadoJug[cont-1]=j;
						crp.agregarJugador(j, p);
						cont++;
					}
					crp.imprimirListadoJug(p);
					
					
					
			}
		}while(opcion!=0);
		*/
		System.out.println();
		
	}
	
}