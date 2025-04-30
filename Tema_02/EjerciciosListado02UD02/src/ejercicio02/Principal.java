package ejercicio02;

import java.util.Random;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Random rnd = new Random();
		//Inicializar array con 10 posiciones.
		int tam=10, num, dos=2, valor, hasta = 10, desde = 0;
		int [] listadoEnteros=new int[tam];
		String aux;
		
		
		//Lectura de los 10 numeros.
		for (int i = 0; i < tam; i++) {
			/*
			System.out.println("Diga número " + (i+1)+": ");
			aux=sc.nextLine();
			num=Integer.parseInt(aux);
			
			listadoEnteros[i] = num*dos;//Multiplicamos por dos y guardamos
			*/
			valor=rnd.nextInt(hasta-desde+1)+desde;
			listadoEnteros [i]=valor*2;
		}
		
		//Resultados después de multiplicar por dos
		System.out.println("Resultados despues de multiplicar por 2:");
		for (int i = 0; i < tam; i++) {
			System.out.println("Resultado " + (i+1) + ": " + listadoEnteros[i]);
		}
	}

}
