package ejercicio09;

import java.util.Random;

public class Sorteo {

	public int generarNumero() {
		Random rnd= new Random(System.nanoTime());
		int boleto, hasta = 99999, desde = 00001;
		boleto=rnd.nextInt(hasta-desde+1)+desde;
		return boleto;
	}
	
	public int generarBoleto() {
		int boleto;
		boleto=generarNumero();
		return boleto;
	}
	
	public int generarBoletPremiado() {
		int numPrem;
		numPrem=generarNumero();
		return numPrem;
	}
	
	public boolean comprobarPremio(int boleto, int numPrem) {
		boolean resul;
		if(boleto==numPrem) {
			resul=true;
		}else {
			resul=false;
		}
		return resul;
		
	}
	
	public void mostrarGanador(boolean resul) {
		if(resul) {
			System.out.println("!Enhorabuena¡, te llevaste el premio gordo. ;)");
		}else {
			System.out.println("Lástima, otra vez será.");
		}
	}
	
}
