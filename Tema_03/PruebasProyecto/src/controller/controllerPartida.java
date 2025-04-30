package controller;

import java.util.Random;

import datos.Datos;
import model.Jugador;
import model.Partida;

public class controllerPartida {

	public Jugador findByCodJug(int codJugador, Partida p) {
		Jugador buscado=null;
		boolean encontrado=false;
		int i=0;
		
		while(i<p.getListadoJugadores().length && !encontrado) {
			if(p.getListadoJugadores()[i].getCodJugador()==codJugador && p.getListadoJugadores()[i]!=null) {
				buscado=p.getListadoJugadores()[i];
				encontrado=true;
			}else {
				i++;
			}
		}
		return buscado;
	}
	
	public boolean bingo(int codJugador, Partida p) {
		
		boolean estado=true;
		int cont=0;
			//Busca en el array de strings
		for (int i = 0; i < findByCodJug(codJugador, p).getCartonDeJuego().getCartonRelleno().length && cont==0; i++) {
			for (int j = 0; j < findByCodJug(codJugador, p).getCartonDeJuego().getCartonRelleno()[i].length && cont==0; j++) {
				if(!findByCodJug(codJugador, p).getCartonDeJuego().getCartonRelleno()[i][j].equalsIgnoreCase("x")) {
					cont++;
					estado=false;
				}
			}
		}
			
		return estado;
	}
	
	public void imprimirResultado(int codJugador, Partida p) {
		if(bingo(codJugador, p)) {
			System.out.println("¡Bingo!");
		}else {
			System.out.println("Paquete...");
		}
	}
	
	public String [] numerosSorteados(int filas, int columnas){
		Random rnd=new Random(System.nanoTime());
		Datos d=new Datos();
		int tam, pos1, pos2, hastaI=8, hastaJ=9, desde=0;
		tam = filas*columnas;
		String [] listadoNumeros=new String[tam];
		
		for (int i = 0; i < listadoNumeros.length; i++) {
			pos1=rnd.nextInt(hastaI-desde+1)+desde;
			pos2=rnd.nextInt(hastaJ-desde+1)+desde;
			listadoNumeros[i]=d.getNumerosBingo()[pos1][pos2];
			d.getNumerosBingo()[pos1][pos2]="x";
			
			while(d.getNumerosBingo()[pos1][pos2].equalsIgnoreCase("X")) {
				pos1=rnd.nextInt(hastaI-desde+1)+desde;
				pos2=rnd.nextInt(hastaJ-desde+1)+desde;
				listadoNumeros[i]=d.getNumerosBingo()[pos1][pos2];
			}
			d.getNumerosBingo()[pos1][pos2]="x";
		}
		return listadoNumeros;
	}
	
	public void imprimirListado(int filas, int columnas) {
		for (int i = 0; i < numerosSorteados(filas, columnas).length; i++) {
			System.out.println(numerosSorteados(filas, columnas)[i]);
		}
	}
}
