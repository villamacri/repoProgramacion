package ejemploarraysbi;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int tam=4, fil=2, col=3;
		int filaLeida, colLeida, nuevo;
		String aux;
		
		int [] listadoEnteros = new int[tam];
		int [][] lista=new int [fil][col];//El corchete es numero de filas y el otro numero de columnas
		
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.println("Diga un número");
				aux=sc.nextLine();
				lista[i][j]=Integer.parseInt(aux);
			}
		}
		
		//Mostrar array completo
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print( lista[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Diga fila");
		aux=sc.nextLine();
		filaLeida=Integer.parseInt(aux);
		
		System.out.println("Diga columna");
		aux=sc.nextLine();
		colLeida=Integer.parseInt(aux);
		
		System.out.println("Diga nuevo número");
		aux=sc.nextLine();
		nuevo=Integer.parseInt(aux);
				
		
		lista[filaLeida-1][colLeida-1]=nuevo;
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print( lista[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
