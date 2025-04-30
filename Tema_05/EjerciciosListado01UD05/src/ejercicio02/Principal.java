package ejercicio02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		String nombre, apellidos, dni, aux;
		int idSocio, cont, opcion;
		double cuotaBase=60.0, suplPista=25.0, pago;
		boolean alquilerPista;
		
		Socio s1=new Socio("Cristian", "Villalba", "111222333A", 3, cuotaBase, true);
		Socio s2=new Socio("Marta", "Cabello", "111222333B", 5, cuotaBase, true);
		Socio s3=new Socio("Jesús", "Zamorano", "111222333C", 1, cuotaBase, false);

		List <Socio> listadoSocio=new ArrayList<Socio>();
		
		Club cl=new Club (listadoSocio);
		CRUDSocio crSocio=new CRUDSocio(listadoSocio);
		
		crSocio.agregarSocio(s1);
		crSocio.agregarSocio(s2);
		crSocio.agregarSocio(s3);
		
		System.out.println("Bienvenido");
		
		
		do {
			System.out.println("""
					Elija una opción:
					
					0. Para salir.
					1. Para agregar nuevo socio.
					2. Para mostrar lista de socios.
					3. Para mostrar datos de un socio.
					4. Para alquilar pista para un socio.
					5. Para pagar la cuota de un socio.
					6. Ordenar listado por ID.
					7. Ordenar listado por nombre.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Introduzca nombre");
					nombre=sc.nextLine();
					
					System.out.println("Introduzca apellidos");
					apellidos=sc.nextLine();
					
					System.out.println("Introduzca DNI");
					dni=sc.nextLine();
					
					System.out.println("Introduzca id de socio");
					aux=sc.nextLine();
					idSocio=Integer.parseInt(aux);
					
					System.out.println("""
							Seleccione una opcion.
							1. Confirmar alquiler de pista.
							2. Rechazar alquiler de pista.
							""");
					aux=sc.nextLine();
					opcion=Integer.parseInt(aux);
					
					while(opcion!=1 && opcion!=2) {
						System.out.println("Opcion no válida");
						System.out.println("""
								Seleccione una opcion.
								1. Confirmar alquiler de pista.
								2. Rechazar alquiler de pista.
								""");
						aux=sc.nextLine();
						opcion=Integer.parseInt(aux);
					}
					if(opcion==1) {
						alquilerPista=true;
					}else {
						alquilerPista=false;
					}
					
					crSocio.agregarSocio(new Socio(nombre, apellidos, dni, idSocio, cuotaBase, alquilerPista));
					
					System.out.println("Socio agregado con éxito.");
					break;
					
				case 2:
					System.out.println(crSocio.mostrarListaSocios());
					break;
					
				case 3:
					System.out.println("Introduzca el dni del socio a buscar");
					dni=sc.nextLine();
					
					crSocio.mostrarDatosSocio(dni);
					break;
					
				case 4:
					cont=3;
					
					System.out.println("Introduzca el dni del socio");
					dni=sc.nextLine();
					
					while(crSocio.findByDni(dni)==null && cont!=0) {
						cont--;
						System.out.println("El usuario no existe");
						System.out.println("Introduzca el dni del socio");
						dni=sc.nextLine();
						
					}
					if(cont==0) {
						System.out.println("Intentos agotados");
					}
					if(crSocio.findByDni(dni).isAlquilerPista()){
						System.out.println("Este usuario ya tiene activado el alquiler");
					}else {
						cl.alquilarPista(crSocio.findByDni(dni));
						System.out.println("Alquiler completado");
					}
					break;
					
				case 5:
					cont=3;
					
					System.out.println("Introduzca el dni del socio");
					dni=sc.nextLine();
					
					while(crSocio.findByDni(dni)==null && cont!=0) {
						cont--;
						System.out.println("El usuario no existe");
						System.out.println("Introduzca el dni del socio");
						dni=sc.nextLine();
						
					}
					if(cont==0) {
						System.out.println("Intentos agotados");
					}if(crSocio.findByDni(dni).isAlquilerPista()) {
						System.out.printf("El importe de la cuota es de %.2f€, introduzca el pago\n", (crSocio.findByDni(dni).getCuotaBase()+suplPista));
						aux=sc.nextLine();
						pago=Double.parseDouble(aux);
						
						while(cont!=0 && pago<(crSocio.findByDni(dni).getCuotaBase()+suplPista)) {
							cont=3;
							cont--;
							System.out.println("Importe no válido");
							System.out.printf("El importe de la cuota es de %.2f€, introduzca el pago\n", (crSocio.findByDni(dni).getCuotaBase()+suplPista));
							aux=sc.nextLine();
							pago=Double.parseDouble(aux);
						}
						if(cont==0) {
							System.out.println("Intentos agotados");
						}else {
							System.out.printf("Cuota abonada, su cambio es de %.2f\n",cl.pagarCuota(crSocio.findByDni(dni), pago, suplPista));
						}
						
					}else {
						System.out.printf("El importe de la cuota es de %.2f€, introduzca el pago\n", (crSocio.findByDni(dni).getCuotaBase()));
						aux=sc.nextLine();
						pago=Double.parseDouble(aux);
						
						while(cont!=0 && pago<(crSocio.findByDni(dni).getCuotaBase())) {
							cont=3;
							cont--;
							System.out.println("Importe no válido");
							System.out.printf("El importe de la cuota es de %.2f€, introduzca el pago\n", (crSocio.findByDni(dni).getCuotaBase()));
							aux=sc.nextLine();
							pago=Double.parseDouble(aux);
						}
						if(cont==0) {
							System.out.println("Intentos agotados");
						}else {
							System.out.printf("Cuota abonada, su cambio es de %.2f\n",cl.pagarCuota(crSocio.findByDni(dni), pago, suplPista));
						}
					}
					break;
					
				case 6:
					crSocio.ordenarListadoSociosID();
					System.out.println(listadoSocio);
					break;
					
				case 7:
					crSocio.ordenarPorNombre();
					System.out.println(listadoSocio);
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
			}
		}while(opcion!=0);
		
		System.out.println("Adiós");
	}

}
