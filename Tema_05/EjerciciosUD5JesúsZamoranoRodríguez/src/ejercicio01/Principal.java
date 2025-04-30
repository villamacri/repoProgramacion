package ejercicio01;
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int eleccion=0, contador=0;
		String titulo, texto;
		List <Nota> listado = new ArrayList<Nota>();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Bienvenido a su bloc de nota personalizado");
		System.out.println("Seleccione la opción que desee");
		System.out.println("0. Para salir\n1. Para ver una nota\n2. Averiguar el numero de notas almacenadas"
				+ "\n3. Agregar nueva nota\n4. Eliminar una nota\n5. Ver toda la lista de notas");
		eleccion = sc.nextInt();
		switch(eleccion) {
			case 0:
				System.out.println("Saliendo...");
				break;
			case 1:
				System.out.println("Introduzca el nombre de la nota");
				
				break;
			case 2:
				break;
			case 3:
				System.out.println("Que titulo desea ponerle a la nota?");
				titulo = sc.next();
				System.out.println("Introduzca el texto");
				texto = sc.next();
				Nota n1 = new Nota (titulo,texto);
				listado.add(n1);
				contador++;
				break;
				
		}
		
		
	}

}
