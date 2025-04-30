package ejercicioclase;

import java.util.Scanner;

public class PrimerEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Para usar una variable hay que declararla
		
		//Aqui declaramos las variables
		
		int num1 = 24, opcion = 0;//Asignar un valor a una variable se llama declaración
		int numOp1, numOp2;
		int numR;
		
		char letra = 'c';
		char letra2 = 99; //Para escribir caracteres especiales se puede usar nomenclatura ASCII, 99 = c
		
		String aux;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			
			System.out.println("Calculadora básica");
			System.out.println();
			System.out.println("""
								0 para salir.
								1 para sumar.
								2 para restar.
								3 para multiplicar.
								4 para dividir.
									""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
		
		
			switch(opcion) {
			
				case 0:
					
					System.out.println("Saliendo...");
					
					break;
			
				case 1:
			
					System.out.println("Diga primer número a sumar");
					aux=sc.nextLine();
					numOp1=Integer.parseInt(aux);
					
					System.out.println("Diga segundo número a sumar");
					aux=sc.nextLine();
					numOp2=Integer.parseInt(aux);
					
					numR = numOp1 + numOp2;
					
					System.out.println("El resultado es " + numR);
					
					break;
				
				case 2:
					
					System.out.println("Diga primer número para restar");
					aux=sc.nextLine();
					numOp1=Integer.parseInt(aux);
					
					System.out.println("Diga segundo número a restar");
					aux=sc.nextLine();
					numOp2=Integer.parseInt(aux);
					
					numR= numOp1 - numOp2;
					
					System.out.println("El resultado es "+ numR);
					
					break;
					
				case 3:
					
					System.out.println("Diga primer número");
					aux=sc.nextLine();
					numOp1=Integer.parseInt(aux);
					
					System.out.println("Diga segundo número");
					aux=sc.nextLine();
					numOp2=Integer.parseInt(aux);
					
					numR= numOp1 * numOp2;
					
					System.out.println("El resultado es "+ numR);
					
					break;
					
				case 4:
					
					System.out.println("Diga primer número");
					aux=sc.nextLine();
					numOp1=Integer.parseInt(aux);
					
					System.out.println("Diga segundo número");
					aux=sc.nextLine();
					numOp2=Integer.parseInt(aux);
					
					numR= numOp1 / numOp2;
					
					System.out.println("El resultado es "+ numR);
					
					break;
			
			}
		
		}while(opcion!=0);
		

	}

}
