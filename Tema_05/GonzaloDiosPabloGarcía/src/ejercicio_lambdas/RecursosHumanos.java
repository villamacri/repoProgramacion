package ejercicio_lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RecursosHumanos {

	List<Trabajador> a;

	public RecursosHumanos(List<Trabajador> a) {
		super();
		this.a = new ArrayList<Trabajador>();
	}
	
	//Metodos
	
	//creas una clase consumer que devuelve un void y le dices que su metodo pinte un syso, despues llamas al método foreach para pintar toda la lista
	 public void mostrarEmpleados() {
	        Consumer<Trabajador> impresor = empleado -> System.out.println(empleado);
	        a.forEach(impresor);
	    }
	 //usas un stream de filtrado y con la lambda le pones la condicion que tu quiere en este caso que el nombre que le pasas coincida con el del empleado y despues con un foreach vas mostrando los que cumplen la condicion
	  public void buscarPorNombre(String nombre) {
	        a.stream().filter(empleado -> empleado.getNombre().equalsIgnoreCase(nombre))
	                .forEach(empleado -> System.out.println(empleado));
	    }
	
	
	  public boolean eliminarEmpleado(int id) {
	        return a.removeIf(empleado -> empleado.getId() == id);
	    }
	
	  //usandola clase function la pasas un trabajador y te devuelve un double y reescribes el metodo con una lambda para que tenga un for que sume en la variable suma y returnee la suma entre la cantidad de trabajadores
	  public Double estadisticas(){
		  
		  Function<List<Trabajador>, Double> calculador = lista -> {
	            double suma = 0;
	            for (Trabajador t : lista) {
	                suma += t.getSueldoMensual();
	            }
	            return  suma / lista.size();
	        };
	        return calculador.apply(a);
	  }
	  //creas una lista auxiliar  y con un predicate al que le indicas la condicion que el selto tiene que ser menor que el pasado y despues un for con el predicate de condicion
	  public List<Trabajador> sueldoMenor(double sueldoMinimo){
		  List<Trabajador> aux= new ArrayList<Trabajador>();
		  Predicate<Trabajador> comparador= trabajador->trabajador.getSueldoMensual()<sueldoMinimo;
		 
		  for (Trabajador trabaja : a) {
			if(comparador.test(trabaja)) {
				aux.add(trabaja);
			}
		}
		return aux;  
		  
	  }
	  public List<Trabajador> masAnios(int anios){
		  List<Trabajador> aux= new ArrayList<Trabajador>();
		  Predicate<Trabajador> comparador= trabajador->trabajador.getAniosEmpresa()>anios;
		 
		  for (Trabajador trabaja : a) {
			if(comparador.test(trabaja)) {
				aux.add(trabaja);
			}
		}
		return aux;  
		  
	  }
		  
	
	  }
	
	

