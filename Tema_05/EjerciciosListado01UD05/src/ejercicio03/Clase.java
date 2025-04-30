package ejercicio03;

import java.util.Set;

public class Clase {

	private Set<Alumno>listadoAlum;
	
	public Clase(Set<Alumno> listadoAlum) {
		super();
		this.listadoAlum = listadoAlum;
	}
	
	public Set<Alumno> getListadoAlum() {
		return listadoAlum;
	}

	public void setListadoAlum(Set<Alumno> listadoAlum) {
		this.listadoAlum = listadoAlum;
	}
	
	public boolean agregarAlumno(Alumno a) {
		if(listadoAlum.add(a)) {
			return true;
		}else {
			return false;
		}
	}

	public Alumno findByDni(String dni) {
		
		for (Alumno alumno : listadoAlum) {
			if(alumno.getDni().equalsIgnoreCase(dni)) {
				return alumno;
			}
		}
		return null;
	}
	
	public Set<Alumno> mostrarListado(){
		return listadoAlum;
	}
	
	public void mostrarUnAlumno(String dni) {
		System.out.println(findByDni(dni));
	}
	
	public void modificarNota(String dni,double nota) {
		findByDni(dni).setNota(nota);
	}
	
	public void borrarAlumno(String dni) {
		listadoAlum.remove(findByDni(dni));
	}
	
	public double calcularNotaMediaClase() {
		double suma=0;
		for (Alumno alumno : listadoAlum) {
			suma+=alumno.getNota();
		}
		return suma/listadoAlum.size();
	}
}
