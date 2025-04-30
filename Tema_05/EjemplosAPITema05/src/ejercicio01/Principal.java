package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto p1=new Producto("Patatas", 2.50, false);
		Producto p2=new Producto("Helado oscuro", 1.20, true);
		Producto p3=new Producto("Fanta", 1.5, false);
		Producto p4=new Producto("Pasta dientes", 4.5, false);
		Producto p6=new Producto("Salchicha", 2.0, true);
		
		List <Producto> listado=new ArrayList<Producto>();
		
		//Agregar
		listado.add(p2);
		System.out.println(listado);
		listado.add(p3);
		listado.add(p4);
		
		//Saber tamaño
		System.out.println("Tamaño actual:"+listado.size());
		listado.add(p1);
		System.out.println(listado);
		System.out.println("Tamaño actual:"+listado.size());
		listado.remove(0);
		System.out.println(listado);
		System.out.println("Tamaño actual:"+listado.size());
		listado.remove(p4);
		System.out.println("Tamaño actual:"+listado.size());
		System.out.println(listado);
		listado.add(p6);
		System.out.println(listado);
		listado.add(0, p4);
		System.out.println(listado);
		
		System.out.println(listado.get(2));
	}

}
