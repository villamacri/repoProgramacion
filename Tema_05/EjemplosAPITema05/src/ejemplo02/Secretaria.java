package ejemplo02;

import java.util.Iterator;
import java.util.List;

public class Secretaria {

	private List <Alumno> listAlumnos;//Esto es la interfaz List, no es igual que ArrayList

	public Secretaria(List<Alumno> listAlumnos) {
		super();
		this.listAlumnos = listAlumnos;
	}

	public List<Alumno> getListAlumnos() {
		return listAlumnos;
	}

	public void setListAlumnos(List<Alumno> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listAlumnos=" + listAlumnos + "]";
	}
	
	public void addAlumno(Alumno a) {
		listAlumnos.add(a);
	}
	
	public boolean agregar2(Alumno a) {
		return listAlumnos.add(a);
	}
	
	public int findByDni(String dniBuscado) {
		int buscado=-1;
		boolean encontrado=false;
		
		for (int i = 0; i < listAlumnos.size() && !encontrado; i++) {
			if(dniBuscado.equalsIgnoreCase(listAlumnos.get(i).getDni())) {
				buscado=i;
				encontrado=true;
			}
		}
		return buscado;
	}
	
	public void deleteAlumno(String dniBuscado) {
		if(findByDni(dniBuscado)>=0) {
			listAlumnos.remove(findByDni(dniBuscado));
		}
	}
	
	public void imprimirLista() {
		for (Alumno alumno : listAlumnos) {
			System.out.println(alumno);
		}
	}
	
	public void modificarNotaMedia(String dniBuscado, double notaNueva) {
		if(findByDni(dniBuscado)>=0) {
			listAlumnos.get(findByDni(dniBuscado)).setNotaMedia(notaNueva);
		}
	}
	
	public double calcularNotaMediaTotal() {
		double suma=0;
		for (int i = 0; i < listAlumnos.size(); i++) {
			suma+=listAlumnos.get(i).getNotaMedia();
		}
		return suma/listAlumnos.size();
	}
}
