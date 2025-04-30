package ejercicio05;

import java.util.Comparator;

public class CompararPorNombreInverso implements Comparator<Persona>{

	
	public int compare(Persona p1, Persona p2) {
		String nombre1=p1.getNombre();
		String nombre2=p2.getNombre();
		return nombre2.toLowerCase().compareTo(nombre1.toLowerCase());
	}
}
