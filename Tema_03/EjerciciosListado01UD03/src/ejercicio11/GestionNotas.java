package ejercicio11;

public class GestionNotas {

	public double [] ponerNotas(Alumno a, double [] notas) {
		for (int i = 0; i < a.getNotas().length; i++) {
			a.getNotas()[i]=notas[i];
		}
		return a.getNotas();
	}
	
	public void imprimirNotas(Alumno a) {
		String []asignaturas= {"Programación", "Entornos", "Sistemas", "Lenguaje de Marcas", "Base de Datos"};
		
		for (int i = 0; i < a.getNotas().length; i++) {
			System.out.println(asignaturas[i]+": "+a.getNotas()[i]);
		}
	}
	
}
