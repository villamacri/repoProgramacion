package ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		/*Un array List permite guardar datos duplicados
		 *
		List <String> listaNombres= new ArrayList<String>();
		
		listaNombres.add("Luis");
		listaNombres.add("Ángel");
		listaNombres.add("Luis");
		System.out.println(listaNombres);
		*/
		int opcion=0;
		double notaMedia=0;
		String aux, nombre, dni;
		
		Alumno alum1=new Alumno("1111111A", "Carlos Carlitos", 3.5);
		Alumno alum2=new Alumno("2222222A", "Pepe Segura", 7.5);
		Alumno alum3=new Alumno("3333333A", "Ángel Naranjo", 5.5);
		
		List <Alumno> listaAlumnos=new ArrayList<Alumno>();
		
		listaAlumnos.add(alum1);
		listaAlumnos.add(alum2);
		listaAlumnos.add(alum3);
		
		Secretaria sec=new Secretaria(listaAlumnos);
		
		do {
			System.out.println("""
					Elija
					
					0. Para salir.
					1. Para agregar.
					2. Mostrar alumnos.
					3. Mostrar un alumno.
					4. Modificar nota media de un alumno.
					""");
			aux=sc.nextLine();
			opcion=Integer.parseInt(aux);
			
			switch(opcion) {
				case 0:
					System.out.println("Saliendo...");
					break;
					
				case 1:
					System.out.println("Introduzca el nombre del alumno");
					nombre=sc.nextLine();
					
					System.out.println("Introduzca dni");
					dni=sc.nextLine();
					
					System.out.println("Introduzca la nota media");
					aux=sc.nextLine();
					notaMedia=Double.parseDouble(dni);
					
					Alumno alumNuevo = new Alumno(nombre, dni, notaMedia);
					sec.addAlumno(alumNuevo);
					break;
					
				case 2:
					System.out.println("\n===========================Mostrar alumnos===========================");
					sec.imprimirLista();
					break;
					
				case 3:
					System.out.println("\n===========================Mostrar un alumno===========================");
					System.out.println("Indique el dni del alumno que quiere mostrar: ");
					dni=sc.nextLine();
					
					if(sec.findByDni(dni)<0) {
						System.out.println("\nNo encontrado");
					}else {
						System.out.println(sec.getListAlumnos().get(sec.findByDni(dni)));
					}
					break;
					
				case 4:
					System.out.println("\n===========================Modificar alumno===========================");
					
					System.out.println("Diga la nueva nota media");
					aux=sc.nextLine();
					notaMedia=Double.parseDouble(aux);
					
					System.out.println("Diga el dni del alumno");
					dni=sc.nextLine();
					
					sec.modificarNotaMedia(dni, notaMedia);
					System.out.println(sec.getListAlumnos().get(sec.findByDni(dni)));
					break;
					
				case 5:
					System.out.println("Diga el dni del alumno a borrar");
					dni=sc.nextLine();
					
					sec.deleteAlumno(dni);
					break;
					
					default:
						System.out.println("Opción no válida");
						break;
					
					
					
			}
		}while(opcion!=0);
	}

}
