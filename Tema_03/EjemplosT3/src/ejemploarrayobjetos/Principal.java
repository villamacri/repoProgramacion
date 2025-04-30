package ejemploarrayobjetos;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		String aux, modelo;
		int tam, seguir = 0 , nVs = 0;
		double potencia;
		
		Vehiculo [] lista;
		
		System.out.println("Diga número de vehículos total");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		lista=new Vehiculo[tam];
		/*
		System.out.println("Diga el modelo");
		modelo=sc.nextLine();
		
		System.out.println("Diga potencia");
		aux=sc.nextLine();
		potencia=Double.parseDouble(aux);
		
		//Varias posibilidades
		lista[0]=new Vehiculo(modelo, potencia);
		
		System.out.println(lista[0]);
		*/
		do {
			System.out.println("Diga el modelo");
			modelo=sc.nextLine();
			
			System.out.println("Diga potencia");
			aux=sc.nextLine();
			potencia=Double.parseDouble(aux);
			
			lista[nVs]=new Vehiculo(modelo, potencia);
			nVs++;
			
			System.out.println("Si desea terminar pulse 0, cualquier número para seguir");
			aux=sc.nextLine();
			seguir=Integer.parseInt(aux);
		}while(seguir!=0 && nVs < lista.length);
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println("Adiós");
	}

}
