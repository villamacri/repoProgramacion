package ejemploobjetos;

import java.util.Random;

public class Alumno3 {

	//Este método no deberia ir en la clase alumno
	
	public double [] rellenarListadoNotas(int tam, int desde, int hasta) {
		Random rnd = new Random(System.nanoTime());
		double [] notas;
		notas=new double [tam];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=rnd.nextInt(hasta-desde+1)+desde;
		}
		return notas;
	}
	
}
