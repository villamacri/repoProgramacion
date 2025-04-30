package ejercicio06;

import java.util.Random;

public class Generadora {

	
	public String [] generarQuiniela() {
		Random rnd=new Random(System.nanoTime());
		int hasta=2, desde=0, pos, tam=15;
		String [] resultados= {"1","x","2"};
		String [] resulQuiniela=new String[tam];
		for (int i = 0; i < resulQuiniela.length; i++) {
			pos=rnd.nextInt(hasta-desde+1)+desde;
			resulQuiniela[i]=resultados[pos];
		}
		return resulQuiniela;
	}
	
	public int comprobarQuiniela(String [] opcJugador) {
		int recuento = 0;
		String [] resulQuiniela = generarQuiniela();
		for (int i = 0; i < resulQuiniela.length; i++) {
			if(resulQuiniela[i].equals(opcJugador[i])) {
				recuento++;
			}
		}
		return recuento;
	}

	public void imprimirResulQuiniela(String [] opcJugador) {
		if(comprobarQuiniela(opcJugador) >= 7) {
			System.out.println("Coincidencias: "+comprobarQuiniela(opcJugador));
			System.out.println("Felicidades, te llevaste algo al menos.");
		}else {
			System.out.println("Coincidencias: "+comprobarQuiniela(opcJugador));
			System.out.println("Lástima, prueba en otra ocasión.");
		}
	}

	
	public int generarParesNones(int j1, int j2) {
		int num=j1+j2;
		return num;
	}
	
	public void imprimirParesNones(int num) {
		if(num%2==0) {
			System.out.println("Pares");
		}else {
			System.out.println("Nones");
		}
	}
	
	public int generarChinos(int numJ) {
		Random rnd=new Random(System.nanoTime());
		int hasta=3, desde=1, resul;
		
		resul=(rnd.nextInt(hasta-desde+1)+desde)*3;
		if(numJ>3) {
			hasta=numJ;
			resul=(rnd.nextInt(hasta-desde+1)+desde)*3;
		}
		return resul;
	}
	
	public int generarLoteria(int hasta, int desde) {
		Random rnd=new Random(System.nanoTime());
		int resul;
		
		resul=rnd.nextInt(hasta-desde+1)+desde;
		return resul;
	}
	
	public void imprimirResultadoLoteria(int num, int resul) {
		if(num==resul) {
			System.out.println("El resultado es: "+ resul);
			System.out.println("Enhorabuena, es usted el ganador.");
		}else {
			System.out.println("El resultado es: "+ resul);
			System.out.println("Lástima, otra vez será");
		}
		
	}
}
