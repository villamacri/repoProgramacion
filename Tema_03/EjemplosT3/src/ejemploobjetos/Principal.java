package ejemploobjetos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double res=0.0, res2=0.0;
		int tam=4;
		double [] notas= {4,9,3,7};
		Alumno a = new Alumno("Cristian", "Villalba", 8, 2);
		Alumno2 a2;
		Secretaria s;
		Secretaria2 s2;
		
		a.calcularMedia();
		
		//Guardando en una variable
		res=a.calcularMedia();
		System.out.printf("La media es: %.2f\n", res);
		
		//Imprimiendo directamente
		System.out.printf("La media es: %.2f\n", a.calcularMedia());
		
		//Usando otra clase, instanciamos un objeto
		//tipo secretaria
		
		s = new Secretaria("San Pedro", a);
		s2 = new Secretaria2("San Pietro");
		
		res2=s2.calcularMedia3(a);
		System.out.printf("La media es: %.2f\n", res2);
		
		//Esto se hace aqui pa probar, de normal los arrays van arriba como siempre OJO.
		
		
		notas = new double[tam];
		
		a2 = new Alumno2("Sebastián", notas);
		//System.out.println(a2.calcularMediaNotas());
		
		
		
		
	}

}
