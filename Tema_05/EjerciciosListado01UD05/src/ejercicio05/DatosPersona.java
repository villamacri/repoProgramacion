package ejercicio05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DatosPersona{

	private Set <Persona> listadoPersona;

	public DatosPersona(Set<Persona> listadoPersona) {
		super();
		this.listadoPersona = listadoPersona;
	}

	public Set<Persona> getListadoPersona() {
		return listadoPersona;
	}

	public void setListadoPersona(Set<Persona> listadoPersona) {
		this.listadoPersona = listadoPersona;
	}

	@Override
	public String toString() {
		return "DatosPersona [listadoPersona=" + listadoPersona + "]";
	}
	
	public boolean agregarPersona(Persona p) {
		if(listadoPersona.add(p)) {
			return true;
		}else {
			return false;
		}
	}
	
	public void mostrarPersona() {
		for (Persona persona : listadoPersona) {
			System.out.println(persona);
		}
	}
	
	public List<Persona> ordenarPorNombre() {
		List <Persona> listadoPersonaList=new ArrayList<Persona>(listadoPersona);
		Collections.sort(listadoPersonaList);
		return listadoPersonaList;
	}
	
	public void mostrarOrdenado() {
		for (Persona persona : ordenarPorNombre()) {
			System.out.println(persona);
		}
	}
	
	public Set<Persona> ordenarPorNombreInverso(){
		Set <Persona> listadoOrdenado= new TreeSet<Persona>(new CompararPorNombreInverso());
		
		listadoOrdenado.addAll(listadoPersona);
		
		return listadoOrdenado;
		
	}
	
	public void mostrarOrdenInverso() {
		for (Persona persona : ordenarPorNombreInverso()) {
			System.out.println(persona);
		}
	}
	
}
