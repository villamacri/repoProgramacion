package ejercicio03;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double imp=0, cantFijaTrans=65;
		
		Motocicleta m= new Motocicleta(imp, "ECO", 150);
		Motocicleta m2= new Motocicleta(imp, "tipo C", 50);
		Furgoneta f= new Furgoneta(imp, "tipo B", cantFijaTrans);
		Coche c= new Coche(imp, "cero emisiones", 120);
				
		System.out.println(m.calcularImpuesto()+"€");
		System.out.println(f.calcularImpuesto()+"€");
		System.out.println(c.calcularImpuesto()+"€");
		System.out.println(m2.calcularImpuesto()+"€");
	}

}
