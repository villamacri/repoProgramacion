package ejemploasignacion;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		
		int edad;
		int uno = 1;
		String aux;
		
		System.out.println("Hola, vamos a sumar uno a tu edad, diga edad");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		edad+=uno;
		
		System.out.println("Tu edad a partir de ahora es " + edad);
		
		
	}

}
