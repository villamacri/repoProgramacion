package ejemplo01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ejemplos de if
		 * operadores condicionelas
		 * &&: esto y lo otro se debe cumplir
		 * ||: 
		 * */
		Scanner sc = new Scanner (System.in);
		
		int edad, mayoria=18;
		double saldo, topeSaldo=100.00;
		String aux;
		
		
		System.out.println("¿Cual es tu edad?");
		aux=sc.nextLine();
		edad=Integer.parseInt(aux);
		
		
		
		if(edad>=mayoria) {
			System.out.println("¿Cuánto tienes pensado gastar julandrón?");
			aux=sc.nextLine();
			saldo=Double.parseDouble(aux);
			if(saldo>=topeSaldo) {
			System.out.println("Adelante, a drogarse y alcoholizarse");
			}
			if(saldo>=50) {
				System.out.println("Bueno pasa, pero no te vayas a pasar que estás tieso");
			}
		}else {
			System.out.println("A mamar teta");
		}
		
		System.out.println("Adiós");
				
	}

}
