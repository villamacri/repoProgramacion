package ejemplopolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//No podemos instanciar un objeta de una clase abstracta.
		//Figura f = new Figura();
		Cuadrado c=new Cuadrado("Cuadrado 1", "Negro", 2);
		Figura f2 = new Cuadrado("Cuadrado 2", "Blanco");
		Figura f3 = new Circulo("Circulo 1", "rojo", 4);

		Figura [] lista= {f2,f2,f3};
		
		OperacionesFiguras op= new OperacionesFiguras();
		
		System.out.println(op.calcularElAreaDeUnaFigura(c));
		System.out.println("La suma es: "+op.sumarAreas(lista));
		
		if(f3 instanceof Circulo) {
			((Circulo)f3).mostrarRadianes();
		}
	}

}
