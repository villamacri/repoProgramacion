package ejercicio02Correcion;

import java.util.*;

public class Club {

	private List<Socio> listSocios;
	private int id;

	public Club(List<Socio> listSocios, int id) {
		super();
		this.listSocios = listSocios;
		this.id = id;
	}

	public List<Socio> getListSocios() {
		return listSocios;
	}

	public void setListSocios(List<Socio> listSocios) {
		this.listSocios = listSocios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Club [listSocios=" + listSocios + ", id=" + id + "]";
	}

	public boolean altaSocio(Socio addSocio) {

		if (listSocios.add(addSocio)) {
			return true;
		} else {
			return false;
		}
//		listSocios.add(addSocio);
	}
	
	public Socio searchSocioDNI (String DNI) {
		for (Socio socio : listSocios) {
			if(socio.getDNI().equalsIgnoreCase(DNI)) {
				return socio;
			}
		}
		return null;
	}
	
	// NO SE DIFERENCIA CON EL DE ARRIBA
	public Socio searchDatoSocio (String DNI) {
		for (Socio socio : listSocios) {
			if(socio.getDNI().equalsIgnoreCase(DNI)) {
				return socio;
			}
		}
		return null;
	}
	
	// DEVOLVER TODO
	
	public List<Socio> mostrarTodo() {
		return listSocios;
	}
	
	public void modificarSocio (String DNI, String nombreYApellido, String sexo) {
		searchSocioDNI(DNI).setNombreYApelldio(nombreYApellido);
		if(sexo.equalsIgnoreCase("masculino")) {
			searchSocioDNI(DNI).setMasculino(true);
		} else if(sexo.equalsIgnoreCase("femenino")){
			searchSocioDNI(DNI).setMasculino(false);
		}
	}
	
	public boolean eliminarSocio(String DNI) {
		
		if(searchSocioDNI(DNI) != null) {
			listSocios.remove(searchSocioDNI(DNI));
			return true;
		}
		return false;
	}
	
	public void ordenarListaID() {
		Collections.sort(listSocios);
	}
	
	public void ordenadarPorNombre() {
		// SE PUEDE HACER UNA COPIA DE LA LISTA Y GUARDARLO EN OTRO VALOR PARA NO ALTERAR LA LISTA ORIGINAL POR SI LLEGA A PEDIRLO A FUTURO
		Collections.sort(listSocios, new ComparaPorNombre());
	}
}
