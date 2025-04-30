package ejercicio01;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int opcion = 0, idBuscado, idNuevoP, seccionNuevoP, opcionEstado, numProduc = 2, tam=5;
		double precioNuevoP, costeTransp = 0, porcentaje = 0;
		String aux, nombreNuevoP;
		boolean estadoNuevoP;
		
		Producto p1=new Producto(1, 1, "Fanta N", false, 1);
		Producto p3=new Producto(2, 85.99, "Pantalla Lg", true, 4);
		Producto pAgregado;
		
		Producto [] listado= new Producto[tam];
		listado[0]=p1;
		listado[1]=p3;
		Tienda t;

		t=new Tienda(listado);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Elija una opción.
					
					0.Para salir.
					1.Mostrar lista de productos
					2.Comprobar fragilidad.
					3.Agregar un producto.
					4.Calcular inversión
					5.Calcular PVP de un producto
					6.Calcular ganancias
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1 :
					t.listarProductos();
					break;
					
				case 2:
					System.out.println("Diga el id del producto");
					aux=sc.nextLine();
					idBuscado=Integer.parseInt(aux);
	
					while(idBuscado>listado.length) {
						System.out.println("Error, producto no encontrado.");
						System.out.println("Diga el id del producto");
						aux=sc.nextLine();
						idBuscado=Integer.parseInt(aux);
					}
					t.imprimirFragil(t.findById(idBuscado));

					break;
					
				case 3:
					System.out.println("Introduzca id del producto");
					aux=sc.nextLine();
					idNuevoP=Integer.parseInt(aux);
					
					System.out.println("Introduzca precio de fábrica");
					aux=sc.nextLine();
					precioNuevoP=Double.parseDouble(aux);
					
					System.out.println("Introduzca el nombre del producto");
					nombreNuevoP=sc.nextLine();
					
					System.out.println("Diga si es frágil, pulse 0 para confirmar o cualquier otro número para indicar que no es frágil");
					aux=sc.nextLine();
					opcionEstado=Integer.parseInt(aux);
					if(opcionEstado==0) {
						estadoNuevoP=true;
					}else {
						estadoNuevoP=false;
					}
					
					System.out.println("Diga el número de la sección");
					aux=sc.nextLine();
					seccionNuevoP=Integer.parseInt(aux);
					
					pAgregado=new Producto(idNuevoP, precioNuevoP, nombreNuevoP, estadoNuevoP, seccionNuevoP);
					t.agregarProductoV2(pAgregado, numProduc);
					numProduc++;
//					listado=t.agregarProducto(listado, pAgregado);
//					t.setListado(listado);
//					System.out.println("Producto agregado con éxito");
					break;
					
				case 4:
					System.out.printf("La cantidad invertida es de %.2f€\n", t.calcularInversion());
					break;
					
				case 5:
					System.out.println("Diga el coste del transporte");
					aux=sc.nextLine();
					costeTransp=Double.parseDouble(aux);
					
					System.out.println("Diga el id del producto a calcular");
					aux=sc.nextLine();
					idBuscado=Integer.parseInt(aux);
					
					System.out.println("Diga el porcentaje de ganancia que desea");
					aux=sc.nextLine();
					porcentaje=Double.parseDouble(aux);
					
					System.out.printf("El precio recomendado es de %.2f€\n", t.calcularPVP(t.findById(idBuscado), porcentaje, costeTransp));
					break;
					
				case 6:
					System.out.printf("Las ganancias son de %.2f€\n", t.calcularGanancias(porcentaje, costeTransp));
			}
		}while(opcion!=0);
		
		System.out.println("Adiós");
		
	}

}
