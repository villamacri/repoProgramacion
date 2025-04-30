package ejercicio03;

public class Operaciones {
	
	
	//Es mejor devolver un booleano, pero este no está mal
	/*
	public String positivoNegativo(int num) {
		String resul = null;
		if(num>=0) {
			resul="Positivo";
		}if(num<0) {
			resul="Negativo";
		}
		return resul;
	}
	*/
	
	 public boolean positivoNegativo(int num) {
		 boolean resul = true;
		 if(num>=0) {
			 resul=true;
		 }else {
			 resul=false;
		 }
		 return resul;
	 }
	 
	 public void imprimirResul(boolean resul) {
		 if(resul) {
			 System.out.println("El número es positivo");
		 }else {
			 System.out.println("El número es negativo");
		 }
	 }
	 
	public boolean comprobarParidad(int num) {
		boolean resultado;
		if(num%2==0) {
			resultado = true;
		}else {
			resultado = false;
		}
		return resultado;
	}
	
	public void imprimirParidad(boolean resultado) {
		if(resultado) {
			System.out.println("El número es par");
		}else {
			System.out.println("El número es impar");
		}
	}
}
