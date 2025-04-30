package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Definición silla: Mueble hecho de material resistente y cómodo que se usa para sentarse.
		 * 
		 * String color;
		 * int precio;
		 * double peso;
		 * */
		
		Alumno a= new Alumno();
		
		System.out.println(a.getEdad());
		a.setEdad(18);
		System.out.println(a.getEdad());
	}

}
