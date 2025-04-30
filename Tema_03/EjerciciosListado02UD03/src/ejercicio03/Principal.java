package ejercicio03;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		int tam=10, opcion=0;
		double pago=0, precioLeido=0;
		String aux, codLeido, marcaLeida, modeloLeido;
		boolean estVend, estSegundaMano;
		
		Movil [] listado=new Movil[tam];
		
		Movil m;
		Movil m1=new Movil("Samsung","A1" , "A20", false, true, 200.00);
		Movil m2=new Movil("Xiaomi","A2" , "Redmi Note 15", true, false, 450.00);
		
		listado[0]=m1;
		listado[1]=m2;
		
		Vendedor v=new Vendedor(listado, 450.00, 2);
		
		System.out.println("Bienvenido");
		
		do {
			System.out.println("""
					Diga que desea hacer
					
					0. Para salir.
					1. Para contar móviles sin vender.
					2. Para mostrar el precio final de un móvil.
					3. Para mostrar el dinero en el bolsillo.
					4. Para agregar un nuevo móvil.
					5. Mostrar lista.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Móviles sin vender: "+v.comprobarSinVender());
					break;
					
				case 2:
					System.out.println("Diga el codigo del movil");
					codLeido=sc.nextLine();
					
					v.imprimirPrecioF(v.findByCod(codLeido));
					
					System.out.println("Introduzca el pago");
					aux=sc.nextLine();
					pago=Double.parseDouble(aux);
					
					while(pago<v.calcularPrecioFinalUnMovil(v.findByCod(codLeido))) {
						if(pago<0) {
							System.out.println("Error, valor inválido");
							
							System.out.println("Introduzca el pago");
							aux=sc.nextLine();
							pago=Double.parseDouble(aux);
						}else {
							System.out.println("Error, cantidad introducida insuficiente");
							
							System.out.println("Introduzca el pago");
							aux=sc.nextLine();
							pago=Double.parseDouble(aux);
						}
					}
					
					System.out.printf("Su cambio es de %.2f€", v.calcularCambio(v.findByCod(codLeido), pago));
					if(!v.findByCod(codLeido).isVendido()) {
						v.findByCod(codLeido).setVendido(true);
					}
					break;
					
				case 3:
					System.out.printf("Dinero en bolsillo: %.2f€\n", v.calcularDinBolsillo());
					break;
					
				case 4:
					System.out.println("Diga marca");
					marcaLeida=sc.nextLine();
					
					System.out.println("Diga codigo");
					codLeido=sc.nextLine();
					
					System.out.println("Diga modelo");
					modeloLeido=sc.nextLine();
					
					System.out.println("¿Esta vendido el producto? Para confirmar pulse 1, si no pulse otro número");
					aux=sc.nextLine();
					if(aux.equalsIgnoreCase("1")) {
						estVend=true;
					}else {
						estVend=false;
					}
					
					System.out.println("¿Es de segunda mano? Para confirmar pulse 1, si no pulse otro número");
					aux=sc.nextLine();
					if(aux.equalsIgnoreCase("1")) {
						estSegundaMano=true;
					}else {
						estSegundaMano=false;
					}
					
					System.out.println("Diga el precio unitario");
					aux=sc.nextLine();
					precioLeido=Double.parseDouble(aux);
					
					m=new Movil(marcaLeida, codLeido, modeloLeido, estVend, estSegundaMano, precioLeido);
					v.agregarMovil(m);
					
					System.out.println("Agregado con éxito");
					break;
					
				case 5:
					v.imprimirListado();
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
			}
		}while(opcion!=0);
		System.out.println("Gracias por usar el programa");
	}

}
