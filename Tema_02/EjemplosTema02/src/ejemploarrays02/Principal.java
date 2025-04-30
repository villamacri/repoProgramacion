package ejemploarrays02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String aux;
		int tam, op, buscada;
		int edades[];
		
		System.out.println("Diga número de alumnos");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		edades=new int[tam];
		//Para rellenar leyendo por teclado
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Dime la edad");
			aux=sc.nextLine();
			edades[i]=Integer.parseInt(aux);
		}
		//Para imprimir
		for (int i = 0; i < edades.length; i++) {
			System.out.println(edades[i]+"\t");
		}
		
		/*Para buscar
		for (int valor : edades) {
			System.out.println(valor+"\t");
		}
		*/
		//Por índice(regulinchis)
		/*
		System.out.println("Diga el elemento que quiere buscar");
		aux=sc.nextLine();
		op=Integer.parseInt(aux);
		*/
		/*
		 * Hay varias posibilidades
		 * 
		 * op=Integer.parseInt(aux)-1;
		 * System.out.println(edades[op-1]);
		 * */
		
		System.out.println("Diga la edad que quiere buscar");
		aux=sc.nextLine();
		buscada=Integer.parseInt(aux);
		
		for (int i : edades) {
			if(edades[i]==buscada) {
				System.out.println(edades[i]);
			}
		}
	}

}
