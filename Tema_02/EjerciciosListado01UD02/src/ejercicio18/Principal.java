package ejercicio18;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int horasTot, horasExtr, tope=40;
		double salarioNorm, salarioExtr, salarioTot, precioHorNor=16.0, precioHorExtr=20.0;
		String aux;
		
		System.out.println("Bienvenido");
		do {
			System.out.println("Diga las horas que ha echado, pulse 0 para salir");
			aux=sc.nextLine();
			horasTot=Integer.parseInt(aux);
			
			if(horasTot>tope) {
				horasExtr=horasTot-tope;
				salarioExtr=precioHorExtr*horasExtr;
				salarioNorm=precioHorNor*tope;
				
				salarioTot=salarioExtr+salarioNorm;
				
				System.out.printf("\nLe corresponde un salario de %.2f€\n", salarioTot);
			}if(horasTot>0 && horasTot<=tope){
				salarioNorm=precioHorNor*horasTot;
				
				System.out.printf("\nLe corresponde un salario de %.2f€\n", salarioNorm);
				
			}
		
		}while(horasTot!=0);
		System.out.println("\nAdiós");
		
	}

}
