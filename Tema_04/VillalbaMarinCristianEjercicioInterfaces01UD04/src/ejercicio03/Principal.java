package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int tam=15, opcion=0;
		double [] num;
		String aux;
		
		num= new double[tam];
		
		ArrayReales ar=new ArrayReales(num);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Elija que quiere hacer
					 0. Para salir.
					 1. Para rellenar el array.
					 2. Para mostrar el array.
					 3. Para mostrar el valor máximo del array.
					 4. Para mostrar el valor mínimo del array.
					 5. Para mostrar la suma de todos los elementos.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
			
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					ar.rellenarArray();
					System.out.println("Array relleno correctamente");
					break;
					
				case 2:
					ar.mostrarArray();
					break;
					
				case 3:
					System.out.printf("%.2f\n",ar.calcularMaximo());
					break;
					
				case 4:
					System.out.printf("%.2f\n",ar.calcularMinimo());
					break;
					
				case 5:
					System.out.printf("%.2f\n",ar.calcularSumatorio());
					break;
					
				default:
					System.out.println("opcón no válida");
					break;	
			}
			
		}while(opcion!=0);
		System.out.println("Adiós.");
	}

}
