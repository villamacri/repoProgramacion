package ejercicio02Correcion;

import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio s1 = new Socio ("Ana", 5, "696969D", true);
		Socio s2 = new Socio ("Pedro", 2, "696969D", true);
		Socio s3 = new Socio ("Fernando", 1, "696969D", true);

		List <Socio> listSocios = new ArrayList<Socio>();
		Club datosClub = new Club (listSocios, 1);
		Scanner sc = new Scanner (System.in);
		String dni, nombreYApellido, sexo;
		
		System.out.println("Welcome to the beach Club");
		
		datosClub.altaSocio(s1);
		datosClub.altaSocio(s2);
		datosClub.altaSocio(s3);

		System.out.println(datosClub);
		
		System.out.println("\nPOR ID\n");
//		Collections.sort(listSocios);
		datosClub.ordenarListaID();
		System.out.println(datosClub);
		System.out.println("\nPOR NOMBRE \n");
		datosClub.ordenadarPorNombre();
		System.out.println(datosClub);

//		System.out.println(datosClub.searchSocioDNI("696969D"));
		
//		System.out.println(datosClub.eliminarSocio("696969D"));
//		datosClub.eliminarSocio("696969D");
		
//		System.out.println(datosClub);
		
//		System.out.println("Identifiquese con su DNI");
//		dni = sc.next();  
//		System.out.println("Estos son sus datos" + datosClub.searchDatoSocio(dni));
//		System.out.println("Escriba nuevamente todos sus datos y realice sobre la marcha la modificación a realizar (EL DNI NO SE PUEDE MODIFICAR)");
//		System.out.println("Escriba: Nombre y apellido:");
//		nombreYApellido = sc.next();
//		System.out.println("Indique si es masculino o femenino");
//		sexo = sc.next();
//		
//		datosClub.modificarSocio(dni, nombreYApellido, sexo);
//		System.out.println(datosClub);

	}

}
