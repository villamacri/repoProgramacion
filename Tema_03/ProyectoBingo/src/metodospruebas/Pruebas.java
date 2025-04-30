package metodospruebas;

import java.util.Random;

import datos.Datos;

public class Pruebas {

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
