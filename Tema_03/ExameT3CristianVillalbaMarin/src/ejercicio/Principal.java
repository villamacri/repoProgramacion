package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int tam, opcion=0, numProd=2, idLeido, opcionTipo;
		double presupuesto=1500, volMasaLeido, costeCm3;
		boolean tipo;
		String aux, codLeido, saborLeido;
		
		Magdalena m1 = new Magdalena("1A", 1, "Fresa", true, 15.00);
		Magdalena m2 = new Magdalena("1B", 2, "Chocolate", false, 10.00);
		Magdalena m;
		Magdalena [] listado;
		
		System.out.println("Bienvenido, diga el tamaño de la lista");
		aux=sc.nextLine();
		tam=Integer.parseInt(aux);
		
		listado=new Magdalena[tam];
		
		listado[0]=m1;
		listado[1]=m2;
		
		Pasteleria p=new Pasteleria("7 C'up", listado, numProd, presupuesto);
		
		do {
			System.out.println("""
					Elija una opcion
					
					0. Para salir.
					1. Para agregar nueva magdalena.
					2. Para buscar por sabores.
					3. Para buscar una magdalena por id.
					4. Para mostrar la media del volumen de masa usado.
					5. Para calcular el precio de coste de un producto.
					6. Para mostrar solo los cupcakes.
					7. Para calcular porcentaje del presupuesto que se ha gastado en un producto.
					8. Para calcular el coste total de las magdalenas normales. 
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Diga el código de la nueva magdalena");
					codLeido=sc.nextLine();
					
					System.out.println("Diga el id");
					aux=sc.nextLine();
					idLeido=Integer.parseInt(aux);
					
					System.out.println("Diga el sabor");
					saborLeido=sc.nextLine();
					
					System.out.println("Pulse 1 si es un cupcake o cualquier otro numero para indicar que es normal");
					aux=sc.nextLine();
					opcionTipo=Integer.parseInt(aux);
					if(opcionTipo==1) {
						tipo=true;
					}else {
						tipo=false;
					}
					
					System.out.println("Diga el volumen de masa necesario");
					aux=sc.nextLine();
					volMasaLeido=Double.parseDouble(aux);
					
					m=new Magdalena(codLeido, idLeido, saborLeido, tipo, volMasaLeido);
					p.agregarMagdalena(m);
					p.mostrarLista();
					System.out.println();
					System.out.println("Producto agregado con éxito");
					System.out.println();
					break;
					
				case 2:
					System.out.println("Diga el sabor que desea buscar");
					saborLeido=sc.nextLine();
					System.out.println();
					p.mostrarBusquedaSabores(saborLeido);
					System.out.println();
					break;
					
				case 3:
					System.out.println("Introduzca el id de la magdalena a buscar");
					aux=sc.nextLine();
					idLeido=Integer.parseInt(aux);
					
					p.imprimirBuscada(idLeido);
					break;
					
				case 4:
					System.out.printf("La media del volumen de masa usado es %.2fcm^3\n", p.calcularMedia());
					break;
					
				case 5:
					System.out.println("Diga el coste por cm^3 de la masa");
					aux=sc.nextLine();
					costeCm3=Double.parseDouble(aux);
					
					System.out.println("Introduzca el id del producto a calcular");
					aux=sc.nextLine();
					idLeido=Integer.parseInt(aux);
					
					while(p.findById(idLeido)==null) {
						System.out.println("Error, producto no encontrado");
						
						System.out.println("Introduzca el id del producto a calcular");
						aux=sc.nextLine();
						idLeido=Integer.parseInt(aux);
					}
					
					System.out.printf("El precio de coste del producto es %.2f€\n", p.calcularPrecioCoste(idLeido, costeCm3));
					break;
					
				case 6:
					p.mostrarCupcake();
					break;
					
				case 7:
					System.out.println("Introduzca id del producto");
					aux=sc.nextLine();
					idLeido=Integer.parseInt(aux);
					
					while(p.findById(idLeido)==null) {
						System.out.println("Error, producto no encontrado");
						
						System.out.println("Introduzca el id del producto");
						aux=sc.nextLine();
						idLeido=Integer.parseInt(aux);
					}
					
					System.out.println("Diga el coste de la masa");
					aux=sc.nextLine();
					costeCm3=Double.parseDouble(aux);
				
					System.out.println();
					System.out.printf("El porcentaje es de %.2f%%\n", p.calcularPorcInversionMagdalena(idLeido, costeCm3));
					break;
					
				case 8:
					System.out.println("Diga el coste de la masa por cm^3");
					aux=sc.nextLine();
					costeCm3=Double.parseDouble(aux);
					
					System.out.printf("El coste de todas las magdalenas normales es %.2f€", p.calcularPrecioCosteNormales(costeCm3));
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar mi programa, adiós");
	}

}
