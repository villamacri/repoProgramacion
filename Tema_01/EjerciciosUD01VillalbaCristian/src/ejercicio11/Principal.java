package ejercicio11;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double metrosCubExtr, horasEn, litrosSeg, horaSeg=3600, litroMetroCúb=1000;
		String aux;
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga el caudal con el que se extrae el agua");
		aux=sc.nextLine();
		litrosSeg=Double.parseDouble(aux);
		
		System.out.println("Diga las horas que esta encendido el extractor de agua");
		aux=sc.nextLine();
		horasEn=Double.parseDouble(aux);
		
		metrosCubExtr = (litrosSeg*(horasEn*horaSeg))/litroMetroCúb;
		
		System.out.println();
		System.out.printf("Se extraen %.2fm^3 en %.2f horas", metrosCubExtr,horasEn);
		
		System.out.println();
		System.out.println("Gracias por usar mi programa");
		
	}

}
