package ejemplopolimorfismo;

public class OperacionesFiguras {

	public double calcularElAreaDeUnaFigura(Figura f) {
		return f.calcularArea();
	}
	
	public double sumarAreas(Figura [] listado) {
		double resultado=0;
		/*Usamos el operador instanceof solo cuando me haga falta, 
		 *en este caso lo usamos para llamar a un método que solo esta
		 *en una clase hija.
		*/
		for (int i = 0; i < listado.length; i++) {
			
		if(listado[i] instanceof Circulo) {
				
			}
			resultado=resultado+calcularElAreaDeUnaFigura(listado[i]);
		}
		
		return resultado;
	}
	
	
}
