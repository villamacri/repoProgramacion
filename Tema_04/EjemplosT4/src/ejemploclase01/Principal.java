package ejemploclase01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double base = 1000.0;
		
		Trabajador t= new Trabajador("Cristian","Jefe de equipo");
		Empleado e=new Empleado("Gonzalo","La cabra",1000.0, 15.0);
		Consultor c=new Consultor("Iván","Hijueputa", 26, 50.0);
		
		System.out.println(t);
		System.out.println(c);
		System.out.println(e);
		
		System.out.println(t.calcularPaga(base));
		System.out.println(c.calcularPaga(base));
		System.out.println(e.calcularPaga());
		
		//Llámadas a métodos
		
		c.calcularDias(8);
		
	}

}
