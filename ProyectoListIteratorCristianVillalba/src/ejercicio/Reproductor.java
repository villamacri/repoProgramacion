package ejercicio;

import java.util.List;
import java.util.ListIterator;

public class Reproductor {

	private ListIterator<Cancion>playlist;
	private boolean haAvanzado=false;

	public Reproductor(ListIterator<Cancion> playlist) {
		super();
		this.playlist = playlist;
	}

	public ListIterator<Cancion> getPlaylist() {
		return playlist;
	}

	public void setPlaylist(ListIterator<Cancion> playlist) {
		this.playlist = playlist;
	}

	@Override
	public String toString() {
		return "Reproductor [playlist=" + playlist + "]";
	}
	/***************************************/
	//Métodos de la interfaz List Iterator
	/***************************************/
	
	// Agregar
	public void agregarCancion(Cancion c) {
		playlist.add(c);
	}
	
	//Avanzar con el uso de next()
	public Cancion avanzarDeCancion() {
		if(playlist.hasNext()) {
			haAvanzado=true;
			return playlist.next();
		}else {
			return null;
		}
	}
	
	public void mostrarSiguiente() {
		Cancion c=avanzarDeCancion();
		if(c!=null) {
			System.out.println("Reproduciendo "+ c.getTitulo());
		}else {
			System.out.println("Fin de la playlist.");
		}
	}
	
	//Retroceder con el uso de previous()
	public Cancion retrocederDeCancion() {
		if(haAvanzado && playlist.hasPrevious()) {
			playlist.previous();
		}
		if(playlist.hasPrevious()) {
			haAvanzado = false;
			return playlist.previous();
		}
		else {
			return null;
		}
	}
	
	public void mostrarAnterior() {
		Cancion c=retrocederDeCancion();
		if(c!=null) {
			System.out.println("Reproduciendo "+c.getTitulo());
		}else {
			System.out.println("Estás en el principio de la playlist.");
		}
	}
	
	//Eliminar con remove controlando la posición del cursor con previous()
	public boolean eliminarCancionActual() {
		if(playlist.hasPrevious()) {
			playlist.previous();
			playlist.remove();
			return true;
		}else {
			return false;
		}
	}
	
	public void confirmarEliminar() {
		if(eliminarCancionActual()) {
			System.out.println("Canción eliminada");
		}else {
			System.out.println("No hay cancion seleccionada para eliminar");
		}
	}
	
	public void mostrarPlaylist(List<Cancion> pl) {
		for (Cancion cancion : pl) {
			System.out.println(cancion);
		}
	}
	
	public void mostrarDetallesCancion(List<Cancion> pl) {
		int indActual=playlist.previousIndex();
		if(indActual >=0 && indActual<pl.size()) {
			System.out.println(pl.get(indActual));
		}else {
			System.out.println("No hay canción en reproducción");
		}
	}
	
	public void mostrarCancionActual(List<Cancion> pl) {
		int indActual=playlist.nextIndex();
		if(indActual >=0 && indActual<pl.size()) {
			System.out.println(pl.get(indActual).getTitulo());
		}
		playlist.next();
	}
	
	//Reemplazar un elemento de la lista con el método set()
	public void reemplazarActual(Cancion c) {
		if(playlist.hasPrevious()) {
			playlist.previous();
			playlist.set(c);
			playlist.next();
		}
	}
	
}
