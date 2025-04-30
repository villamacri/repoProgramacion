package ejercicio02;

import java.util.*;

public class ComparaPorNombre implements Comparator <Socio>{
	
	public int compare (Socio s1, Socio s2) {
		
		String nombre1 = s1.getNombreYApelldio();
		String nombre2 = s2.getNombreYApelldio();
		
		return (nombre1.toLowerCase().compareTo(nombre2.toLowerCase()));
	}
}
