package ejemplo01;

public class Alumno {

	//Atributos.
	
	private int edad;
	private String nombre;
	private double notaMedia;
	//Los arrays pueden ser atributos de un objeto.
	private double [] notas;
	/*Se pone private en todos los atributos de la clase objeto, todo lo demas es
	 public(métodos, constructores, etc.) hasta que se diga lo contrario
	*/
	
	/*Método en java: Es un trozo de código que hace algo, lo ideal es que solo haga una cosa.
	 *
	 *"Acceso tipoDevolucion Nombre(Parámetros o argumentos){
	 *	}" 
	 *El nombre de los métodos tienen que ser verbos en infinitivo.
	 *En tipo hay que poner un tipo de variable y la devolucion es el resultado del método que se devuelve.
	 *Los parámetros son aquellas variables o datos que hay que darle al método para que haga lo que tiene que hacer.
	*/
	//Constructores
	
	//Métodos
	//Getter and setters
	
	public int getEdad () {
		//Código
		return edad;
	}
	
	/*los métodos que no devuelven nada se ponen com void en tipo de devolucion
	 *Además para guardar una nueva edad pasada por parametro en el atributo del objeto se pone una nueva variable como parámetro
	 *y dentro del método se guarda poniendo un this delante para hacer referencia a que se guarda el parametro dado en el atributo
	 *del objeto
	*/
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
}
