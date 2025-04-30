package ejemplointerfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//IPresa p= new IPresa();
		Anfibio a= new Anfibio();
		Rana r=new Rana();
		Anfibio a2=new Rana();
		IDepredador id=new Rana();
		
		//Probar métodos
		r.huir();
		r.observar();
		r.cazar();
		r.perseguir();
		System.out.println( );
		((Rana)a2).huir();
		((Rana)a2).observar();
		((Rana)a2).cazar();
		((Rana)a2).perseguir();
		((Rana)id).cazar();
	}

}
