package ejercicio05;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int tam;
		String frase, aux;
		Copiado c=new Copiado();
		
		System.out.println("Bienvenido");
		
		System.out.println("Diga la frase a copiar");
		frase=sc.nextLine();
		
		System.out.println("Diga cuantas veces quiere que se copie");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		c.imprimirFraseLeida(tam, frase);
		
	}

}
