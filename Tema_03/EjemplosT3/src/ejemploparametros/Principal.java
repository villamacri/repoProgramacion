package ejemploparametros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1, y=2;
	
		System.out.println("Valores de x e y antes de la modificación: ");
		System.out.println("x="+x+";y="+y);
		modifyPrimitiveTypes(x, y);
		System.out.println("Valores de x e y después de la modificación");
		System.out.println("x="+x+";y="+y);
	}

	//Aquí se pueden crear métodos estáticos
	private static void modifyPrimitiveTypes(int x, int y) {
		x=5;
		y=10;
	}
}
