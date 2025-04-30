package principal;

import controller.ControllerJugador;
import utilidades.Leer;
import vista.Vista;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] carton = ControllerJugador.generarEquis(3, 3);
		String numero;
		ControllerJugador cj = new ControllerJugador();
		
		Vista v = new Vista();
		
		v.imprimirCarton(carton);
		
		System.out.println("Introduzca un número");
		numero = Leer.dato();
		carton = cj.rellenarCartón(carton,numero);
		
		v.imprimirCarton(carton);
		
//		Vista.imprimirCarton();
	}

}
