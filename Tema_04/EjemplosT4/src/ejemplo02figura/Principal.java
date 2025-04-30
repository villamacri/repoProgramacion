package ejemplo02figura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura t=new Triangulo("Negro", 2, 4);
		
		System.out.println(t.calcularArea());
		t.imprimirDetalles();
		
		System.out.println(t instanceof Triangulo);
	}

}
