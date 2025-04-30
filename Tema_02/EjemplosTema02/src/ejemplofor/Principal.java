package ejemplofor;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String aux;
		int tope;
		
		System.out.println("Diga las veces que quiere saludar");
		aux=sc.nextLine();
		tope=Integer.parseInt(aux);
		
		//No se declara la i fuera del bucle
		for (int i = 0; i < tope; i++) {
			System.out.println("Hola número "+(i+1));
			
		}
		
	}

}
