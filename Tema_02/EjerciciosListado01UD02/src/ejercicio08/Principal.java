package ejercicio08;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String contraseña = "Pepote123", contraseñaIng, usuario = "Danvi", usuarioIng;
		
		System.out.println("Bienvenido");
		
		System.out.println("Ingrese el usuario para continuar.");
		usuarioIng=sc.nextLine();
		
		if(usuarioIng.equalsIgnoreCase(usuario)) {
			System.out.println("Ingrese su contraseña.");
			contraseñaIng=sc.nextLine();
			
			if(contraseñaIng.equalsIgnoreCase(contraseña)) {
				
				System.out.println("Contraseña correcta, puede continuar.");
				
			}else {
				System.out.println("Contraseña incorrecta, el programá se cerrará");
				System.out.println("\nAdiós");
				
			}
			
		}else {
			System.out.println("Usuario no encontrado, el programa se cerrará");
			System.out.println("\nAdiós.");
		}
		
	}

}
