package ejercicio02;

import java.util.Comparator;

public class CompararPorNombre implements Comparator <Socio>{

	public int compare (Socio s1, Socio s2) {
		String nombre1= s1.getNombre();
		String nombre2= s2.getNombre();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}
}
