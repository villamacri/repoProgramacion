package ejercicio05;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Persona> datos=new HashSet<Persona>();
		
		Persona p1=new Persona("Cristian", "Villalba", "111222333A", "Bogotá", 5);
		Persona p2=new Persona("Marta", "Cabello", "111222333B", "Puebla del Río", 7);
		Persona p3=new Persona("Alejandro", "Mije", "111222333C", "Madrid", 2);

		DatosPersona dp=new DatosPersona(datos);
		
		dp.agregarPersona(p1);
		dp.agregarPersona(p2);
		dp.agregarPersona(p3);
		
		dp.mostrarPersona();
		System.out.println();
		dp.mostrarOrdenado();
		System.out.println();
		dp.mostrarOrdenInverso();
	}

}
