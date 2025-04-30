package ejercicio07;

import java.util.Random;

public class Moneda {

	
	public int lanzarMoneda() {
		Random rnd=new Random(System.nanoTime());
		int tirada, desde =1, hasta=2;
		
		tirada=rnd.nextInt(hasta-desde+1)+desde;
		
		return tirada;
	}
	
	public boolean comprobarResultado(int j1) {
		boolean resul;
		int tirada=lanzarMoneda();
		if(j1==tirada) {
			resul=true;
		}else {
			resul=false;
		}
		return resul;
	}
	
	public void imprimirResultado(boolean resul) {
		
		if(resul) {
			System.out.println("¡Acertaste campeón!");
		}else {
			System.out.println("Bah, siga jugando");
		}
		
	}
	
}
