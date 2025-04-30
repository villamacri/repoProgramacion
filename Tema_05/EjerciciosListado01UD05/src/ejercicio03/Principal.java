package ejercicio03;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Alumno> listaClase = new HashSet<Alumno>();
		
		Alumno a1= new Alumno("Jesús", "Zamorano", 1, "111222333A", 7.5);
		Alumno a2= new Alumno("Cristian", "Villalba", 2, "111222333B", 5);
		Alumno a3= new Alumno("Javier", "Gómez", 3, "111222333C", 3.5);
		
		listaClase.add(a1);
		listaClase.add(a2);
		listaClase.add(a3);
		
		
		Clase c = new Clase(listaClase);
		
		System.out.println(c.findByDni("111222333C"));
		
		System.out.println(c.mostrarListado());
		
		
	}

}
