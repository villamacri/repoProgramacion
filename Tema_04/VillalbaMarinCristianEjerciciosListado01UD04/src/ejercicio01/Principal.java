package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double porc=20.0;
		
		Ordenador o= new Ordenador(1000, 3.2, 450.0, "MSI");
		Sobremesa s1=new Sobremesa(500, 2.9, 800.0, "Asus", 50.0);
		Sobremesa s2=new Sobremesa(1000, 2.5, 1000.0, "Hp", 50.0);
		Portatil p1=new Portatil(256, 1.9, 500.0, "Lenovo", false, 75.0);
		Portatil p2=new Portatil(2000, 2.3, 1400.0, "AlienWare", true, 75.0);
	
		System.out.println(o.calcularPVP(porc)+"€");
		System.out.println(s1.calcularPVP(porc)+"€");
		System.out.println(s2.calcularPVP(porc)+"€");
		System.out.println(p1.calcularPVP(porc)+"€");
		System.out.println(p2.calcularPVP(porc)+"€");
	}

}
