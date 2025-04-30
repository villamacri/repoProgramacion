package ejemploaleatorios;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random(System.nanoTime());
		
		String aux;
		int hasta, desde, aleat, contL, cont=0;
		//int valorDado = (int)(Math.floor(Math.random()*6+1));
		
		//System.out.println("El número aleatorio es ");
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga desde que número quiere generar aleatorio");
		aux=sc.nextLine();
		desde=Integer.parseInt(aux);
		
		System.out.println("Diga hasta que número quiere generar");
		aux=sc.nextLine();
		hasta=Integer.parseInt(aux);
		
		System.out.println("Diga cuantas veces quiere tirar");
		aux=sc.nextLine();
		contL=Integer.parseInt(aux);
		
		do {
		
		 
		aleat=rnd.nextInt(hasta-desde+1)+desde;
		
		cont++;
		System.out.println("El número " + cont + " aleatorio es " + aleat);
		
		
		
		}while(cont<contL);
	}

}
