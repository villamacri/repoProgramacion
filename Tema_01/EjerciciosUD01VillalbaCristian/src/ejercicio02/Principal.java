package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* En tiempos de sequía hay que cuidar el agua de las piscinas y muchas engañan según su forma.
			Calcula y muestra en pantalla el volumen de dos piscinas:
			- Piscina olímpica (50 m de largo por 21 de ancho) y 2,50 de profundidad.
			- Piscina circular de 1,80 de profundidad y 12 metros de radio.
			¿Cuánto costará llenar cada una si el metro cúbico cuesta 1,80 €?
		 * */
		
		double volPiscOlimpica, volPiscCircular;
		double largoPiscOlimpica = 50, anchoPiscOl = 21, profundidadPiscOlimpica=2.50;
		double profundidadPiscCircular=1.80, radioPiscCircular=12, exp=2;
		double costeLlenarMetroCubico=1.80;
		
		System.out.println("Bienvenido");
		
		System.out.println();
		
		volPiscOlimpica = largoPiscOlimpica*anchoPiscOl*profundidadPiscOlimpica;
		
		volPiscCircular = profundidadPiscCircular*Math.PI*Math.pow(radioPiscCircular, exp);
		
		System.out.println("El volumen de la piscina olímpica es " + volPiscOlimpica + " metros cúbicos");
		
		System.out.println();
		
		System.out.println("El volumen de la piscina circular es "+volPiscCircular + " metros cúbicos");
		
		System.out.println();
		
		System.out.println("El coste de llenar la piscina olímpica es " + (volPiscOlimpica*costeLlenarMetroCubico) + " euros");
		
		System.out.println();
		
		System.out.println("El coste de llenar la psicina circular es " + (volPiscCircular*costeLlenarMetroCubico) + " euros");
	}

}
