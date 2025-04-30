package ejercicio02;

import java.util.Collections;
import java.util.List;

public class CRUDSocio {

	private List<Socio> listadoSocios;

	public CRUDSocio(List<Socio> listadoSocios) {
		super();
		this.listadoSocios = listadoSocios;
	}

	public List<Socio> getListadoSocios() {
		return listadoSocios;
	}

	public void setListadoSocios(List<Socio> listadoSocios) {
		this.listadoSocios = listadoSocios;
	}

	@Override
	public String toString() {
		return "CRUDSocio [listadoSocios=" + listadoSocios + "]";
	}
	 
	public boolean agregarSocio(Socio s) {
		if(listadoSocios.add(s)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Socio findByDni(String dni) {
		for (Socio socio : listadoSocios) {
			if(socio.getDni().equalsIgnoreCase(dni)) {
				return socio;
			}
		}
		return null;
	}
	
	public void mostrarDatosSocio(String dni) {
		System.out.println(findByDni(dni));
	}
	
	public List <Socio> mostrarListaSocios() {
		return listadoSocios;
	}
	
	public void ordenarListadoSociosID() {
		Collections.sort(listadoSocios);
	}
	
	public void ordenarPorNombre() {
		//Aqui guardamos la lista que se va a ordenar en una nueva para no perder el orden original
		Collections.sort(listadoSocios, new CompararPorNombre());
	}
}
